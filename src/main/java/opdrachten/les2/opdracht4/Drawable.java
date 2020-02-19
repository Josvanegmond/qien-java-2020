package opdrachten.les2.opdracht4;

import java.util.Random;

public interface Drawable {

    void setPosition(int x, int y);
    int getPositionX();
    int getPositionY();

    void setColor(String color);
    String getColor();

    void setSize(int width, int height);
    int getWidth();
    int getHeight();

    default void randomize() {
        Random random = new Random();
        setPosition(random.nextInt(800), random.nextInt(800));
        setSize(random.nextInt(20)+5, random.nextInt(20)+5);

        String[] colors = {"#ff0000", "#0000ff", "#00ff00", "#ffff00"};
        setColor(colors[random.nextInt(4)]);
    }
}
