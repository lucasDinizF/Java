package Triângulo;

public class trapezio extends Plano{

    public trapezio(){
    }

    @Override
    public double calculo(double A, double B, double C) {
        double area = 0;
        area = ((A + B) * C)/2;


        return area;
    }

}
