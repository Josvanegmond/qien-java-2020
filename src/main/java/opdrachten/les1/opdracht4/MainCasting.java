package opdrachten.les1.opdracht4;

/**
 * Opdracht 1.4:
 * Casting variables
 */
public class MainCasting {

    public static void main(String[] args) {

//        TODO: create a method that prints:
//         - the ticket price
//         - vat price using the calculateVat method from Currencies
//         - total price
//         - all prices must use the given currency sign

        double planeTicketPrice = 139.99;
        String planeDestination = "China";
//        TODO: Uncomment when the method is created
//        printTicketCostAsString(planeTicketPrice, planeDestination, chinaCurrency);

//        FIXME: variable already defined in scope
//        double planeTicketPrice = 84.95;
//        String planeDestination = "Germany";
//        printTicketCostAsString(planeTicketPrice, planeDestination, germanCurrency);
    }

    public static void printTicketCostAsString(double price, String destination, char currency) {
//        TODO: print base ticket cost and destination (replace all brackets and questionmarks)
//            print all prices with given currency sign
        System.out.println("Ticket cost to [destination]: [price]");

//        TODO: print vat cost
        System.out.println("VAT [vat number]%: [calculateVat(?)]");

//        TODO: print total price
        System.out.println("Total ticket cost: [total cost]");
    }
}
