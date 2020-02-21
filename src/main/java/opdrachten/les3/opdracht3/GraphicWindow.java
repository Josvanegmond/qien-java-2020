package opdrachten.les3.opdracht3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that opens a graphics window, renders DrawableObjects on the screen and runs the game loop
 */
public abstract class GraphicWindow extends JFrame implements ActionListener, KeyListener {

    //List of DrawableObjects to be drawn and run
    private static List<DrawableObject> drawableObjectList = new ArrayList<DrawableObject>();
    private static Timer timerControl;

    /**
     * GraphicsPanel passes its Graphics object on to any listed DrawableObjects
     */
    private static class GraphicPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            GraphicWindow.drawableObjectList.forEach(drawableObject -> drawableObject.draw(g));
        }
    }

    public GraphicWindow() {
        //add the GraphicPanel to the window layout
        JPanel jPanel = new GraphicPanel();
        setContentPane(jPanel);

        //listen to keystrokes
        addKeyListener(this);

        //set default window properties
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(200, 200);
        setVisible(true);

        //Start a timer that constantly repeats and calls each DrawableObject's run method
        GraphicWindow.timerControl = new Timer(1, this);
        GraphicWindow.timerControl.start();
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        //Call the run method of each listed DrawableObject
        GraphicWindow.drawableObjectList.forEach(drawableObject -> drawableObject.run());

        //redraw the screen
        repaint();
    }

    /**
     * Return the list of DrawableObjects that are drawn on the screen and run in the timer
     * @return List of DrawableObjects
     */
    public final List<DrawableObject> getDrawableObjectList() {
        return GraphicWindow.drawableObjectList;
    }

    /**
     * Return the Timer controlling the game loop
     * @return Timer controlling the game loop
     */
    public final Timer getTimerControl() {
        return GraphicWindow.timerControl;
    }
}
