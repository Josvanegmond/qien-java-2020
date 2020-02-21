package opdrachten.les3.opdracht2;

import java.awt.*;

/**
 * DO NOT MODIFY THIS INTERFACE
 * implement the default methods as you see fit
 */
public interface DrawableCircle {

    default Color getColor() {
        return Color.GREEN;
    }

    default int getX() {
        return 0;
    }

    default int getY() {
        return 0;
    }

    default int getSize() {
        return 20;
    }
}
