/**
 * This is for the Steam object. It is used by the Coffee class. It changes its state
 * based on its implemented ActionListener object.
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

import java.awt.geom.*;
import java.awt.*;

public class Steam implements DrawingObject{
    private double x, y;
    protected boolean state = false;

    /**
     * Constructor of the Steam class.
     * Initializes x and y values of the Steam object/s.
     */
    public Steam(){
        x = 130;
        y = 460;
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Steam object/s.
     */
    @Override
    public void draw(Graphics2D g2d) {
        if (state) {
            // steam
            for (int i = 0; i < 3; i++) {
                Path2D.Double steam = new Path2D.Double();
                steam.moveTo(x+18+13*i, y-38);
                steam.curveTo(x+13*i, y-45, x+48+13*i, y-55, x+18+13*i, y-60);
                g2d.setStroke(new BasicStroke((float) 4));
                g2d.setColor(new Color(255,255,255,175));
                g2d.draw(steam);
            }
        }
        else {
            for (int i = 0; i < 3; i++) {
                Path2D.Double steam = new Path2D.Double();
                steam.moveTo(x+18+13*i, y-38);
                steam.curveTo(x+48+13*i, y-45, x+13*i, y-55, x+18+13*i, y-60);
                g2d.setStroke(new BasicStroke((float) 4));
                g2d.setColor(new Color(255,255,255,175));
                g2d.draw(steam);
            }
        }
    }

    /**
     * This is responsible for changing the lights. It changes the state (boolean)
     * of the lights every time it is called.
     */
    public void moveSteam() {
        if (state) {
            state = false;
        }
        else {
            state = true;
        }
    }

}
