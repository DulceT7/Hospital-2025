package ventanas;

import javax.swing.JFrame;
import vistas.TablaPanel; // Asegúrate de importar tu clase TablaPanel

public class Dashboard extends JFrame {
    
    public Dashboard(){
        
        // Ventana
        this.setTitle("Dashware");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // Crear y agregar la tabla
        TablaPanel tabla = new TablaPanel();
        tabla.setBounds(0, 0, 1000, 800); // posición x, y y tamaño ancho, alto
        this.add(tabla); // Agregar la tabla (JScrollPane con JTable)

        this.setVisible(true);
    }

    public JFrame getDasFrame(){
        return this;
    }
}
