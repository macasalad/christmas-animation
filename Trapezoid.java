/**
 * This creates Trapezoid objects. It is used for the ceiling, floor, and the cup elements
 * in the canvas.
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

public class Trapezoid implements DrawingObject{
    private double x, y, base1, base2, height;
    private Color color;

    /**
     * Constructor of the Trapezoid class. It instantiates the following:
     * x, y, base1, base2, height, and color.
     * @param x
     * @param y
     * @param base1
     * @param base2
     * @param height
     * @param color
     */
    public Trapezoid(double x, double y, double base1, double base2, double height, Color color){
        this.x = x;
        this.y = y;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double trapezoid = new Path2D.Double();
        trapezoid.moveTo(x, y);
        trapezoid.lineTo(x+((base2-base1)/2), y-height);
        trapezoid.lineTo(x+((base2+base1)/2), y-height);
        trapezoid.lineTo(x+base2, y);
        trapezoid.closePath();
        g2d.setColor(color);
        g2d.fill(trapezoid);
    }
}