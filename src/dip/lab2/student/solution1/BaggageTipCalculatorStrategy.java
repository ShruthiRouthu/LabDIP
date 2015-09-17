package dip.lab2.student.solution1;

public class BaggageTipCalculatorStrategy  implements TipCalculatorStrategy{
  
    private String BILL_ENTRY_ERR =
            "Error: bill must be between " + this.minBill + " and "
            + this.maxBill;
   

    private double minBill = 0.00;
    private double maxBill = 100.00;
    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;

    public BaggageTipCalculatorStrategy(ServiceQuality q, int bagCount) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bagCount);
        this.baseTipPerBag = 1.0; // set default value
    }

    public BaggageTipCalculatorStrategy( ServiceQuality q ,  int bagCount, double baseTipPerBag) {
        this.setServiceRating(q);  // perform validation
        this.setBagCount(bagCount);
        this.setBaseTipPerBag(baseTipPerBag);
    }

  
  
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + serviceQuality.GOOD.getRate());
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + serviceQuality.GOOD.getRate());
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + serviceQuality.GOOD.getRate());
                break;
        }

        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
    
    public final double getMinBill() {
        return minBill;
    }

    public final void setMinBill(double minBill) {
        if(minBill >= 0)
            this.minBill = minBill;
    }

    public final double getMaxBill() {
        return maxBill;
    }

    public final void setMaxBill(double maxBill) {
        if(maxBill > minBill)
            this.maxBill = maxBill;
    }

}
