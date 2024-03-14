package Triângulo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        triangulo Ti = new triangulo();
        trapezio Ta = new trapezio();

        double A = Sc.nextDouble();
        double B = Sc.nextDouble();
        double C = Sc.nextDouble();

        if (B - C < A && B + C > A){
            System.out.printf("Perimetro = %.1f\n", Ti.calculo(A, B, C));

        } else {
            System.out.printf("Area = %.1f\n", Ta.calculo(A, B, C));

        }



    }
}