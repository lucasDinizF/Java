package ParOuRoubo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        jogo j = new jogo();

        j.setP(Sc.nextInt());
        j.setJ1(Sc.nextInt());
        j.setJ2(Sc.nextInt());
        j.setR(Sc.nextInt());
        j.setA(Sc.nextInt());

        j.somador();


        if (j.comparacaoVitoria() == true){
            System.out.println("Jogador 1 ganha!");

        } else if (j.comparacaoVitoria() == false) {
            System.out.println("Jogador 2 ganha!");

        }

    }

}
