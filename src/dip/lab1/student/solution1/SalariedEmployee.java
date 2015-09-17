package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of IEmployee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements IEmployee {
    
    private double annualSalary;
    private double annualBonus;

    
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    

    public final double getAnnualBonus() {
        return annualBonus;
    }

    public final  void setAnnualBonus(double annualBonus) {
         this.annualBonus = ( (annualBonus > 0)? annualBonus: 0);
        
    }

    public final double getAnnualSalary() {
        return annualSalary;
    }

    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = ( (annualSalary > 0)? annualSalary: 0);
        
    }

    @Override
    public final double getAnnualWages() {
        return annualSalary + annualBonus;
    }

}
