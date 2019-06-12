package com.lopez.bootcamp.controller;

import java.sql.*;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class LoadDriver {

    public static void main(String[] args) {

        try {
            Statement stmt = null;
            ResultSet rs = null;
            Connection conn = null;
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                            "user=minty&password=greatsqldb");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT foo FROM bar");

            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...

            if (stmt.execute("SELECT foo FROM bar")) {
                rs = stmt.getResultSet();
            }

            // Now do something with the ResultSet ....

        } catch (Exception ex) {
            // handle the error
        }
    }
}

