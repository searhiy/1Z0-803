package exam.chapter2;

/**
 * Created by serhii on 30.10.14.
 */
public class ArithmeticOperators {

    public static void main(String[] args) {

        double d1 = 20.0;
        double e1 = 10.0;
        double f1 = d1 * --e1;
        System.out.println(f1);
        System.out.println(e1);

        double d2 = 20.0;
        double e2 = 10.0;
        double f2 = d2 * e2--;
        System.out.println(f2);
        System.out.println(e2);

        int a = 10;
        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a);

        int b = 10;
        b = b++ + b + b--;
        System.out.println(b);
    }
}
