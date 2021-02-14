import java.awt.*;
import javax.swing.*;


public class Log extends Component {

	JPanel log = new JPanel();
	int x, y;
	int logWidth = 20, logHeight = 10;
	
	Log (int x, int y) {
		this.x = x;
		this.y = y;
		log.setBounds(x,y,logWidth,logHeight);
		log.setBackground(Color.black);
		
	}

	public void move (int stepSize) {
		x += stepSize;
		log.setBounds(x, y, logWidth, logHeight);
	}
}
	
