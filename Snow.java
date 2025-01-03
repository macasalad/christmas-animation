/**
 * This is for the creation of a Snow object. It is composed of circles with
 * randomly-generated x- and y-coordinates and sizes.
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
import java.util.Random;

public class Snow implements DrawingObject{
    /**
     * Constructor of the Snow class.
     * Used for instantiating a Snow object.
     */
    public Snow(){
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Snow object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        for (int i = 0; i < 25; i++){
            Random random = new Random();
            int randomX = random.nextInt(272-140) + 140;
            int randomY = random.nextInt(380-210) + 210;
            int randomSize = random.nextInt(10);
            Circle circle = new Circle(randomX, randomY, randomSize, Color.WHITE);
            circle.draw(g2d);
        }
    }
}
