package greene.ctis310;

public class Rational {
    //attribites that hold a numerator and demoninator
    private int numerator;
    private int denominator;

    //constructor that takes two integers and sets the numerator and denominator
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be 0, setting to 1");
            this.denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //default constructor that sets the numerator and the denominator to a random number between -100 and 100
    public Rational() {
        this.numerator = (int) (Math.random() * 200) - 100;
        this.denominator = (int) (Math.random() * 200) - 100;
        while (denominator == 0) {
            this.denominator = (int) (Math.random() * 200) - 100;
        }
    }

    //negate method that changes the attribute so that is the negative of the current rational number
    //this method does not return anything becuase it changes the attribute
    public void negate() {
        numerator = -numerator;
    }

    //invert method that changes the attribute so that is the inverse of the current rational number
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    //instance method that returns a double of the rational number
    public double toDouble() {
        return (double) numerator / denominator;
    }

    //method that reduces the rational number to its lowest terms without changing the attributes
    public Rational reduce() {
        int gcd = gcd(numerator, denominator);
        return new Rational(numerator / gcd, denominator / gcd);
    }

    //static method that returns the greatest common divisor of two integers
    //if a is 10 and b is 5, then the gcd is 5 and the rational numnber is 2/1
    //a != 0 so b is assigned to a and a is assigned to b % a
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //method that takes a Rational obj and adds to the current rational number and returns a new rational number
    //and make sure it is the greatest common divisor
    public Rational add(Rational r) {
        int newNumerator = numerator * r.denominator + denominator * r.numerator;
        int newDenominator = denominator * r.denominator;
        return new Rational(newNumerator, newDenominator).reduce();
    }

    //toString method that returns a string representation of the rational number
    public String toString() {
        return numerator + "/" + denominator;
    }
}
