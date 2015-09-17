package dip.lab2.student.solution1;

import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup1 {
    
    public static void main(String[] args){
        
        FoodTipCalculatorStrategy f = new  FoodTipCalculatorStrategy(ServiceQuality.POOR, 100);
        BaggageTipCalculatorStrategy b = new BaggageTipCalculatorStrategy(ServiceQuality.GOOD,10,2);
        
        TipCalculatorService service = new TipCalculatorService();
        
        System.out.println(service.getTip(f));
        System.out.println(service.getTip(b));
        
    }

}
