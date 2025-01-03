/**
 * This is for the creation of the Fire object. It changes its state
 * depending on its implemented ActionListener object.
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
import java.awt.geom.*;

public class Fire implements DrawingObject{
    private double x, y;
    protected boolean state = true;
    private Path2D.Double fire, inner, outer;

    /**
     * Constructor for the Fire class, with parameters x and y, respectively.
     * This is responsible for the instantiation of the Fire object/s.
     * 
     * @param x x-coordinate of the fire
     * @param y y-coordinate of the fire
     */
    public Fire(double x, double y){
        this.x = x;
        this.y = y;
        fire = new Path2D.Double();
        inner = new Path2D.Double();
        outer = new Path2D.Double();
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Fire object.
     */
    @Override
    public void draw(Graphics2D g2d){
        outer.moveTo(x-5,y);
        outer.curveTo(x-45, y+105, x-45+127, y+105+10, x+60, y+35);
        outer.curveTo(x+60, y+35-75, x+60-30, y+35-70+120, x, y);
        g2d.setColor(new Color(255,39,47));
        g2d.fill(outer);

        inner.moveTo(x, y+20);
        inner.curveTo(x-5, y+105, x-45+110, y + 75, x +50, y +35);
        inner.curveTo(x+50, y, x+30,y+70, x,y+20);
        g2d.setColor(new Color(234, 123, 2));
        g2d.fill(inner);
        
        if (state){
            fire.moveTo(x-5,y);
            fire.curveTo(x-45, y+105, x-45+127, y+105+10, x+60, y+35);
            fire.curveTo(x+60, y+35-75, x+60-30, y+35-70+120, x, y);
            g2d.setColor(new Color(234, 123, 2));
            g2d.fill(fire);
    }
    }
    
    /**
     * This is responsible for making the fire move. It changes the state (boolean)
     * of the fire every time it is called.
     */
    public void moveFire(){
        if (state){
            state = false;
        }
        else{
            state = true;
        }
    }
}