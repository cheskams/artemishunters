import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;

public class Beaver extends Component{

    JPanel beaver = new JPanel();
    int x, y;
    int beaverHeight = 300, beaverWidth = 200;
    KeyManagerGUI keyManager;


    public Beaver(int x, int y){
        this.x = x;
        this.y = y;
        keyManager = new KeyManagerGUI();
		beaver.setBounds(x,y,beaverWidth,beaverHeight);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("Beaver.png"));
		} catch (IOException e) {
        }
        JFrame frame = new JFrame();
		JLabel skin = new JLabel(new ImageIcon(img));
		skin.setIcon(new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(beaverWidth, beaverHeight, Image.SCALE_DEFAULT)));
		skin.setBounds(0,0,beaverWidth, beaverHeight);
        beaver.add(skin);
        frame.add(skin);
        frame.setResizable(false);
        frame.setBounds(100, 100, 725, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public void moveBeaver(){
        while(true){
            System.out.println("Hello!");
            keyManager.check();
            if(keyManager.up == true){
                System.out.println("UP we go!");

                y -= 5;
                beaver.setBounds(x,y,beaverWidth, beaverHeight);
            }
            if(keyManager.down == true){
                y += 5;
                beaver.setBounds(x,y,beaverWidth, beaverHeight);
            }
            if(keyManager.right == true){
                x += 5;
                beaver.setBounds(x,y, beaverWidth, beaverHeight);
            }
            if(keyManager.left == true){
                x -= 5;
                beaver.setBounds(x,y, beaverWidth, beaverHeight);
            }
            
        }
    }
}