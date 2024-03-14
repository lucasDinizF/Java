package SaltoOrnamental;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Competidor Com = new Competidor();
        int N = Sc.nextInt();


        for (int i = 0; i < N; i++){
            Com.setN(Sc.next());

            Jurado J = new Jurado();

            J.setD(Sc.nextDouble());
            for (int j = 0; j < 7; j++){
                J.setP(Sc.nextDouble());

            }

            System.out.printf(Com.getN() + " %.2f\n", J.calculoTotal());

            J.setT(0);


        }

    }
}
