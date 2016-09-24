/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author javao
 */
public class ch2_2 {
    public static void main(String[] args){
        int x = 9;
        int y = 2;
        
        int resultDivision = (x / y);
        int resultRemainder = (x % y);
        
        String result = "9 divided by 2 is "+resultDivision+" remainder "+resultRemainder;
        
        System.out.println(result);
    }
}
