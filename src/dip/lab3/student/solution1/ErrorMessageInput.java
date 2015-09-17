package dip.lab3.student.solution1;


public class ErrorMessageInput implements MessageInputStrategy {

    @Override
    public final String getInputMessage() {
        return "Error ! Error ! Error! ";
    }
    
}
