package com.mycompany.programa01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Marcos Delgadillo Justin Lestat
public class Programa01 extends JFrame implements ActionListener {

    JButton btnSaludar;
    JTextField texto01;
    JPanel panelPrincipal;

    public static void main(String[] args) {
        Programa01 p = new Programa01();
        p.setVisible(true);
    }

    public Programa01() {
        setTitle("");
        setSize(400, 200);
        setLocationRelativeTo(null); // Centra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel para organizar componentes
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        panelPrincipal.setBackground(new Color(240, 248, 255)); // Color suave

        // Caja de texto personalizada
        texto01 = new JTextField("Escribe tu nombre...");
        texto01.setFont(new Font("Arial", Font.PLAIN, 16));
        texto01.setHorizontalAlignment(JTextField.CENTER);

        // Botón personalizado
        btnSaludar = new JButton("Saludar");
        btnSaludar.setFont(new Font("Arial", Font.BOLD, 16));
        btnSaludar.setBackground(new Color(173, 216, 230)); // Azul claro
        btnSaludar.addActionListener(this);

        // Añadir componentes al panel
        panelPrincipal.add(texto01, BorderLayout.CENTER);
        panelPrincipal.add(btnSaludar, BorderLayout.SOUTH);

        // Añadir panel a la ventana
        add(panelPrincipal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = texto01.getText().trim();
        if (!texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hola " + texto + " 👋");
            texto01.setText(""); // Limpiar campo
        } else {
            JOptionPane.showMessageDialog(this, "Por favor escribe algo 😅");
        }
    }
}
