
package dip.lab3.student.solution1;


public class MessageService {
    
    public  final void sendMessage(MessageInputStrategy ip , MessageOutputStrategy op)
    {
        op.ouputMessage(ip.getInputMessage());
    }
    
        
    
}
