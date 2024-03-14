package Lista.Medalhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Quadro Q = new Quadro();

        int N = Sc.nextInt();

        for (int i = 0; i < N; i++){
            Q.setQuadro(Sc.next(), Sc.nextInt(), Sc.nextInt(), Sc.nextInt());

        }

        Q.imprimir();

    }
}
