/**
 * This creates the Table in the canvas. It contains an instantiation of the
 * Coffee class.
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

public class Table implements DrawingObject{
    private RoundRectangle2D mainTable, leg1, leg2;
    private Coffee coffee;

    /**
     * Constructor of the Table class, with parameters x and y, respectively.
     * This is responsible for the construction of the Table object/s.
     * @param x x-coordinate of table
     * @param y y-coordinate of table
     */
    public Table(double x, double y){
        mainTable = new RoundRectangle2D.Double(x, y, 250, 25, 20, 20);
        leg1 = new RoundRectangle2D.Double(x+20,y+12,12,100,10,10);
        leg2 = new RoundRectangle2D.Double(x+215,y+12,12,100,10,10);
        coffee = new Coffee(x+125, y);
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Table object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(128, 70, 27));
        g2d.fill(leg1);
        g2d.fill(leg2);
        g2d.setColor(new Color(92, 64, 51));
        g2d.fill(mainTable);
        coffee.draw(g2d);
    }
}
