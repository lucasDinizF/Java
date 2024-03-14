package Lista.Nomes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        Lista_de_nomes<String> N = new Lista_de_nomes<String>();
        int X = Sc.nextInt();

        for (int i=0; i < X; i++) {
            N.adicionar(Sc.next());

        }

        N.imprimir();
    }
}
