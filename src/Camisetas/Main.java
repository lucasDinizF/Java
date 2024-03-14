package Camisetas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner Sc = new Scanner(System.in);

        enviadas E = new enviadas();

        int N = 1;
        while(N > 0){
            N = Sc.nextInt();

            if(N == 0){
                break;

            }

            Sc.nextLine();

            Pedido P = new Pedido();

            for (int i = 0; i < N; i++){
                P.colocarPedido(Sc.nextLine(), Sc.next(), Sc.nextLine());

            }
            P.ordenacao();

            E.colocarEnvio(P);

        }
        E.imprimirCamisas();

        Sc.close();

    }
}