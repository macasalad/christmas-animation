/**
 * This class is responsible for the ChristmasBalls to be used in the ChristmasLights class.
 * It serves as an element to the canvas, implementing listeners.
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

public class ChristmasBall implements DrawingObject{

    private Line line;
    private Rectangle rectangle;
    private Circle circle;

    /**
     * Constructor of the ChristmasBall class, with parameters x, y, and color,
     * respectively. Instantiates a line, a rectangle, and a circle for the
     * christmas ball.
     * 
     * @param x     x-coordinate of ChristmasBall
     * @param y     y-coordinate of ChristmasBall
     * @param color color of ChristmasBall
     */
    public ChristmasBall(double x, double y, Color color){
        line = new Line(x+14.75, y, x+14.75, y+5, 2, new Color(105,105,105));
        rectangle = new Rectangle(x+12.5, y+5, 5, 3, new Color(105,105,105));
        circle = new Circle(x+5, y+8,20, color);
    }

    /**
     * Overriden abstract method of the DrawingObjects interface.
     * This is responsible for the construction of the ChristmasBall
     * object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        line.draw(g2d);
        rectangle.draw(g2d);
        circle.draw(g2d);
    }

}
