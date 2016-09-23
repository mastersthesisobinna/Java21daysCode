/* Solution to Chapter 19, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.io.*;
import java.sql.*;
import nu.xom.*;

public class XmlCustomerReporter {
    public static void main(String[] arguments) {
       String data = "jdbc:derby://localhost:1527/sample";
       try (
           Connection conn = DriverManager.getConnection(
               data, "app", "app");
            Statement st = conn.createStatement()) {

            Class.forName("org.apache.derby.jdbc.ClientDriver");

            // create the xml element to hold all customers
            Element root = new Element("customers");
            
            // pull all customers from the Derby database
            ResultSet rec = st.executeQuery(
                "select CUSTOMER_ID, NAME, CITY, STATE " +
                "from APP.CUSTOMER " +
                "order by CUSTOMER_ID");
            while (rec.next()) {
                // create an xml element for a customer
                Element customer = new Element("customer");
                // create an XML element for a customer's ID
                Element id = new Element("id");
                // store this record's ID in the ID element
                id.appendChild(rec.getString(1));
                // add the ID to the customer element
                customer.appendChild(id);
                // do the same for name, city and state
                Element name = new Element("name");
                name.appendChild(rec.getString(2));
                customer.appendChild(name);
                Element city = new Element("city");
                city.appendChild(rec.getString(3));
                customer.appendChild(city);
                Element state = new Element("state");
                state.appendChild(rec.getString(4));
                customer.appendChild(state);
                // add the customer to the customers XML element
                root.appendChild(customer);
                System.out.println("Processing customer " + name.getValue());
            }
            st.close();
            // create the XML document
            Document doc = new Document(root);            
            // make the children element its root
            doc.setRootElement(root);
            // create the XML file and a file output stream for it
            File xml = new File("customer-report.xml");
            FileOutputStream xmlFile = new FileOutputStream(xml);
            Serializer output = new Serializer(xmlFile, "ISO-8859-1");
            output.setIndent(4);
            // write the XML document to the file
            output.write(doc);
            xmlFile.close();
            System.out.println("\nSaving file " + xml.getName());
        } catch (SQLException s) {
            System.out.println("SQL Error: " + s.toString() + " "
                + s.getErrorCode() + " " + s.getSQLState());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString()
                + e.getMessage());
        }
    }
}
