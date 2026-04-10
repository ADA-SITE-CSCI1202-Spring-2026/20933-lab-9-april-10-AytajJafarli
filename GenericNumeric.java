public class GenericNumeric<T extends Number> {

    private T num;

    public GenericNumeric(T num) {
        this.num = num;
    }

    // b) reciprocal
    public double reciprocal() {
        return 1.0 / num.doubleValue();
    }

    // c) fractional part
    public double fractionalPart() {
        double value = num.doubleValue();
        return value - Math.floor(value);
    }

    // d) check absolute equality of two numbers
    public static boolean absEqual(Number a, Number b) {
        return Math.abs(a.doubleValue()) == Math.abs(b.doubleValue());
    }

    // Test main
    public static void main(String[] args) {
        GenericNumeric<Double> n1 = new GenericNumeric<>(9.76);

        System.out.println("Reciprocal: " + n1.reciprocal());
        System.out.println("Fractional Part: " + n1.fractionalPart());

        Double d = -5.0;
        Float f = 5.0f;

        System.out.println("Absolute Equal: " + absEqual(d, f));
    }
}