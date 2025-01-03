/**
 * This is where the elements are being drawn. It is instantiated by the
 * SceneFrame class.
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
import javax.swing.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent{
    private Background background;
    private Window window;
    private ChristmasTree christmasTree;
    private Television television;
    private HangingTable hangingTable;
    private FirePlace firePlace;
    private Table table;
    private Clock clock;
    private ChristmasLights christmasLights;
    private Fire fire;
    private Steam steam;
    private ArrayList<DrawingObject> elements;

     /**
     * Constructor of the SceneCanvas class, with parameters w and h, respectively.
     * This is responsible for the construction of the drawing canvas and the objects to be found with it.
     * @param w width of canvas
     * @param h height of canvas
     */
    public SceneCanvas(int w, int h){
        setPreferredSize(new Dimension(w, h));
        background = new Background();
        window = new Window(125,200);
        christmasTree = new ChristmasTree(550, 425);
        christmasLights = new ChristmasLights(100, 73);
        television = new Television(370, 250);
        hangingTable = new HangingTable(320, 317);
        firePlace = new FirePlace(320, 410);
        table = new Table(30,460);
        clock = new Clock(500,160);
        fire = new Fire(390, 475);
        steam = new Steam();

        elements = new ArrayList<DrawingObject>();
        elements.add(background);
        elements.add(window);
        elements.add(christmasTree);
        elements.add(christmasLights);
        elements.add(television);
        elements.add(hangingTable);
        elements.add(firePlace);
        elements.add(table);
        elements.add(clock);
        elements.add(fire);
        elements.add(steam);
    }

    /**
     * Overriden abstract method of the DrawingObject interface.
     * This is responsible for the rendering of the elements on the canvas.
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).draw(g2d);
        }
    }

    /**
     * This is used for the Clock object.
     * It has a return type Clock and returns clock.
     */
    public Clock returnClock(){
        return clock;
    }

    /**
     * This is used for the Christmas Lights object.
     * It has a return type ChristmasLights and returns christmasLights.
     */
    public ChristmasLights returnChristmasLights(){
        return christmasLights;
    }

    /**
     * This is used for the Fire object.
     * It has a return type Fire and returns fire.
     */
    public Fire returnFire(){
        return fire;
    }

    /**
     * This is used for the Steam object.
     * It has a return type Steam and returns steam.
     */
    public Steam returnSteam(){
        return steam;
    }

    /**
     * This is used for the Television object.
     * It has a return type Television and returns television.
     */
    public Television returnTelevision(){
        return television;
    }
    }