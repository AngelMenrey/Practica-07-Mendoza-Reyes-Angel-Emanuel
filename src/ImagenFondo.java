import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends  JPanel{
private Image image;
private ImageIcon imageIcon;
    
public ImagenFondo(String ruta){
imageIcon = new ImageIcon(ruta);    
}
public void paint( Graphics g){
image = imageIcon.getImage();
g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
setOpaque(false);
super.paint(g);
}
}
