import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

/*
 * This really just draws a Ship object onscreen...not much to see here...move along.
 */
public class LeapDemoFramePollingDrawingArea extends JPanel
{
	public static int WIDTH, HEIGHT;
	private ArrayList<Ship> ships = new ArrayList<Ship>();

	
	public LeapDemoFramePollingDrawingArea(int w, int h)
	{
		WIDTH = w;
		HEIGHT = h;
		setBackground(Color.GREEN);
	}
	
	public void addShip(Ship s)
	{
		ships.add(s);
	}
	//this is the method that actually draws this region of screen...
	//do any custom drawing in here for this region
	public void paintComponent(Graphics g)
	{
		//always call super.paintComponent() in a JPanel subclass
		super.paintComponent(g);
		for(Ship i : ships)
				i.draw(g);
	}
	
	
	
	
	//REQUIRED: the following help fix the size of this JPanel…you will probably have the same 
	//	methods inside any subclass of JPanel that you create.
	public Dimension getSize(){
		return new Dimension( WIDTH, HEIGHT );
	}
	public Dimension getMinimumSize(){
		return getSize();
	}
	public Dimension getMaximumSize(){
		return getSize();
	}
	public Dimension getPreferredSize(){
		return getSize();
	}
	public int getWidth(){
		return WIDTH;
	}
	public int getHeight(){
		return HEIGHT;
	}
}
