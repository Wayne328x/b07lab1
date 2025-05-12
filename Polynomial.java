public class Polynomial {
    private double[] coefficients;

    // No-arg constructor: zero polynomial
    public Polynomial() {
        this.coefficients = new double[]{0};
    }

    // Constructor with array of coefficients
    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients.clone();
    }

    // Add another Polynomial to this one
    public Polynomial add(Polynomial other) {
        int maxLength = Math.max(this.coefficients.length, other.coefficients.length);
        double[] result = new double[maxLength];

        for (int i = 0; i < maxLength; i++) {
            double a = i < this.coefficients.length ? this.coefficients[i] : 0;
            double b = i < other.coefficients.length ? other.coefficients[i] : 0;
            result[i] = a + b;
        }

        return new Polynomial(result);
    }

    // Evaluate the polynomial at a given value x
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    // Check if x is a root of the polynomial
    public boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }
}
