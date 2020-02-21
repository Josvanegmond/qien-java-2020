package opdrachten.les3.opdracht2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * DO NOT MODIFY THIS CLASS
 * Only call the start() method in the Main class to draw DrawableCircle objects
 */
public class ShapeRunner {

    private static List<DrawableCircle> drawableCircleList;
    private static Timer runnableTimer;

    private static JFrame graphicsFrame = new JFrame();
    static {
        graphicsFrame.setSize(200, 200);
        graphicsFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        graphicsFrame.setLocationRelativeTo(null);
        graphicsFrame.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                if(drawableCircleList != null) {
                    drawableCircleList.forEach(drawableCircle -> {
                        g.setColor(drawableCircle.getColor());
                        g.fillOval(
                            drawableCircle.getX(),
                            drawableCircle.getY(),
                            drawableCircle.getSize(),
                            drawableCircle.getSize());
                    });
                }
            }
        });
    }

    public static void start(List<DrawableCircle> drawableCircleList) throws Exception {
        ShapeRunner.drawableCircleList = drawableCircleList;

        if(runnableTimer != null) {
            throw new Exception("The timer has already started!");
        } else {
            graphicsFrame.setVisible(true);
            runnableTimer = new Timer(1, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    drawableCircleList.forEach(drawableCircle -> {
                        if(drawableCircle instanceof Runnable) {
                            ((Runnable)drawableCircle).run();
                        }
                    });
                    graphicsFrame.repaint();
                }
            });
            runnableTimer.start();
        }
    }
}
