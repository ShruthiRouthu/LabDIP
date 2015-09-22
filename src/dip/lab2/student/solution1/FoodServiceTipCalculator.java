package dip.lab2.student.solution1;



/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator  implements TipCalculatorStrategy {
   
    private double goodRate = 0.20;
    private double fineRate = 0.15;
    private double badRate = 0.10;
    private double minBill = 0.00;
    private String BILL_ENTRY_ERR = "Error: bill must be greater than or equal to " + minBill;
    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceQuality(q);
        this.setBill(billAmt);
    }

    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * this.goodRate;
                break;
            case FAIR:
                tip = bill * this.fineRate;
                break;
            case POOR:
                tip = bill * this.badRate;
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
    
    @Override
    public final double getMinBill() {
        return minBill;
    }

    @Override
    public final void setMinBill(double minBill) {
        if(minBill >= 0)
            this.minBill = minBill;
    }

    @Override
    public final void setGoodRate(double goodRate) {
        if(goodRate > 0)
            this.goodRate = goodRate;
    }

    @Override
    public final void setFineRate(double fineRate) {
        if(fineRate > 0)
            this.fineRate = fineRate;
    }

    @Override
    public final void setBadRate(double badRate) {
        if(badRate > 0)
            this.badRate = badRate;
    }
    
     @Override
    public final double getgoodRate() {
        return goodRate;
    }

    @Override
    public final double getFineRate() {
        return fineRate;
    }

    @Override
    public final double getBadRate() {
        return badRate;
    }
   
}
