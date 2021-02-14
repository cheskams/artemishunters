import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.*;
 
public class Beaver extends Component{

    final BufferedImage image = ImageIO.read(new File(Beaver.png));

    JPanel pane = new JPanel();

    protected void paintComponent(Graphics g){
        super.paintComponent(Graphics g);
        g.drawImage(image, 0, 0, null);
    }





    public Beaver(int x, int y){
        this.x = x;
		this.y = y;
        icon.setBounds(x,y,beaverWidth,beaverHeight);
        paintComponent(Graphics g);
        
    }

    public static void moveBeaver(KeyMangerGUI keyManager){
        while(true){
            keyManager.check();
            if(keyManager.up == true){

            }
            
        }
    }






 
    

}