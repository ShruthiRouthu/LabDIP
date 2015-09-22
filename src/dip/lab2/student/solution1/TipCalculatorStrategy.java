
package dip.lab2.student.solution1;

public interface TipCalculatorStrategy {
    
    public abstract double getTip();
    
    public void setMinBill(double minBill);
    
    public double getMinBill();
    
    public void setGoodRate(double goodRate);
    public void setFineRate(double fineRate);
    public void setBadRate(double badRate);
    
    public double getgoodRate();
    public double getFineRate();
    public double getBadRate();
    
}
