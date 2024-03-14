package Lavanderia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        Lavadora L = new Lavadora();
        Secadora S = new Secadora();

        L.setMin(Sc.nextInt());
        L.setMax(Sc.nextInt());
        S.setMin(Sc.nextInt());
        S.setMax(Sc.nextInt());


        if (L.comparacaoRoupas(N) && S.comparacaoRoupas(N)){
            System.out.print("possivel\n");

        } else {
            System.out.print("impossivel\n");
        }

    }
}
