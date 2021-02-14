import java.awt.Component;
import java.awt.Point;

import javax.swing.SwingUtilities;

public class mainGameplay {
	private Beaver player;
	//constantly check for user key input(which is going to call beaver to move the beaver)
	//
	

	private void collisionEvent() {
		
	}
	
	private void getBeaverPosition() {
		Point pt = new Point(player.getLocation()); 
		SwingUtilities.convertPointToScreen(pt, player);
	}
	
	private void getLogPosition() {
		
	}
}