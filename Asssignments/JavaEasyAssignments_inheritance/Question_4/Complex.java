package Question_4;

public class Complex {
    double real;
    double imag;


    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex multiply(Complex c) {
        double r = (this.real * c.real) - (this.imag * c.imag);
        double i = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(r, i);
    }

    public void display() {
        if (imag < 0) {
            System.out.println(real + " - " + (-imag) + "i");
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }
}