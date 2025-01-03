/**
 * This class is responsible for the Christmas Tree.
    It serves as an element of the canvas, and it contains several
    objects from the Star class and the ChristmasBalls class.
    
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

public class ChristmasTree implements DrawingObject{
    private double x, y;
    private ArrayList<ChristmasBall> christmasBalls;
    private Star star;
    private Gifts gifts;

    /**
     * Constructor for the ChristmasTree class, with parameters x and y,
     * respectively.
     * This is responsible for the construction of the ChristmasTree object/s.
     * 
     * @param x x-coordinate of the ChristmasTree
     * @param y y-coordinate of the ChristmasTree
     */
    public ChristmasTree(double x, double y){
        this.x = x;
        this.y = y;
        christmasBalls = new ArrayList<>();
        christmasBalls.add(new ChristmasBall(675, 380, new Color(226,150,136)));
        christmasBalls.add(new ChristmasBall(600, 470, new Color(226,150,136)));
        christmasBalls.add(new ChristmasBall(665, 460, new Color(167,181,155)));
        christmasBalls.add(new ChristmasBall(600, 390, new Color(167,181,155)));
        christmasBalls.add(new ChristmasBall(630, 340, new Color(116,144,121)));
        christmasBalls.add(new ChristmasBall(633, 420, new Color(116,144,121)));
        star = new Star(1249,510,0.5, new Color(252,208,75));
        gifts = new Gifts(x+35, y+110);
    }

    /**
     * Overridden abstract method of the DrawingObjects interface.
     * This is responsible for the construction of the ChristmasTree object.
     */
    @Override
    public void draw(Graphics2D g2d){
        for (int i = 0; i < 3; i++){
            Triangle triangle = new Triangle(x, y+50*i, 200, 150, new Color(85,107,47));
            triangle.draw(g2d);
        }

        Rectangle trunk = new Rectangle(x+85, y+100, 30, 60, new Color(92, 64, 51));
        trunk.draw(g2d);

        for (int i = 0; i < christmasBalls.size(); i++){
            christmasBalls.get(i).draw(g2d);
        }
        
        star.draw(g2d);
        gifts.draw(g2d);
    }
}