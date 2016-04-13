package com.lwu.design.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionPool extends ObjectPool<Connection> {

    private String url;
    private String usr;
    private String pwd;

    public DBConnectionPool(String driver, String url, String usr, String pwd) {
        super();

        try {
            Class.forName(driver).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }

        this.url = url;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    protected Connection create() {
        try {
            return DriverManager.getConnection(url, usr, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean validate(Connection o) {
        try {
            return !o.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void expire(Connection o) {
        try {
            o.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
