/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

//import Chapter1.VolcanoRobot; use this to make direct import.
//constructor name will change to the VolcanoRobot class
//in the volcanoRobot class, make the attributes and behavior public for it to work in this class

/**
 *
 * @author javao
 */
public class ch2Main {
    public static void main(String[] args){
        ch2 dante = new ch2();
        
        //instantiate the object by assigning values to its variables/attributes
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        
        dante.showAttributes();
        
        //change speed attribute value
        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        
        //change temperature attribute value
        System.out.println("Changing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();
        
        //check current temperature setting for robot
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
        
        System.out.println("Volcan2");
    }
}
