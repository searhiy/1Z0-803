package exam.chapter2;

/**
 * Created by serhii on 29.10.14.
 */
public class Primitives {

    private long baseDecimal = 100_267_760;
    private long octVal = 04_13;
    private long hexVal = 0x10_BA_75;
    private long binVal = 0b1_0000_10_11;

    private float floatLiteral = 100.4_8F;
    private double doubleLiteral = 10_0.87;

    private char charLiteral = 'a';

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String a = "1234";
        System.out.println(a.substring(1, 3));


        // assigning negative value
        char myChar = (char) -1122;
        System.out.printf("" + myChar);
    }


}
