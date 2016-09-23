/* Solution to Chapter 19, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.io.*;
import nu.xom.*;

public class XmlCustomerReader {
    
    public XmlCustomerReader() {
        try {
            Builder bob = new Builder();
            File xml = new File("customer-report.xml");
            Document doc = bob.build(xml);

            // Get the file's root element
            Element root = doc.getRootElement();

            // Get all of the <customer> elements and loop through them
            Elements customers = root.getChildElements("customer");
            for (int i = 0; i < customers.size(); i++) {
                // Get a <customer> element
                Element customer = customers.get(i);                
                Element id = customer.getFirstChildElement("id");
                Element name = customer.getFirstChildElement("name");
                Element city = customer.getFirstChildElement("city");
                Element state = customer.getFirstChildElement("state");
                System.out.println("ID: " + id.getValue());
                System.out.println("Name: " + name.getValue());
                System.out.println("City: " + city.getValue());
                System.out.println("State: " + state.getValue());
                System.out.println();
            }
        } catch (ParsingException | IOException exc) {
            System.out.println("Error: " + exc.getMessage());
            exc.printStackTrace();
        }
    }
       
    public static void main(String[] arguments) {
        new XmlCustomerReader();
    }
}
