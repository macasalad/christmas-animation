/**
 * This is responsible for the creation of a Rainbow object. It is used by the Television
 * class. It also changes its state depending on its implemented ActionListener
 * object.
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

public class Rainbow implements DrawingObject{
    private Rectangle[] rainbowColors;
    private Color[] colors = {new Color(255, 159, 140), new Color(255, 212, 147), new Color(255, 255, 173), new Color(24, 255, 177), new Color(169, 188, 255)};

    /**
     * Constructor of the Rainbow class, with parameters x and y, respectively.
     * This is responsible for the construction of the Rainbow objects/.
     * @param x x-coordinate of rainbow object
     * @param y y-coordinate of Rainbow object
     */
    public Rainbow(double x, double y){
        rainbowColors = new Rectangle[5];
        
        for (int i = 0; i < 5; i++){
            rainbowColors[i] = new Rectangle(x+10+12*i, y+10, 12.8, 37.5, colors[i]);
    }  
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Rainbow object.
     */
    @Override
    public void draw(Graphics2D g2d){
        for (int i = 0; i < 5; i++){
            rainbowColors[i].draw(g2d);
        }
    }
}