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
public class LowerCaseFormatter  implements TextFormatter{
    
    @Override
    public String changeCase(String s){
        return s.toLowerCase();
    }
    
}
