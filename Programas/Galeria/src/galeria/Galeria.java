package galeria;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * //Marcos Delgadillo Justin Lestat
 */

public class Galeria extends JFrame implements ActionListener {

    PanelImagen pi;
    JPanel pbotones;
    JButton btnatras, btnadelante;
    String nuevaImagen;
    int contador = 1;

    public static void main(String[] args) {
        Galeria galeria = new Galeria();
        galeria.setVisible(true);
    }

    public Galeria() {
        setTitle("Galería de Imágenes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nuevaImagen = "gato" + contador + ".jpg";

        pi = new PanelImagen();
        pi.setRuta(nuevaImagen);

        pbotones = new JPanel();
        btnatras = new JButton("Atrás");
        btnadelante = new JButton("Adelante");

        btnatras.addActionListener(this);
        btnadelante.addActionListener(this);

        pbotones.add(btnatras);
        pbotones.add(btnadelante);

        add(pi, BorderLayout.CENTER);
        add(pbotones, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnatras) {
            contador = (contador <= 1) ? 3 : contador - 1;
        } else if (e.getSource() == btnadelante) {
            contador = (contador >= 3) ? 1 : contador + 1;
        }

        nuevaImagen = "gato" + contador + ".jpg";
        pi.setRuta(nuevaImagen);
        pi.repaint();
    }
}
