import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.*;
import java.io.IOException;

import javax.swing.SwingUtilities;

public class mainGameplay extends JFrame {
	private Beaver player;

	public mainGameplay() {
		Background bg = null;
		try {
			bg = new Background();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

		bg.setVisible(true);
	}

//	private ArrayList<Log> logs;
//	//constantly check for user key input(which is going to call beaver to move the beaver)
//
//
//	private void collisionEvent() {
//		for (Log log : logs)
//		{
//			//Create two rectangle objects with location/dimensions of objects
//			//And then check for intersection
//		    Rectangle o = new Rectangle(log.getX(),log.getY(), player.getWidth(), log.getHeight());
//		    Rectangle p = new Rectangle(player.getX(), player.getY(), player.getWidth(), player.getHeight());
//
//			    if (detectCollision(o, p))
//		    {
//		       // A Collision!
//		       gameOver();
//		    }
//		}
//	}
//
//	//Checks if two rectangles intersect with each other
//	public boolean detectCollision (Rectangle r, Rectangle p) {
//	    return p.x < r.x + r.width && p.x + p.width > r.x && p.y < r.y + r.height && p.y + p.height > r.y;
//	}
//
//	public void gameOver() {
//
//	}
	
}