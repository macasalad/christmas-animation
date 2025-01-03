/**
 * This class is responsible for the ChristmasLights.
    It serves as an element of the canvas, and is used in the ChristmasBalls class.
    
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

public class ChristmasLights implements DrawingObject{
    private double x, y;
    private Color[] colors = {new Color(252, 252, 100), new Color(231,212,198), new Color(226,150,136), new Color(167,181,155)}; 
    private boolean state = true;

    /**
     * Constructor of the ChristmasLights class, with parameters x and y,
     * respectively.
     * This is responsible for setting the position/s of the ChristmasBall object/s.
     * 
     * @param x x-coordinate of ChristmasLights
     * @param y y-coordinate of ChristmasLights
     */
    public ChristmasLights(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Overriden abstract method of the DrawingObjects interface.
     * This is responsible for the construction of the ChristmasLights object/s.
     */
    @Override
    public void draw(Graphics2D g2d){
        if (state){
            for (int i = 0; i < 4; i++){
                Path2D.Double cord = new Path2D.Double();
                cord.moveTo(x+150*i, y);
                cord.curveTo(x+50+150*i, y+27, x+50+50+150*i, y+27, x+50+50+50+150*i, y);
                g2d.setColor(Color.BLACK);
                g2d.draw(cord);
    
                for (int j = 0; j < 3; j++){
                    if (j%2 == 1){
                        ChristmasBall christmasBall = new ChristmasBall(x+150*i+7+52*j, 93, colors[0]);
                        christmasBall.draw(g2d);  
                        }
                    else{
                        ChristmasBall christmasBall = new ChristmasBall(x+150*i+7+52*j, 83.5, colors[0]);
                        christmasBall.draw(g2d);  
                    }
            } }}
        else{
            for (int i = 0; i < 4; i++){
                Path2D.Double cord = new Path2D.Double();
                cord.moveTo(x+150*i, y);
                cord.curveTo(x+50+150*i, y+27, x+50+50+150*i, y+27, x+50+50+50+150*i, y);
                g2d.setColor(Color.BLACK);
                g2d.draw(cord);
    
                for (int j = 0; j < 3; j++){
                    if (j%3 == 1){
                        ChristmasBall christmasBall = new ChristmasBall(x+150*i+7+52*j, 93, colors[1]);
                        christmasBall.draw(g2d);  
                        }
                    else if (j%3 == 0){
                        ChristmasBall christmasBall = new ChristmasBall(x+150*i+7+52*j, 83.5, colors[2]);
                        christmasBall.draw(g2d);  
                        }
                
                    else{
                        ChristmasBall christmasBall = new ChristmasBall(x+150*i+7+52*j, 83.5, colors[3]);
                        christmasBall.draw(g2d);  
                    }
        }  }}

    }

    /**
     * This is responsible for changing the lights. It changes the state (boolean)
     * of the lights every time it is called.
     */
    public void changeLights(){
        if (state){
            state = false;
        }
        else{
            state = true;
        }
    }
}