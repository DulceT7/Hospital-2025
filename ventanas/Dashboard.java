package ventanas;

import javax.swing.JFrame;
import paneles.MenuLateralPanel;
import paneles.TablaPanel;

public class Dashboard extends JFrame {
    
    public Dashboard() {
        // Ventana
        this.setTitle("Dashboard");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Usamos posicionamiento manual

        // Crear y agregar el panel de menú lateral (ejemplo, ancho 200px)
        MenuLateralPanel menuLateral = new MenuLateralPanel();
        menuLateral.getJPanel().setBounds(0, 0, 200, 800);
        this.add(menuLateral.getJPanel());

        // Crear y agregar la tabla (a la derecha del menú)
        TablaPanel tabla = new TablaPanel();
        tabla.setBounds(200, 0, 800, 800); // espacio restante de la ventana
        this.add(tabla); // Agregar el JScrollPane con la JTable

        this.setVisible(true);
    }

    public JFrame getDasFrame() {
        return this;
    }
}
