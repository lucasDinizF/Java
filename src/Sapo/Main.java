package Sapo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        sapo s = new sapo();

        s.setP(Sc.nextInt());
        s.setN(Sc.nextInt());

        for (int i = 0; i < s.getN(); i++){
            s.setA(Sc.nextInt());

        }

        s.calculoPulos();

        if (s.comparacao()){
            System.out.println("GAME OVER");

        } else if (!s.comparacao()) {
            System.out.println("YOU WIN");
        }

    }
}
