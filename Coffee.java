/**
 * This creates the Coffee Object. It is used by the Table class.
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
import java.awt.geom.Path2D;

public class Coffee implements DrawingObject{
    private double x, y;
    private Trapezoid cup;
    private Path2D.Double handle;

    /**
     * Constructor for the Coffee class, with parameters x and y, respectively.
     * This helps in the construction of the Coffee object/s.
     * 
     * @param x x-coordinate of Coffee
     * @param y y-coordinate of Coffee
     */
    public Coffee(double x, double y){
        this.x = x;
        this.y = y;
        cup = new Trapezoid(x, y, 18, 12, 30, new Color(66,58,58));
        handle = new Path2D.Double();
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Coffee object.
     */
    @Override
    public void draw(Graphics2D g2d){
        cup.draw(g2d);

        handle.moveTo(x+15, y-22);
        handle.curveTo(x+22, y-17, x+22, y-12, x+13, y-8);
        g2d.setStroke(new BasicStroke((float) 2.5));
        g2d.draw(handle);
    }
}
