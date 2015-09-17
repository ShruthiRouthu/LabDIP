/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changecase;

/**
 *
 * @author Professional
 */
public class Startup {
    
    public static void main(String[] args){
        
        TextFormatter formatter = new TitleCaseFormatter();
        FormatService service = new FormatService();
       // service.setFormatter(formatter);
        
        String result = service.changeCase("HELLO WORLD", formatter);
        System.out.println(result);

    }
    
}
