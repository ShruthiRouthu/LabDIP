
package dip.lab3.student.solution1;
import java.util.Random;
public class StartUp {
    
    
    public static void main(String[] args){
        
        MessageService msgService = new MessageService();
        
        msgService.sendMessage(new ErrorMessageInput(), new ConsoleOutput());
        msgService.sendMessage(new WelcomeMessageInput(), new JOptionPaneOutput());
        msgService.sendMessage(new FunnyQuoteInput(), new JOptionPaneOutput());
    }
    
}
