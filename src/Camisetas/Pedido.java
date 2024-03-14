package Camisetas;
import java.util.ArrayList;
import java.util.Collections;

public class Pedido {
    private ArrayList<camiseta> pedido = new ArrayList<>();

    public void colocarPedido(String N, String C, String T){
        camiseta c = new camiseta();
        c.setN(N);
        c.setC(C);
        c.setT(T);

        pedido.add(c);
    }

    public void ordenacao(){
        Collections.sort(pedido);

    }

    public void imprimirPedido(){
        for (camiseta T : pedido){
            T.imprimirCamiseta();

        }
    }
}
