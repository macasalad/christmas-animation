/**
 * This is used as an element in the canvas. It has an arraylist of rectangles
 * that draw it.
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

public class FirePlace implements DrawingObject{
    private ArrayList<Rectangle> rectangles;

    /**
     * Constructor for the FirePlace class, with parameters x and y, respectively.
     * This is responsible for the construction of the FirePlace object/s.
     * @param x x-coordinate of the fireplace
     * @param y y-coordinate of the fireplace
     */
    public FirePlace(double x, double y){
        rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(x, y, 200, 15, new Color(194, 58, 34)));
        rectangles.add(new Rectangle(x+5, y+15, 190, 8, new Color(229, 76, 56)));
        rectangles.add(new Rectangle(x+10, y+15+8, 180, 130, new Color(194, 58, 34)));
        rectangles.add(new Rectangle(x+5, y+15+8+130, 190, 8, new Color(229, 76, 56)));
        rectangles.add(new Rectangle(x, y+15+8+130+8, 200, 15, new Color(194, 58, 34)));
        rectangles.add(new Rectangle(x+35, y+15+8+20, 130, 110, new Color(62,76,96)));
    }
    
    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Fireplace object.
     */
    @Override
    public void draw(Graphics2D g2d){
        for (int i = 0; i < rectangles.size(); i++){
            rectangles.get(i).draw(g2d);
        }
    }}