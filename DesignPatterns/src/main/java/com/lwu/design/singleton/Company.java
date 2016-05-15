package com.lwu.design.singleton;

/**
 * Created by Leon on 5/15/16.
 */
public class Company {
    private static Company company;

    private static Object lock = new Object();

    public static Company getInstance() {
        if(company == null) {
            synchronized(lock) {
                if(company == null) {
                    company = new Company();
                }
            }
        }

        return company;
    }
}
