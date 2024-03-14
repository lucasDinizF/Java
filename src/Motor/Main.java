package Motor;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        Rpm M = new Rpm();
        M.setN(Sc.nextInt());

        for (int i = 0; i < M.getN(); i++){
            M.setR(Sc.nextInt());
        }

        M.rpm();

        System.out.println(M.getM());


    }
}
