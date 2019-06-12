package com.lopez.bootcamp.controller;

import java.sql.*;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class LoadDriver {

    public static void main(String[] args) {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT customer_name FROM Customers");

            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...

            if (stmt.execute("SELECT foo FROM bar")) {
                rs = stmt.getResultSet();
            }


            // Now do something with the ResultSet ....

        } catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
    }
}

