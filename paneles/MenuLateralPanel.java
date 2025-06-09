package paneles;
import java.awt.Color;

import javax.swing.*;

public class MenuLateralPanel extends JPanel {

    public MenuLateralPanel(){

        this.setSize(300,1000);
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }
    
    public JPanel getJPanel(){
        return this;
    }
}
