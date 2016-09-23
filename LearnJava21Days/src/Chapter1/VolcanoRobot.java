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
public class VolcanoRobot {
    //define three instance variables
    public String status;
    int speed;
    float temperature;
    
    //instance method 1
    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
        }
    }
    
    //instance method 2
    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
    
}
