import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;
 
public class Beaver{

	int x, y, width, height;

    public static void main(String[] args){
        JPanel panel = new JPanel();
        panel.setSize(500,500);
        //ImageIcon icon = new ImageIcon("Beaver.png");
        // moveBeaver(icon);

    }
    /*public void paintComponent(Graphics g){
        icon.paintIcon(this, g, 0, 0);
    }*/

    public Beaver()
	{
		KeyManagerGUI keyManager = new KeyManagerGUI();
    }
    
    public static void moveBeaver(ImageIcon icon){
        while(true){
            //if(key == 'a'){
                
        }
    }
    
//    public void getLocation() {
//    	
//    }
    
    public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
}