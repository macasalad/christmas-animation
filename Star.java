/**
 * This is for the creation of a Star object. It is used by the Christmas Tree class.
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

public class Star implements DrawingObject{
    private double x, y, size;
    private Color color;

    /**
     * Constructor of the Star class, with parameters x, y, size, and color, respectively.
     * @param x x-coordinate of the star
     * @param y y-coordinate of the star
     * @param size size of the star
     * @param color color of the star
     */
    public Star(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Star object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        Path2D.Double star = new Path2D.Double();
        star.moveTo(x, y);
        star.lineTo(x+40, y);
        star.lineTo(x+50, y-30);
        star.lineTo(x+65, y);
        star.lineTo(x+100, y);
        star.lineTo(x+73, y+25);
        star.lineTo(x+80, y+60);
        star.lineTo(x+50, y+35);
        star.lineTo(x+20, y+60);
        star.lineTo(x+27, y+25);
        star.closePath();
        g2d.setColor(color);
        g2d.scale(size, size);
        g2d.fill(star);

        g2d.setTransform(reset);
    }}