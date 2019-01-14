
package bmrcalculator;

import java.util.Scanner;

/**
 *
 * @author colliensePodder
 */
public class BMRCalculator {

    public static void main(String[] args) {
        
        double weight;
        double height_feet;
        double height_inch;
        double height_total_inch;
        double height_in_cm;
        int age;
        double BMR;
        double BMRwomen;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Weight(kg) :");
        weight = input.nextDouble();
        
        System.out.print("Enter height(feet) :");
        height_feet = input.nextDouble();
        
        System.out.print("Enter height(inch) :");
        height_inch = input.nextDouble();
        
        System.out.print("Enter Age: ");
        age = input.nextInt();
        
        height_total_inch = (height_feet*12)+height_inch;
        height_in_cm = (height_total_inch*2.54);
        
        BMR = Math.round((10 * weight) + (6.25 * height_in_cm) - (5 * age) + 5);
        BMRwomen = Math.round((10 * weight) + (6.25 * height_in_cm) - (5 * age) - 161);
        
        System.out.println("Basal Metabolic rate for Man : "+BMR +" Calories/day");
        
        System.out.println("Basal Metabolic rate for Woman: "+BMRwomen +" Calories/day");
        
    }
    
}
