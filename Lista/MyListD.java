/*package Lista;

public class MyListD<T> {

    private No_Duplo<T> primeiro;
    private No_Duplo<T> ultimo;
    private int count;


    public MyListD(){
        this.primeiro = null;
        this.ultimo = null;
        this.count = 0;

    }

    public void add(T elemento){
        No_Duplo<T> novo = new No_Duplo<T>(elemento);

        if (this.primeiro == null){
            this.primeiro = novo;
            this.ultimo = novo;

        } else {
            ultimo.proximo = novo;
            novo.setAnterior(ultimo);
            ultimo = novo;
            ultimo.setProximo(primeiro);
            primeiro.setAnterior(ultimo);

        }

        count++;

    }

    public void show(){
        No_Duplo<T> aux = primeiro;

        System.out.print("[ ");

        while (aux != null){
            System.out.print(aux.dado + " ");
            aux = aux.proximo;

        }

        System.out.println("]");

    }

    public void add(int posicao, T elemento){
        No_Duplo<T> aux = getAdd(posicao - 1);
        No_Duplo<T> novo = new No_Duplo<T>(elemento);

        novo.proximo = aux.proximo;

        aux.proximo = novo;

        count++;

    }

    public int size(){
        return count;

    }


    public void clear(){
        this.primeiro = null;
        this.ultimo = null;
        this.count = 0;

    }

    public void remove(){
        No aux = primeiro;

        while (aux.proximo != ultimo){
            aux = aux.proximo;

        }

        aux.proximo = null;
        ultimo = aux;

        count--;
    }

    public void remove(int posicao){
        No aux = getAdd(posicao - 1);

        aux. proximo = aux.proximo.proximo;

        count--;
    }


    public int get(int posicao){
        No aux = primeiro;

        for (int i = 0; i < posicao; i++){
            aux = aux.proximo;

        }

        return aux.dado;
    }

    public boolean contains(){

        return false;
    }

    public int indexOf(){

        return 0;
    }



}*/
