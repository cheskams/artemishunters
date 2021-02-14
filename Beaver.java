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

public class Beaver extends Component implements KeyListener{


	private static final long serialVersionUID = 1L;
	JPanel beaver = new JPanel();
    int x, y;
    private int beaverHeight = 200;
    private int beaverWidth = 200;
	//list of keys
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;

    public Beaver(int x, int y){
        this.x = x;
        this.y = y;
		beaver.setBounds(x,y,beaverWidth,beaverHeight);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("Beaver.png"));
		} catch (IOException e) {
        }
        JFrame frame = new JFrame();
        JLabel skin = new JLabel(new ImageIcon(img));
        frame.addKeyListener(this);
		skin.setIcon(new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(beaverWidth, beaverHeight, Image.SCALE_DEFAULT)));
		skin.setBounds(0,0,beaverWidth, beaverHeight);
        beaver.add(skin);
        frame.add(skin);
        frame.setResizable(false);
        frame.setBounds(100, 100, 725, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

	/*event handler for keyBeing typed.
	 * 
	 */
	public void keyTyped(KeyEvent e) 
	{
	}
	/*Checks to see if any given key has been pressed.
	*@Param KeyEvent e, a key to check if it's being pressed.
	*/
	public void keyPressed(KeyEvent e)
	{
		//checks if a key has been pressed
		System.out.println("A key has been pressed!");
		if(e.getKeyCode() == KeyEvent.VK_W){
			System.out.println("UP UP AND AWAY!");
			y -= 50;
			beaver.setBounds(x,y,beaverWidth, beaverHeight);
			repaint();
		}else if(e.getKeyCode() == KeyEvent.VK_S){
			System.out.println("Move down!");
	        y += 50;
            beaver.setBounds(x,y,beaverWidth, beaverHeight);
            repaint();
		}else if(e.getKeyCode() == KeyEvent.VK_D){
			System.out.println("Move right!");
			x += 50;
            beaver.setBounds(x,y, beaverWidth, beaverHeight);
            repaint();
		}else if(e.getKeyCode() == KeyEvent.VK_A){
			System.out.println("Move left!");
			x -= 50;
			beaver.setBounds(x,y, beaverWidth, beaverHeight);
			repaint();
		}
		
	}
	/*Checks to see any given key has been released. 
	*@Param KeyEvent e, a key to check if it's been released. 
	*/
	public void keyReleased(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_W){
			up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			down = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_D){
		    right = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			left = false;
		}
	}
}