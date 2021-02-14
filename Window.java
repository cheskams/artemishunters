import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Window extends JFrame{
	JFrame window = new JFrame();
	
	String log = "src/log.png";
	String car = "src/car.png";
	
	public Window() {
		window.setBounds(100, 100, 725, 820);
		window.setLayout(null);
		window.setVisible(true);
	}
	
	
	/* function to populate a lane with obstacles (ie logs or cars)
	 * input: int y = the y coordinate where the lane begins
	 * 		  boolean type = if true, the lane is for LOGS
	 *                       if false, the lane is for CARS
	 */
	public void populate(int y, boolean type) {
		
		String obstacleType;
		if (type)
			obstacleType = log;
		else
			obstacleType = car;
		
		Obstacle one = new Obstacle(-190, y, obstacleType);
		Obstacle two = new Obstacle(-190, y, obstacleType);
		Obstacle three = new Obstacle(-190, y, obstacleType);
		Obstacle four = new Obstacle(-190, y, obstacleType);
		Obstacle five = new Obstacle(-190, y, obstacleType);
		Obstacle six = new Obstacle(-190, y, obstacleType);
		Obstacle seven = new Obstacle(-190, y, obstacleType);
		
		javax.swing.Timer time1 = new javax.swing.Timer(900, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				one.move(50);
			}
		});
		javax.swing.Timer time2 = new javax.swing.Timer(900, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				two.move(50);
			}
		});
		javax.swing.Timer time3 = new javax.swing.Timer(900, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				three.move(50);
			}
		});
		javax.swing.Timer time4 = new javax.swing.Timer(900, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				four.move(50);
			}
		});
		javax.swing.Timer time5 = new javax.swing.Timer(900, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				five.move(50);
			}
		});
		javax.swing.Timer time6 = new javax.swing.Timer(900, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				six.move(50);
			}
		});
		javax.swing.Timer time7 = new javax.swing.Timer(900, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seven.move(50);
			}
		});
		
		
		while (seven.numMoves <= 26) {
			if (one.numMoves == 0) {
				time1.start();
			}
			if (one.numMoves == 7) {
				time2.start();
			}
			if (two.numMoves == 7) {
				time3.start();
			}
			if (three.numMoves == 7) {
				time4.start();
			}
			if (four.numMoves == 7) {
				time5.start();
			}
			if (five.numMoves == 7) {
				time6.start();
			}
			if (six.numMoves == 7) {
				time7.start();
			}
			if (one.numMoves >= 25) {
				time1.stop();
			}
			if (two.numMoves >= 25) {
				time2.stop();
			}
			if (three.numMoves >= 25) {
				time3.stop();
			}
			if (four.numMoves >= 25) {
				time4.stop();
			}
			if (five.numMoves >= 25) {
				time5.stop();
			}
			if (six.numMoves >= 25) {
				time6.stop();
			}
			if (seven.numMoves >= 25) {
				time7.stop();
			}
		}
	}
}
