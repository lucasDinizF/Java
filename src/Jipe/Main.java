package Jipe;

import Jipe.Jipe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            Jipe Parque = new Jipe();
            boolean controle = true;


            while(controle) {
                Parque.setDirecao(Sc.next());

                if (Parque.getDirecao().equals("ABEND")) {
                    controle = false;
                }
                if (!Parque.getDirecao().equals("ABEND")) {
                    Parque.setQuantidade(Sc.nextInt());
                    controle = true;
                }

                Parque.contadorJipes();
                Parque.totalTurista();


            }

            System.out.println(Parque.totalTurista());
            System.out.println(Parque.contadorJipes());
        }

    }
}