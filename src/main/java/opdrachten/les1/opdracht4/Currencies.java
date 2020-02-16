package opdrachten.les1.opdracht4;

/*
    DO NOT MODIFY THIS CLASS!
    Contains settings for currencies
 */
public class Currencies {

    //declare currency variables
    public static final char EUR, EURO;
    public static final char DOLLAR, US, PESO, AUD;
    public static final char YEN, YUAN;

    //initialize currency variables
    static {
        EUR = EURO = '€';
        DOLLAR = PESO = US = AUD = '$';
        YEN = YUAN = '¥';
    }

    /**
     * Calculate vat over a given price
     * @param vat the vat in percentage
     * @param price price over which to calculate vat
     * @return the vat cost
     */
    public static float calculateVat(float vat, float price) {
        return price * (1f / vat);
    }
}
