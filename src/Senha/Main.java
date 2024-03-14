package Senha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner Sc = new Scanner(System.in);

        while (true){
            try {
                int S = Sc.nextInt();

                if (S != 2002){
                    throw new Exception("Senha Invalida");

                }

                System.out.println("Acesso Permitido");
                break;

            } catch (Exception e){
                System.out.println(e.getMessage());
            }


        }


    }
}
