package dip.lab1.student.solution1;

public class HourlyEmployee implements IEmployee {
    
 
    public HourlyEmployee() {}
    
        private double hourlyRate;
        private double totalHrsForYear;

        public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
            setHourlyRate(hourlyRate);
            setTotalHrsForYear(totalHrsForYear);
        }

        public final double getHourlyRate() {
            return hourlyRate;
        }

        public final void setHourlyRate(double hourlyRate) {
            this.hourlyRate = ( (hourlyRate > 0)? hourlyRate: 0);
            
        }

        public final double getTotalHrsForYear() {
            return totalHrsForYear;
        }

        public final  void setTotalHrsForYear(double totalHrsForYear) {
           this.totalHrsForYear = ( (totalHrsForYear > 0)? totalHrsForYear: 0);
        }

        @Override
        public final double getAnnualWages() {
            return hourlyRate * totalHrsForYear;
        }

}
