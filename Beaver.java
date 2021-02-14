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

public class Beaver{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BufferedImage image;
	private JLabel skin;
	private ImageIcon beaver;

    int x, y;

    private int beaverHeight = 100;
    private int beaverWidth = 100;
    

    
    public Beaver(int x, int y){
    	this.x = x;
    	this.y=y;
		image = null;
		try {
			image = ImageIO.read(new File("Beaver.png"));
		} catch (IOException e) {
        }
	 }
    
//    public JPanel getPanel() {
//    	JPanel panel = new JPanel();
//		skin = new JLabel(new ImageIcon(image));
//		//skin = new JLabel();
//		//skin.setBounds(0,0,100,100);
//		beaver = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(beaverWidth, beaverHeight, Image.SCALE_DEFAULT));
//		skin.setIcon(beaver);
//		skin.setBounds(x,y,beaverWidth, beaverHeight);
////		beaver.setFocusable(true);
////        beaver.add(skin);
//        panel.add(skin);
////        frame.setResizable(false);
//        //frame.setSize(725, 820);
//        panel.setLayout(null);
//        panel.setOpaque(false)
//        //frame.setVisible(true);
//		//image = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(beaverWidth, beaverHeight, Image.SCALE_DEFAULT));
//        return panel;
//    }
    
//    @Override public void paintComponent(Graphics g) {
//    	g.drawImage(image, 0, 0, null);
//        repaint();
//   }

    public BufferedImage getImage() {
    	return this.image;
    }
    
    public int getX() {
    	return this.x;
    }
    
    public int getY() {
    	return this.y;
    }
    
    public int getWidth() {
    	return beaverWidth;
    }
    
    public int getHeight() {
    	return beaverHeight;
    }
}