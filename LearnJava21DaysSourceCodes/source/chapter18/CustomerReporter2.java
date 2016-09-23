/* Solution to Chapter 18, Exercise 1 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.sql.*;

public class CustomerReporter2 {
    public static void main(String[] arguments) {
       String data = "jdbc:derby://localhost:1527/sample";
       try (
           Connection conn = DriverManager.getConnection(
               data, "app", "app");
           Statement st = conn.createStatement()) {

           Class.forName("org.apache.derby.jdbc.ClientDriver");

            ResultSet rec = st.executeQuery(
                "select MANUFACTURER_ID, NAME, CITY, STATE " +
                "from APP.MANUFACTURER " +
                "order by MANUFACTURER_ID");
            while (rec.next()) {
                System.out.println("MANUFACTURER_ID:\t"
                    + rec.getString(1));
                System.out.println("NAME:\t" + rec.getString(2));
                System.out.println("CITY:\t" + rec.getString(3));
                System.out.println("STATE:\t" + rec.getString(4));
                System.out.println();
            }
            st.close();
        } catch (SQLException s) {
            System.out.println("SQL Error: " + s.toString() + " "
                + s.getErrorCode() + " " + s.getSQLState());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString()
                + e.getMessage());
        }
    }
}
