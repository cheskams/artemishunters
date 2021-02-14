//import java.util.*;
//import java.util.Timer;
//import java.util.TimerTask;
//
//import javax.swing.JFrame;
//
//public class game {
//public static void main(String[] args) {
//	
//		Count count = new Count();
//		List<Obstacle> logLane = new ArrayList<Obstacle>();
//		
//		for (int j = 0; j < 10; j++) {
//			logLane.add(new Obstacle(0,10,"src/log.png"));
//		}
//		
//		JFrame window = new JFrame("test");
//		window.setBounds(500,500,500,500);
//		window.setLayout(null);
//		window.setVisible(true);
//		
//		Obstacle temp = logLane.get(1);
//		//Obstacle temp2 = logLane.get(0);
//		window.add(temp.obstacle);
//		
////		Timer timer2 = new Timer();
///*		TimerTask tt = new TimerTask() {
//			public void run() {
//				while (temp.numMoves <= 6) {
//					temp.move(20);	
//				}
//			}
//		}; */
//		
//		while (temp.numMoves <= 5) {
//			Timer timer = new Timer();
//			timer.schedule(new TimerTask() {
//				public void run() {
//					if (temp.numMoves <= 1) {
//					temp.move(10);
//					}
//				}
//			}, 900, 900);
//		}
//		
//		
//			/*
//			window.add(temp2.obstacle);
//			while (i > 2) {
//				Timer timer2 = new Timer();
//				timer2.schedule(new TimerTask() {
//					public void run() {
//						temp2.move(10);
//					}
//				}, 900, 900);
//			}
//		}
//*/
//		
//		/*for (int i = 0; i < 10; i++) {
//			Obstacle before = logLane.get(i-1);
//			window.add(before.obstacle);
//			for (int j = 0; j < 5; j++) {
//				Timer timer = new Timer();
//				timer.schedule(new TimerTask() {
//					public void run() {
//						before.move(10);
//					}
//				}, 900, 900);
//			}
//			Obstacle temp = logLane.get(i);
//			window.add(temp.obstacle);
//			for (int r = 0; r < 5; r++) {
//				Timer timer = new Timer();
//				timer.schedule(new TimerTask() {
//					public void run() {
//						temp.move(10);
//					}
//				}, 900, 900);
//			}
//		} */
//	}	
//}
