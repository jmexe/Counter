package com.jmexe;

import com.jmexe.util.CounterManager;

import java.sql.SQLException;

/**
 * Created by Jmexe on 10/10/14.
 */
public class TestMain {
    public static void main(String[] args) {
        try {
            long ts = System.currentTimeMillis()/1000;
            CounterManager.addRecord(ts, "", 1, "", "", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
