import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.lang.String;


public class Obstacle {
	
	JPanel obstacle = new JPanel();
	int x, y;
	int obstacleWidth = 50, obstacleHeight = 30;
	
	Obstacle (int x, int y, String path) {
		this.x = x;
		this.y = y;
		obstacle.setBounds(x,y,obstacleWidth,obstacleHeight);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			
		}
		JLabel skin = new JLabel(new ImageIcon(img));
		skin.setIcon(new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(obstacleWidth, obstacleHeight, Image.SCALE_DEFAULT)));
		skin.setBounds(0,0,obstacleWidth, obstacleHeight);
		obstacle.add(skin);
		
	}

	public void move (int stepSize) {
		x += stepSize;
		obstacle.setBounds(x, y, obstacleWidth, obstacleHeight);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getHeight() {
		return obstacleHeight;
	}
	
	public int getWidth() {
		return obstacleWidth;
	}
	
}

