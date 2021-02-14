//import java.awt.event.KeyListener;
//import java.awt.event.KeyEvent;
//
//public class KeyManagerGUI implements KeyListener
//{
//	//list of keys
//	private boolean[] keys;
//	public boolean up, down, left, right;
//
//    public KeyManagerGUI ()
//	{
//		keys = new boolean[256];
//		up = false;
//		down = false;
//		left = false;
//		right = false;
//	}
//
//	/*event handler for keyBeing typed.
//	 * 
//	 */
//	public void keyTyped(KeyEvent e) 
//	{
//	}
//	/*Checks to see if any given key has been pressed.
//	*@Param KeyEvent e, a key to check if it's being pressed.
//	*/
//	public void keyPressed(KeyEvent e)
//	{
//		//checks if a key has been pressed
////		System.out.println("A key has been pressed!");
//		if(e.getKeyCode() == KeyEvent.VK_W){
//			System.out.println("Up pressed!");
//			up = true;
//		}
//		if(e.getKeyCode() == KeyEvent.VK_S){
//			down = true;
//		}
//		if(e.getKeyCode() == KeyEvent.VK_D){
//		    right = true;
//		}
//		if(e.getKeyCode() == KeyEvent.VK_A){
//			left = true;
//		}
//		
//	}
//	/*Checks to see any given key has been released. 
//	*@Param KeyEvent e, a key to check if it's been released. 
//	*/
//	public void keyReleased(KeyEvent e) 
//	{
//		if(e.getKeyCode() == KeyEvent.VK_W){
//			up = false;
//		}
//		if(e.getKeyCode() == KeyEvent.VK_S){
//			down = false;
//		}
//		if(e.getKeyCode() == KeyEvent.VK_D){
//		    right = false;
//		}
//		if(e.getKeyCode() == KeyEvent.VK_A){
//			left = false;
//		}
//	}
//}