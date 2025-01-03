/**
 * This creates a Television object. It has a Mouse Listener object that makes it
 * change its state.
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
import java.io.File;
import javax.sound.sampled.*;

public class Television implements DrawingObject{
    private double w, h;
    private Rectangle outerTV, innerTV, leg1, leg2;    
    private Line antenna1, antenna2;
    private Rainbow rainbow;
    private boolean state = true;
    private File musicPath;

    /**
     * Constructor of the Television class, with parameters x and y, respectively.
     * This is responsible for the initialization of the parameters, and construction of the Television object/s.
     * @param x x-coordinate of Television
     * @param y y-coordinate of Television
     */
    public Television(double x, double y){
        w = 80;
        h = 60;
        outerTV = new Rectangle(x, y, w, h, new Color(90,90,90));
        innerTV = new Rectangle(x+10, y+10, 60, 37.5, new Color(207,207,196));
        antenna1 = new Line(x+w/2, y, x+w/4, y-20, 1.5, new Color(61, 61, 61));
        antenna2 = new Line(x+w/2, y, x+3*w/4, y-20, 1.5, new Color(61, 61, 61));
        leg1 = new Rectangle(x+10, y+60, 5, 7, new Color(111, 78, 55));
        leg2 = new Rectangle(x+65, y+60, 5, 7, new Color(111, 78, 55));
        rainbow = new Rainbow(370, 250);
    }

    @Override
    public void draw(Graphics2D g2d){
        outerTV.draw(g2d);
        if (state){
            innerTV.draw(g2d);
        }
        else{
            rainbow.draw(g2d);
        }
        antenna1.draw(g2d);
        antenna2.draw(g2d);
        leg1.draw(g2d);
        leg2.draw(g2d);
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the construction of the Television object/s.
     */
    public void openTV(){
        if (state){
            state = false;
        }
        else{
            state = true;
        }
    }

    /**
     * This is responsible for the television sound effect.
     * It is called whenever the TV is being turned on or off.
     * 
     * @param location file name of the music file
     */
    public void playTVMusic(String location){
        try {
            musicPath = new File(location);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } 
        catch (Exception e) {
            System.out.println(e);
            }
    }
}