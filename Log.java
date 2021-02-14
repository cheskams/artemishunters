import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.*;


public class Log {

	JPanel log = new JPanel();
	int x, y;
	int logWidth = 20, logHeight = 10;
	
	Log (int x, int y) {
		this.x = x;
		this.y = y;
		log.setBounds(x,y,logWidth,logHeight);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/log.png"));
		} catch (IOException e) {
		}
		JLabel skin = new JLabel(new ImageIcon(img));
		skin.setIcon(new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(logWidth, logHeight, Image.SCALE_DEFAULT)));
		skin.setBounds(0,0,logWidth, logHeight);
		log.add(skin);
		
	}

	public void move (int stepSize) {
		x += stepSize;
		log.setBounds(x, y, logWidth, logHeight);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getHeight() {
		return logHeight;
	}
	
	public int getWidth() {
		return logWidth;
	}
	
}
	
