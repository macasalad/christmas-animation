/**
 * This is for the creation of the window. It serves as an element in the canvas.
 * It also contains an instantiation of the Snow class.
 * 
	@author Hannah Lei G. Baniqued (230716); Julie Ann Xyrene M. Lalimarmo (233429) 
	@version 06 March 2024
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;

public class Window implements DrawingObject{
    private double x, y;
    private Snow snow;
    private Rectangle outerRectangle, innerRectangle;

    /**
     * Constructor of the Window class, with parameters x, and y, respectively.
     * This is also responsible for the instantiation of the Snow object snow.
     * @param x x-coordinate of window
     * @param y y-coordinate of window
     */
    public Window(double x, double y){
        this.x = x;
        this.y = y;
        snow = new Snow();
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction and rendering of the Window object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        outerRectangle = new Rectangle(x, y, 170, 200, new Color(0,0,0));
        outerRectangle.draw(g2d);

        innerRectangle = new Rectangle(x+10, y+10, 150, 180, new Color(0, 51, 102));
        innerRectangle.draw(g2d);
        
        snow.draw(g2d);
    }
}