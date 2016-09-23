/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author javao
 */
public class VolcanoApplication {
    //the keyword static in a method declaration means that the method is a class method
    //shared by all the objects of that class. Unlike instance method which is focused based
    //on its use by a given object.
    public static void main(String[] args){
        VolcanoRobot dante = new VolcanoRobot();
        VolcanoRobot virgil = new VolcanoRobot();
        
        //instantiate the object by assigning values to its variables/attributes
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        virgil.status = "sentinel";
        virgil.speed = 10;
        virgil.temperature = 100;    
        
        //show robot attributes
        System.out.println("Showing Dante Robot Attributes "); 
        dante.showAttributes();
        System.out.println("\nShowing Virgil Robot Attributes "); 
        virgil.showAttributes();
        
        //change speed attribute value
        System.out.println("\nIncreasing speed to 3.");
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
        
        System.out.println("Volcan");
        
    }
}
