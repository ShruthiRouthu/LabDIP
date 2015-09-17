package dip.lab3.student.solution1;

import java.util.Random;


public class FunnyQuoteInput implements MessageInputStrategy {

    private String[] funnyQuotes = {
        "I love deadlines. I like the whooshing sound they make as they fly by.",
        "Always remember that you are absolutely unique. Just like everyone else.",
        "People who think they know everything are a great annoyance to those of us who do." 
    };
    
    
    @Override
    public final String getInputMessage() {
       int random = new Random().nextInt(3) ;
       return this.funnyQuotes[random];  
    }
    
    
         
    
}
