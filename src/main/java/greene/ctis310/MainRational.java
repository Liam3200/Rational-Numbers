package greene.ctis310;

/**
 * Hello world!
 *
 */
public class MainRational 
{
    public static void main( String[] args )
    {
        Rational r1 = new Rational();
        System.out.println("Random rational number:");
        System.out.println("r1: "+r1);

        Rational r2 = new Rational(-4, 16);
        System.out.println("r2: "+r2);
        //test negate method
        System.out.println("Negate r2:");
        System.out.println("Expected: 4/16");
        r2.negate();
        System.out.println("Actual: "+r2);
        //test invert method
        System.out.println("Invert r2:");
        System.out.println("Expected: 16/4");
        r2.invert();
        System.out.println("Invert r2: "+r2);
        //test toDouble method
        System.out.println("toDouble r2:");
        System.out.println("Expected: 4.0");
        System.out.println("Actual: "+r2.toDouble());
        //test reduce method
        System.out.println("Reduce r2:");
        System.out.println("Expected: 4/1");
        System.out.println("Actual: "+r2.reduce());
        //test add method
        System.out.println("Add r1 and r2:");
        System.out.println(r1.add(r2));
    }
}
