package dip.lab2.student.solution1;



/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodTipCalculatorStrategy  implements TipCalculatorStrategy {
   

    private  double minBill = 0.00;
    private String BILL_ENTRY_ERR = "Error: bill must be greater than or equal to " + minBill;
    private double bill;
    private ServiceQuality serviceQuality;

    public FoodTipCalculatorStrategy(ServiceQuality q, double billAmt) {
        this.setServiceQuality(q);
        this.setBill(billAmt);
    }

    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * serviceQuality.GOOD.getRate();
                break;
            case FAIR:
                tip = bill * serviceQuality.FAIR.getRate();;
                break;
            case POOR:
                tip = bill * serviceQuality.POOR.getRate();;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final double getBill() {
        return bill;
    }

    public final void setServiceQuality(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    public final double getMinBill() {
        return minBill;
    }

    public final void setMinBill(double minBill) {
        if(minBill >= 0)
            this.minBill = minBill;
    }

   
}
