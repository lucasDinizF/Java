package Lista.Compras;

import Lista.MyListO;

public class Lista_de_compras {
    MyListO<String> Compras = new MyListO<String>();

    public MyListO<String> getCompras() {
        return Compras;

    }

    public void setCompras(String compras){
        boolean controle = this.Compras.contains(compras);
        if (!controle){
            this.Compras.add(compras);

        }

    }

    public void imprimir(){
        Compras.show();
        Compras.clear();

    }
}
