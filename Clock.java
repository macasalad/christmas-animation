/**
 * This is responsible for making a Clock object. It moves its minute and hour
 * hands based on its implemented ActionListener object.
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
import java.awt.geom.AffineTransform;

public class Clock implements DrawingObject{
    private double x, y, angle1, angle2;
    private Circle outerCircle, innerCircle;
    private Line minuteHand, hourHand;

    /**
     * Constructor of the Clock class, with parameters x and y, respectively.
     * This is responsible for the construction of the Clock object/s.
     * 
     * @param x x-coordinate of clock
     * @param y y-coordinate of clock
     */
    public Clock(double x, double y){
        this.x = x;
        this.y = y;
        angle1 = 0;
        angle2 = 0;
        outerCircle = new Circle(x, y, 100, new Color(29, 28, 26));
        innerCircle = new Circle(x+5, y+5, 90, new Color(207,207,196));
        minuteHand = new Line(x+50,y+50,x+20,y+50,3,Color.BLACK);
        hourHand = new Line(x+50, y+50, x+15, y+50,3,Color.BLACK);
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Clock object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        outerCircle.draw(g2d);
        innerCircle.draw(g2d);

        g2d.rotate(Math.toRadians(angle2), x+50,y+50);
        minuteHand.draw(g2d);
        g2d.setTransform(reset);

        g2d.rotate(Math.toRadians(angle1), x+50, y+50);
        hourHand.draw(g2d);
        g2d.setTransform(reset);
    }

    /**
     * This is responsible for the movement of the minute hand of the Clock object.
     * It increases the angle of the minute hand by 5 degrees.
     */
    public void moveMinuteHand() {
        angle1 += 5;
    }

    /**
     * This is responsible for the movement of the hour hand of the Clock object.
     * It increases the angle of the hour hand by 2 degrees.
     */
    public void moveHourHand() {
        angle2 += 2;
    }
}
