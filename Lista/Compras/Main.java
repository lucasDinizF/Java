package Lista.Compras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Lista_de_compras C = new Lista_de_compras();
        int N = Sc.nextInt();

        Sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] lista = Sc.nextLine().split(" ");

            for (int j = 0; j < lista.length; j++) {
                C.setCompras(lista[j]);

            }

            C.imprimir();
        }

    }
}
