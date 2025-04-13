package galeria;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel {

    String ruta = "gato1.jpg";

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}
