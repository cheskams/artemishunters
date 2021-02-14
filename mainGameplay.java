import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.io.File;
import java.io.IOException;

public class mainGameplay extends JPanel implements KeyListener{
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
//	private JLabel beaver;
	private Background bg;
	private Beaver player;
	private static ImageIcon beaverIcon;
	private JLabel skin = new JLabel();
	private ArrayList<Obstacle> logs;
	private ArrayList<Obstacle> cars;
	private int hearts=3;
	//constantly check for user key input(which is going to call beaver to move the beaver)

	public mainGameplay() {
		this.addKeyListener(this);
		setUpGraphics();
		main();
	}

	public void setUpGraphics() {
		System.out.println("blahblahblahblah");
		bg = null;
		try {
			bg = new Background();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		frame = bg.getBackFrame();
		player = new Beaver(0,0);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("Beaver.png"));
		} catch (IOException e) {
        };
		beaverIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(player.getWidth(), player.getHeight(), Image.SCALE_DEFAULT));
		skin.setIcon(beaverIcon);
		skin.setBounds(player.getX(), player.getY(), player.getWidth(), player.getHeight());
		skin.setBackground(Color.red);
		skin.setOpaque(false);
		frame.add(skin, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

//	public void draw(Graphics g) {
//		g.dispose();
//		g.drawImage(beaver, 0, 0, frame);
//		repaint();
//	}
	
	public void main() {
		
	}

	public void collisionEvent() {
		for (Obstacle car: cars)
		{
			//Create two rectangle objects with location/dimensions of objects
			//And then check for intersection
		    Rectangle o = new Rectangle(car.getX(),car.getY(), car.getWidth(), car.getHeight());
		    Rectangle p = new Rectangle(player.getX(), player.getY(), player.getWidth(), player.getHeight());

			    if (detectCollision(o, p))
		    {
		       // A Collision!
			   minusHeart();
		    }
		}
		for (Obstacle log: logs)
		{
			//Create two rectangle objects with location/dimensions of objects
			//And then check for intersection
		    Rectangle o = new Rectangle(log.getX(),log.getY(), log.getWidth(), log.getHeight());
		    Rectangle p = new Rectangle(player.getX(), player.getY(), player.getWidth(), player.getHeight());
			
		    if (detectCollision(o, p))
		    {
		       //Stay on and move downstream with log
		    } else {
		    	minusHeart();
		    }
		}
	}
	
	//Checks if two rectangles intersect with each other
	public boolean detectCollision (Rectangle r, Rectangle p) {
	    return p.x < r.x + r.width && p.x + p.width > r.x && p.y < r.y + r.height && p.y + p.height > r.y;
	}
	
	public void minusHeart() {
		 hearts -= 1;
			if (hearts > 0) {
				resetGame(hearts);
			} else {
				gameOver();
			}
	}
	
	//Method to refresh game to starting position
	//Takes int number of hearts as parameter,
	//Set as 3 when restarting game or
	//as current number of hearts when using a life
	public void resetGame(int hearts) {
		
	}
	
	public void gameOver() {
		//Options to exit game or reset game
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a': skin.setLocation(skin.getX()-10, skin.getY());
			break;
		case 'd': skin.setLocation(skin.getX()+10, skin.getY());
			break;
		case 'w': skin.setLocation(skin.getX(), skin.getY()-10);
			break;
		case 's': skin.setLocation(skin.getX(), skin.getY()+10);
			break;
	}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}