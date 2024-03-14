package Triângulo;

public abstract class Plano {
        private int A;
        private int B;
        private int C;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public abstract double calculo(double A, double B, double C);

}
