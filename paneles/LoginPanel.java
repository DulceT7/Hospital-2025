package paneles;
import javax.swing.*;

import ventanas.Dashboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import control.LoginControler;

public class LoginPanel{

    private JPanel panelLogin;

    public LoginPanel(){
        panelLogin = new JPanel();
        panelLogin.setSize(500, 800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setLayout(new GridBagLayout());

        // Administrador de diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Titulo
        JLabel titulo = new JLabel("Login");
       titulo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.add(titulo, gbc); 
        
        // Entrada Correo
       JTextField entradaCorreo = new JTextField("");
       entradaCorreo.setSize(new Dimension(100,50));
       gbc.gridx = 1;
       gbc.gridy = 1;
       panelLogin.add(entradaCorreo, gbc);

        // Entrada contraseña
        JPasswordField entradaContraseña = new JPasswordField("");
        entradaContraseña.setSize(new Dimension(500,50));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradaContraseña, gbc);

        // Botón
        JButton btnIngresar = new JButton("Ingresar");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(btnIngresar, gbc);

        // Datos del usuario temporal
        String usuario []= {"dataguite"};
        String contrasenna []= {"gatitos123"};

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                // Recuperar datos
                String entradaUsuario = entradaCorreo.getText();
                String entradaContranna = entradaContraseña.getText();  

                if(new LoginControler().validacionDatos(entradaUsuario, entradaContranna)) {
                    new Dashboard();
                JFrame ventanaPadre = (JFrame) SwingUtilities.getWindowAncestor(panelLogin);
                ventanaPadre.dispose();
                }
                
            }
        });
    }

    public JPanel getPanel(){
        return panelLogin;
    }

}
