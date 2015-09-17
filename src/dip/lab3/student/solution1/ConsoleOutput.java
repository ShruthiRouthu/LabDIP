
package dip.lab3.student.solution1;

public class ConsoleOutput implements MessageOutputStrategy {
    
    private String errorMsg = "Sorry ! Something is wrong :(";

    @Override
    public final void ouputMessage(String msg) {
        if(msg != null)
            System.out.println(msg);
    }

    public final String getErrorMsg() {
        return errorMsg;
    }

    public final void setErrorMsg(String errorMsg) {
        if((errorMsg != null) && (errorMsg.length() > 0))
                this.errorMsg = errorMsg;
    }
    
    

}
