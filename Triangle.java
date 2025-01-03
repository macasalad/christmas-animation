/**
 * This is for the creation of Triangle objects. It is used for the Christmas Tree.
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

public class Triangle implements DrawingObject{
    private double x, y, base, height;
    private Color color;

    public Triangle(double x, double y, double base, double height, Color color){
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
        this.color = color;
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Trapezoid object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(x, y);
        triangle.lineTo(x+base/2, y-height);
        triangle.lineTo(x+base, y);
        triangle.closePath();
        g2d.setColor(color);
        g2d.fill(triangle);
    }
}