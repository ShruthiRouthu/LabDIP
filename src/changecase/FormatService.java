
package changecase;

public class FormatService {
    
    private TextFormatter formatter;
    
//    Constructor injection
//  public FormatService(TextFormatter tf){
//        this.formatter = tf;
//  }

    public TextFormatter getFormatter() {
        return formatter;
    }

//  Property Injection
//  public void setFormatter(TextFormatter formatter) {
//        this.formatter = formatter;
//  }

   
//  Method Injection    
    public String changeCase(String s,TextFormatter f){  
        return  f.changeCase(s);  
    }
    
}
