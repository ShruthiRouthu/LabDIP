
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class JOptionPaneOutput   implements MessageOutputStrategy {

    @Override
    public final void ouputMessage(String msg) {
        JOptionPane.showMessageDialog(null,msg);
    }
    
    
    
}
