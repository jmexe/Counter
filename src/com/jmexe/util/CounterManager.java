package com.jmexe.util;

import java.sql.*;

/**
 * Created by Jmexe on 10/10/14.
 */
public class CounterManager {
    private static String db_url = "jdbc:mysql://localhost:3306/util";
    private static String user = "root";
    private static String password = "wtsql2014";

    public static void addRecord(long ts, String url, int type, String msg, String text, String summary) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(db_url, user, password);
        Statement statement = conn.createStatement();
        String sql = String.format("insert into util.records(ts, url, type, msg, text, summary) values(%d, \"%s\", %d, \"%s\", \"%s\", \"%s\");", ts, url, type, msg, text, summary);
        //ResultSet rslt = statement.executeQuery(sql);
        System.out.println(sql);
        statement.execute(sql);
        conn.close();
    }

}
