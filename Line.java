/**
 * This creates a Line object. It serves as a basic shape that helps in creating
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

public class Line implements DrawingObject{
    private double x1, y1, x2, y2, size;
    private Color color;

    /**
     * Constructor of the Line class. It consists
     * of the following parameters: x1, y1, x2, y2, size, and color.
     * 
     * @param x1 first x-coordinate of line
     * @param y1 first y-coordinate of line
     * @param x2 second x-coordinate of line
     * @param y2 second y-coordinate of line
     * @param size size of line
     * @param color color of rectangle
     */
    public Line(double x1, double y1, double x2, double y2, double size, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.size = size;
        this.color = color;
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction and rendering of the Line object.
     */
    @Override
    public void draw(Graphics2D g2d){
        Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke((float) size));
        g2d.draw(line);
    }
}