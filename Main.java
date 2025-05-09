import javax.swing.JFrame;                  // Clase para crear una ventana
import javax.swing.JLabel;                  // Clase para mostrar texto

public class Main {
    public static void main(String[] args) {

        JFrame miVentana = new JFrame();    // Crea una nueva ventana vacía
        miVentana.setTitle("Hospital SCL"); // Título que aparece en la parte superior
        miVentana.setSize(1000, 800);       // Establece el tamaño de la ventana (ancho x alto)

        JLabel texto = new JLabel();        // Crea un componente de texto (etiqueta)
        texto.setText("Hola chikas");       // Texto que se mostrará en la ventana
        miVentana.add(texto);               // Añade el texto a la ventana

        miVentana.setVisible(true);         // Muestra la ventana en pantalla
    }
}
