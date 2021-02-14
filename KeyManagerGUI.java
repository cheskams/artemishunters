import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyManagerGUI implements KeyListener
{
	//list of keys
	private boolean[] keys;
	public boolean up, down, left, right;

    public KeyManagerGUI ()
	{
		keys = new boolean[256];
		up = false;
		down = false;
		left = false;
		right = false;
	}

	/*event handler for keyBeing typed.
	 * 
	 */

	public void check(){
		up = keys[KeyEvent.VK_W];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		down = keys[KeyEvent.VK_S];
	}

	public void keyTyped(KeyEvent e) 
	{
	}
	/*Checks to see if any given key has been pressed.
	*@Param KeyEvent e, a key to check if it's being pressed.
	*/
	public void keyPressed(KeyEvent e)
	{
		//checks if a key has been pressed
		System.out.println("A key has been pressed!");
		keys[e.getKeyCode()] = true;
	}
	/*Checks to see any given key has been released. 
	*@Param KeyEvent e, a key to check if it's been released. 
	*/
	public void keyReleased(KeyEvent e) 
	{
		System.out.println("A Key has been released!");
		//checks if a key has been released
		keys[e.getKeyCode()] = false;
	}
}