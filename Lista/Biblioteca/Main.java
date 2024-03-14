package Lista.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        while(Sc.hasNext()) {
            int N = Sc.nextInt();
            Biblioteca Biblio = new Biblioteca();

            for (int i = 0; i < N; i++) {
                Biblio.setBiblio(Sc.next());

            }

            for (int i = 0; i < N; i++) {
                Biblio.imprimir(i);

            }
        }


    }
}
