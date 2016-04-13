package com.lwu.design.objectpool;

import java.util.*;

public abstract class ObjectPool<T> {
    private long expirationTime;
    private Map<T, Long> locked;
    private Map<T, Long> unlocked;

    public ObjectPool() {
        expirationTime = 30000; // 30 seconds
        locked = new HashMap<T, Long>();
        unlocked = new HashMap<T, Long>();
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);

    public synchronized T checkout() {
        long now = System.currentTimeMillis();

        if(unlocked.size() > 0) {
            Iterator<T> iterator = unlocked.keySet().iterator();
            while(iterator.hasNext()) {
                T instance = iterator.next();
                if((now - unlocked.get(instance)) < expirationTime && validate(instance)) {
                    unlocked.remove(instance);
                    locked.put(instance, now);
                    return instance;
                }

                //The object has expired or not valid
                unlocked.remove(instance);
                expire(instance);
            }
        }

        //no objects available, create a new one.
        T newInstance = create();
        locked.put(newInstance, now);
        return newInstance;
    }

    public synchronized void checkIn(T instance) {
        locked.remove(instance);
        unlocked.put(instance, System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d inUse=%d", unlocked.size(), locked.size());
    }
}
