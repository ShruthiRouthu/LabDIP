package dip.lab2.student.solution1;


public class TipCalculatorService {
    
    public double getTip(TipCalculatorStrategy strategy){
       return  strategy.getTip();
    }
    
    
}
