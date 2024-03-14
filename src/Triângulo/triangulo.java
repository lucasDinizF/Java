package Triângulo;

public class triangulo extends Plano{

    public triangulo() {
    }

    @Override
    public double calculo(double A, double B, double C) {
        double perimetro = 0;
        perimetro = A + B + C;

        return perimetro;
    }
}
