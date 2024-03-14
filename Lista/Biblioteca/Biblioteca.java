package Lista.Biblioteca;

import Lista.MyListO;

public class Biblioteca {
    MyListO<String> Livros = new MyListO<String>();

    public MyListO<String> getLivros() {
        return this.Livros;
    }

    public void setBiblio(String  livros) {
        this.Livros.add(livros);

    }

    public void imprimir(int i){
        System.out.println(Livros.get(i));

    }



}
