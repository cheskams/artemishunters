import java.awt.Point;

public class mainGameplay {
	private Beaver player;
	
	

	private void collisionEvent() {
		
	}
	
	private void getBeaverPosition() {
		Point pt = new Point(player.getLocation()); 
		SwingUtilities.convertPointToScreen(pt, component);
	}
	
	private void getLogPosition() {
		
	}
}