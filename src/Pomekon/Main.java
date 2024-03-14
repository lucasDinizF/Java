package Pomekon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Pomedex P = new Pomedex();

        P.setC(Sc.nextInt());

        for (int i = 0; i < P.getC(); i++){
            P.setPomedex(Sc.next());
        }

        System.out.println("Falta(m) " + P.quantosFaltam() + " pomekon(s).");

    }
}
