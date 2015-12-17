package kata7v5.application.swing;

import java.util.List;
import javax.swing.JPanel;
import kata7v5.model.Attribute;
import kata7v5.view.AttributeDialog;
import kata7v5.view.PopulationDialog;

public class Toolbar extends JPanel implements PopulationDialog, AttributeDialog {

    @Override
    public List population() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attribute attribute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
