package ventanas;
import javax.swing.JFrame;

public class Dashboard extends JFrame {
    
    public Dashboard(){
        
        // Ventana
        this.setTitle("Dashware");
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.setVisible(true);
    }

    public JFrame getDasFrame(){
    return this;
    }
}
