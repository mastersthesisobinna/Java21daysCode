/*
 * firstYear += (0.4*firstYear) is same as
 * firstYear = firstYear + ((40/100)*firstYear); which is 40 percent increase
 */
package Chapter2;

/**
 *
 * @author javao
 */
public class ch2 {
//define three instance variables
    public static void main(String args[]){
        double initialValue = 14000.00;
        double firstYear = initialValue;
        firstYear += (0.4*firstYear);//first year increase by 40 percent
        double secondYear = firstYear;
        secondYear -= 1500.00;//Lost 1500 in the second year
        double thirdYear = secondYear;
        thirdYear += (0.12*thirdYear);//increase by 12 percent in the third year
        
        System.out.println("Starting Value: "+initialValue);
        System.out.println("First Year increase by 40 percent: "+firstYear);
        System.out.println("Second Year loss by 1500: "+secondYear);
        System.out.println("Third Year increase by 12 percent: "+thirdYear);
        System.out.println("Thank you!...");
    }
}
