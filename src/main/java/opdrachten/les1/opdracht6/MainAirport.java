package opdrachten.les1.opdracht6;

public class MainAirport {

    // TODO: store 4 in a final variable
    private static String[] arrivedFlightTable = new String[4];
    private static String[] incomingFlightTable = new String[4];

    public static void main(String[] args) {

        String flight1 = createNewFlight("KLM1550", "Mexico", "Netherlands");
        String flight2 = createNewFlight("KLM1445", "Japan", "Netherlands");
        String flight3 = createNewFlight("JET1002", "Switzerland", "Netherlands");
        String flight4 = createNewFlight("JET1266", "Germany", "Netherlands");
        String flight5 = createNewFlight("EMI556", "Lebanon", "Netherlands");
        String flight6 = createNewFlight("EMI894", "Egypt", "Netherlands");

        incomingFlight(flight1);
        incomingFlight(flight2);
        incomingFlight(flight3);
        incomingFlight(flight4);
        incomingFlight(flight5);

        arrivedFlight(flight1);
        arrivedFlight(flight2);
        arrivedFlight(flight6);

//         TODO: create a method that prints the given array
//        printFlightTable(incomingFlightTable);
//        printFlightTable(departedFlightTable);
    }

    private static String createNewFlight(String flightNumber, String from, String to) {
//        TODO: create and return a new flight information text
//          - if any String is empty or null, use "NO DATA AVAILABLE"
        return "";
    }

    private static void incomingFlight(String flightText) {
//        TODO: add a new flight to the incoming table
//          - if there is no more space in the array, don't do anything
    }

    private static void arrivedFlight(String flightText) {
//        TODO: add a new flight to the departed table
//          - if the flight is also on the incomingFlightTable, remove it there
//          - if there is no more space in the array, don't do anything
    }

}
