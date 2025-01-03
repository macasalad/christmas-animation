/**
    This Background class is for the Background of the canvas. It
    serves as the first and main layer of the drawing.

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

public class Background implements DrawingObject{
    private Rectangle mainBackground;
    private Trapezoid floor, ceiling;

    /**
     * Constructor of the Background class. It instantiates the main background,
     * the floor, and the ceiling.
     */
    public Background(){
        mainBackground = new Rectangle(0, 0, 800, 600, new Color(240, 223, 188));
        floor = new Trapezoid(0, 600, 600, 800, 70, new Color(186, 177, 145));
        ceiling = new Trapezoid(100, 70, 800, 600, 70, new Color(186, 177, 145));
    }

    /**
     * Overriden abstract method of the DrawingObjects interface.
     * This is responsiple for the construction and rendering of the Background object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        mainBackground.draw(g2d);
        floor.draw(g2d);

        for (int i = 0; i < 2; i++){
            Line wallPartition = new Line(100+600*i, 0, 100+600*i, 800, 3, new Color(186, 177, 145));
            wallPartition.draw(g2d);
        }

        ceiling.draw(g2d);
    }
}