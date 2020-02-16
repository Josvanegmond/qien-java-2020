package opdrachten.les1.opdracht2;

/**
 * Opdracht 1.2:
 * Communicate with another class
 */
public class MainShapes {

    public static void main(String[] args) {

        double circleArea = ShapeAreaCalculator.getCircleArea(5);
        int squareArea = 0; // TODO: call method to get area of a square

        System.out.println("Circle area size: " + circleArea);
        System.out.println("Square area size: " + squareArea);


//         TODO: make a new utility class ShapeEdgeCalculator
//          that returns the edge length for circle and square
//          Print the edge lengths of both
        System.out.println("Circle edge length: ?");
        System.out.println("Square edge length: ?");
    }

}
