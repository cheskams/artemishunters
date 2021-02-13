
public class KeyMangerGUI implements KeyListener
{
	//list of keys
	private boolean[] keys;
    public KeyMangerGUI ()
	{
		keys = new boolean[256];
	}

	/*event handler for keyBeing typed.
	 * 
	 */
	public void keyTyped(KeyEvent e) 
	{
		
	}
	/*Checks to see if any given key has been pressed.
	*@Param KeyEvent e, a key to check if it's being pressed.
	*/
	public void keyPressed(KeyEvent e)
	{
		//checks if a key has been pressed
		keys[e.getKeyCode()] = true;
	}
	/*Checks to see any given key has been released. 
	*@Param KeyEvent e, a key to check if it's been released. 
	*/
	public void keyReleased(KeyEvent e) 
	{
		//checks if a key has been released
		keys[e.getKeyCode()] = false;
	}
}