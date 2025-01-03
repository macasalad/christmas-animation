/**
 * This creates a Circle object. It serves as a basic shape that helps in creating
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

public class Circle implements DrawingObject{
    private double x, y, size;
    private Color color;

    /**
     * Constructor of the Circle class. It consists
     * of the following parameters: x, y, size, and color.
     * 
     * @param x x-coordinate of circle
     * @param y y-coordinate of circle
     * @param size size of circle
     * @param color color of circle
     */
    public Circle(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /**
     * Overriden abstract method of the Drawing interface.
     * This is responsible for the construction of the Circle object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(circle);
    }
}