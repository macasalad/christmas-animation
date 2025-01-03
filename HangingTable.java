/**
 * This creates the HangingTable object. It serves as an element in the canvas.
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

public class HangingTable implements DrawingObject{
    private double x, y;
    private RoundRectangle2D table, leg1, leg2;

    /**
     * Constructor for the HangingTable class, with parameters x and y, respectively.
     * This is responsible for the construction of the HangingTable object/s.
     * @param x x-coordinate of the hanging table
     * @param y y-coordinate of the hanging table
     */
    public HangingTable(double x, double y){
        this.x = x;
        this.y = y;
        table = new RoundRectangle2D.Double(x,y,185,13,10,10);
        leg1 = new RoundRectangle2D.Double(x+17,y+12,12,25,10,10);
        leg2 = new RoundRectangle2D.Double(x+150,y-19,12,25,10,10);
        }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the HangingTable object.
     */
    @Override
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.setColor(new Color(92, 64, 51));
        g2d.rotate(Math.toRadians(-10), x, y);
        g2d.fill(leg1);
        g2d.setTransform(reset);
        
        g2d.rotate(Math.toRadians(-350), x, y);
        g2d.fill(leg2);
        g2d.setTransform(reset);

        g2d.setColor(new Color(128, 70, 27));
        g2d.fill(table);
}
}