package Animal;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        animal A = new animal();
        Ave Av = new Ave();
        Mamifero M = new Mamifero();
        Inseto I = new Inseto();
        Anelideo An = new Anelideo();

        A.setA(Sc.next());
        A.setB(Sc.next());
        A.setC(Sc.next());


        if (Objects.equals(Av.comparacaoVertebrado(A.getA(), A.getB(), A.getC()), "aguia")){
            System.out.println("aguia");

        } else if (Objects.equals(Av.comparacaoVertebrado(A.getA(), A.getB(), A.getC()), "pomba")) {
            System.out.println("pomba");

        } else if (Objects.equals(M.comparacaoVertebrado(A.getA(), A.getB(), A.getC()), "homem")) {
            System.out.println("homem");

        } else if (Objects.equals(M.comparacaoVertebrado(A.getA(), A.getB(), A.getC()), "vaca")) {
            System.out.println("vaca");

        } else if (Objects.equals(I.comparacaoInvertebrado(A.getA(), A.getB(), A.getC()), "pulga")) {
            System.out.println("pulga");
            
        } else if (Objects.equals(I.comparacaoInvertebrado(A.getA(), A.getB(), A.getC()), "lagarta")) {
            System.out.println("lagarta");
            
        } else if (Objects.equals(An.comparacaoInvertebrado(A.getA(), A.getB(), A.getC()), "sanguessuga")) {
            System.out.println("sanguessuga");
            
        } else if (Objects.equals(An.comparacaoInvertebrado(A.getA(), A.getB(), A.getC()), "minhoca")) {
            System.out.println("minhoca");

        }else {
            System.out.println("animal");

        }

    }
}
