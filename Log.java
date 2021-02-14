import java.awt.*;
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
		log.setBackground(Color.black);
		
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
	
