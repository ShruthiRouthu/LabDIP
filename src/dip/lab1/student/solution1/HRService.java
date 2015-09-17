package dip.lab1.student.solution1;

public class HRService {

    public HRService() {}
    
    public final double getAnnualCompensationForEmployee(IEmployee e){
        return e.getAnnualWages();
    }
}
