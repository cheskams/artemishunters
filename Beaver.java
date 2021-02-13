import javax.swing.*;
import java.awt.*;
 
public class Beaver{

    public static void main(String[] args){
        JPanel panel = new JPanel();
        panel.setSize(500,500);
        ImageIcon icon = new ImageIcon("Beaver.png");
        moveBeaver();

    }

    public static moveBeaver(){
        while(1){
            keyEvent event = new KeyEvent();
            char key = keyPressed();
            if(key = 'a'){
                
            }
        }
    }

    public void keyPressed(KeyEvent event){
        char key = event.getKeyChar();
        return key;
    }
    

}