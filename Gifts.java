/**
 * This creates the Gifts. It is used by the ChristmasTree object.
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
import java.util.ArrayList;

public class Gifts implements DrawingObject{
    private Square square;
    private ArrayList<Rectangle> rectangles;

    /**
     * Constructor of the Gifts class, with parameters x and y, respectively.
     * This is responsible for the construction of the Gifts object/s.
     * @param x x-coordinate of the gifts
     * @param y y-coordinate of the gifts
     */
    public Gifts(double x, double y){
        square = new Square(x, y, 50, new Color(214,0,28));
        rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(x+20, y, 10, 50, new Color(242, 242, 242)));
        rectangles.add(new Rectangle(x-5, y-2, 60, 12, new Color(147, 1, 1)));
        rectangles.add(new Rectangle(x+80, y+20, 70, 30, new Color(145, 200, 228)));
        rectangles.add(new Rectangle(x+75, y+15, 80, 10, new Color(70, 130, 169)));
        rectangles.add(new Rectangle(x+130, y+25, 5, 25, new Color(246, 244, 235)));
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Gifts object.
     */
    @Override
    public void draw(Graphics2D g2d){
        square.draw(g2d);
        for (int i = 0; i < rectangles.size(); i++){
            rectangles.get(i).draw(g2d);
        }
    }

}
