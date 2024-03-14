package Camisetas;

import java.util.ArrayList;

public class enviadas {
    private ArrayList<Pedido> enviadas = new ArrayList<Pedido>();

    public void colocarEnvio(Pedido enviadas){
        this.enviadas.add(enviadas);

    }

    public void imprimirCamisas(){
        int i = 0;

        for (Pedido p : enviadas){
            if (i == enviadas.size()-1){
                p.imprimirPedido();

            } else if (i < enviadas.size()-1) {
                p.imprimirPedido();
                System.out.println();

            }
            i++;

        }
    }
}