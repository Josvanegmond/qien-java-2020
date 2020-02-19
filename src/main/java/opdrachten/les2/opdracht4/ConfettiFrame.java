package opdrachten.les2.opdracht4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * DO NOT MODIFY THIS CLASS
 * This is a graphics frame used after completing opdracht4
 */
public class ConfettiFrame extends JFrame {

    public ConfettiFrame(Drawable[] drawables) {
        setSize(800, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(
            new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    for (Drawable dr : drawables) {
                        dr.randomize();
                        g.setColor(Color.decode(dr.getColor()));
                        g.fillRect(dr.getPositionX(), dr.getPositionY(), dr.getWidth(), dr.getHeight());
                    }
                }
            }
        );
        setVisible(true);
    }
}
