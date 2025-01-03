/**
 * This is responsible for the setting up of the canvas and various event listeners.
 * It also plays a song played in loop.
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
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas sc;
    protected File musicPath;
    private JButton button;
    private JPanel jpanel;

    /**
     * Constructor of the SceneFrame class. This is responsible for the
     * instantiation of fields frame, button, and jpanel. It also
     * instantiates the Scene Canvas.
     */
    public SceneFrame(){
        frame = new JFrame();
        sc = new SceneCanvas(800, 600);
        button = new JButton("Start Fire!");
        jpanel = new JPanel(new FlowLayout());
    }

    /**
     * This is responsible for setting up the GUI components of the project.
     * It starts the timers for the clock and steam objects. It also adds
     * to the frame the necessary components.
     */
    public void setUpGUI(){
        frame.setTitle("Midterm Project - Baniqued - Lalimarmo");
        clockTimer.start();
        steamTimer.start();
        frame.add(sc, BorderLayout.CENTER);
        jpanel.add(new JLabel("Left-Click the Mouse to Open Lights!"), SwingConstants.CENTER);
        jpanel.add(button);
        jpanel.add(new JLabel("Right-Click the Mouse to Open the TV!"));
        frame.add(jpanel, BorderLayout.SOUTH);
        frame.addMouseListener(mouseListener);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * This is responsible for the ButtonListener and ActionListener object/s of the project.
     * It starts the animation of the elements (Fire, Lights, etc.).
     */
    public class ButtonListener implements ActionListener{
        int counter = 0;
        @Override
        public void actionPerformed(ActionEvent ae) {
            Object o = ae.getSource();
            if (o == button) {
                if (counter % 2 == 0) {
                    fireTimer.start();
                } 
                else {
                    fireTimer.stop();
                }
                counter++;
            }
        }
    }

     /*
     * This is responsible for setting up and instantiation of the ButtonListener/s to be used.
     * It adds a button listener to the button of the project.
     */
    public void setUpListeners(){
        ButtonListener b = new ButtonListener();
        button.addActionListener(b);
    }
    
    ActionListener clockListener = new ActionListener() {
        /**
     * This is an anonymous class.
     * It is responsible for the instantiation of an ActionListener object for the animation of the Clock object/s.
     */
        @Override
        public void actionPerformed(ActionEvent ae){
            sc.returnClock().moveHourHand();
            sc.returnClock().moveMinuteHand();
            sc.repaint();
        }
    };
    
    
    ActionListener lightsListener = new ActionListener(){
        /**
     * This is an anonymous class.
     * It is responsible for the instantiation of an ActionListener object for the animation of the ChristmasLights object/s.
     */
        @Override
        public void actionPerformed(ActionEvent ae){
        sc.returnChristmasLights().changeLights();
        sc.repaint();
    }};

    
    ActionListener fireListener = new ActionListener() {
        /**
     * This is an anonymous class.
     * It is responsible for the instantiation of an ActionListener object for the animation of the Fire object/s.
     */
        @Override
        public void actionPerformed(ActionEvent ae){
            sc.returnFire().moveFire();
            sc.repaint();
    }};

    ActionListener steamListener = new ActionListener(){
        /**
         * This is an anonymous class.
         * It is responsible for the instantiation of an ActionListener object for the animation of the Steam object/s.
         */
        @Override
        public void actionPerformed(ActionEvent ae){
            sc.returnSteam().moveSteam();
            sc.repaint();
    }};

    Timer clockTimer = new Timer(40, clockListener);
    Timer lightsTimer = new Timer(500, lightsListener);
    Timer fireTimer = new Timer(200, fireListener);
    Timer steamTimer = new Timer(700, steamListener);
    
    MouseListener mouseListener = new MouseListener() {
        int counter = 0;
        /**
         * This is an anonymous class. It overrides the mouseClicked method
         * of the MouseListener object.
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            if (SwingUtilities.isLeftMouseButton(e)){
                if (counter % 2 == 0){
                    lightsTimer.start();
                }
                else{
                    lightsTimer.stop();
                }
                counter++;
            }
            else{
                sc.returnTelevision().openTV();
                sc.returnTelevision().playTVMusic("tv_bgm.wav");
                sc.repaint();
            }
        }  
        public void mouseEntered(MouseEvent e) {    
        }  
        public void mouseExited(MouseEvent e) {   
        }  
        public void mousePressed(MouseEvent e) {    
        }  
        public void mouseReleased(MouseEvent e) {   
        }    
};

    /**
     * This is responsible for the overall background music of the project.
     * It also loops the whole music.
     * 
     * @param location file name of the music file
     */
    public void playMusic(String location) {
            try {
                musicPath = new File(location);
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }