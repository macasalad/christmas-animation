/**
 * This creates a Rectangle object. It serves as a basic shape that helps in creating
 * more complex shapes.
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
import java.awt.geom.*;

public class Rectangle implements DrawingObject{
    private double x, y, w, h;
    private Color color;

    
    /**
     * Constructor of the Rectangle class, with parameters x, y, w, h, and color, respectively.
     * @param x x-coordinate of rectangle
     * @param y y-coordinate of rectangle
     * @param w width of rectangle
     * @param h height of rectangle
     * @param color color of rectangle
     */
    public Rectangle(double x, double y, double w, double h, Color color){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Rectangle object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, w, h);
        g2d.setColor(color);
        g2d.fill(rectangle);
    }
}