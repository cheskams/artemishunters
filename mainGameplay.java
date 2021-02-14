import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.*;
import java.io.IOException;

import javax.swing.SwingUtilities;

public class mainGameplay extends JFrame {
	private Beaver player;
	private ArrayList<Obstacle> logs;
	private ArrayList<Obstacle> cars;
	private int hearts=3;
	//constantly check for user key input(which is going to call beaver to move the beaver)

	public mainGameplay() {
		Background bg = null;
		try {
			bg = new Background();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

		bg.setVisible(true);
	}


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
	
}