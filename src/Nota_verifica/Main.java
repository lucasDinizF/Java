package Nota_verifica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner Sc = new Scanner(System.in);
        int c = 0;
        double M = 0;
        boolean controle = true;



        while (controle){
            try {
                double N = Sc.nextDouble();


                if (N < 0 || N > 10){
                    throw new Exception("nota invalida");

                }

                c++;

                M = M + N;

                if (c == 2){
                    M = M/c;

                    System.out.printf("media = %.2f\n", M);

                    c = 0;
                    M = 0;

                   while (true){
                       System.out.println("novo calculo (1-sim 2-nao)");

                       int X = Sc.nextInt();

                       if (X == 1){
                           controle = true;
                           break;

                       } else if (X == 2) {
                           controle = false;
                           break;

                       }

                    }

                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

    }
}
