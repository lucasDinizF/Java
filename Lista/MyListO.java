package Lista;

public class MyListO<T extends Comparable<T>> {
    private No<T> primeiro;
    private No<T> ultimo;
    private int count;

    public MyListO(){
        this.ultimo = null;
        this.count = 0;

    }

    public void add(T elemento){
        No<T> novo = new No<>(elemento);
        No<T> anterior = null;
        No<T> atual = this.primeiro;

        while ((atual != null) && (novo.getElemento().compareTo(atual.getElemento()) >= 0)){
            anterior = atual;
            atual = atual.getProximo();


        } if (anterior == null){
            novo.setProximo(this.primeiro);
            this.primeiro = novo;

        } else {
            anterior.setProximo(novo);
            novo.setProximo(atual);
            if (atual == null) {
                 this.ultimo = novo;
            }

        }

        count++;

    }

    public void show(){
        if (this.count == 0){
            System.out.println("[]");

        } else {
            No<T> atual = primeiro;

            while (atual != null){
                System.out.println(atual.getElemento());
                atual = atual.getProximo();


            }

        }

    }


    public int size(){
        return this.count;

    }

    public void clear(){
        this.primeiro = null;
        this.ultimo = null;
        this.count = 0;

    }

    public void removePrimeiro(){
        No<T> novo = this.primeiro.getProximo();

        primeiro.setElemento(null);
        primeiro.setProximo(null);
        primeiro = novo;
        this.count--;

        if(count == 0){
            this.ultimo = null;

        }

    }

    public void removeUltimo(){
        if (this.count == 0){
            System.out.println("Lista vazia");

        } else if (this.count == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.count--;

        } else {
            No<T> aux = this.primeiro;
            for (int i = 0; i < this.count - 2; i++){
                aux = aux.getProximo();

            }
            aux.setProximo(null);
            this.ultimo = aux;
            this.count--;

        }


    }

    public void remove(int posicao){
        if (posicao == 0){
            this.removePrimeiro();
        } else if (posicao == this.count - 1) {
            this.removeUltimo();

        }else {
            No<T> anterior = getAdd(posicao - 1);
            No<T> atual = anterior.getProximo();
            No<T> proximo = atual.getProximo();
            anterior.setProximo(proximo);

        }

        this.count--;

    }


    public No<T> getAdd(int P){
        if(!(P >= 0 && P <= this.count)){
            throw new IllegalArgumentException("Posicao nao existe");

        }

        No<T> aux = primeiro;

        for (int i = 0; i < P; i++){
            aux = aux.getProximo();

        }

        return aux;
    }

    public Object get(int posicao){
        return getAdd(posicao).getElemento();

    }

    public int indexOf(){
        return 0;

    }

    public boolean contains(T elemento){
        No<T> no = this.primeiro;
        int posicao = 0;

        while (no != null){
            if (no.getElemento().equals(elemento)){
                return true;

            } else {
                posicao++;
                no = no.getProximo();

            }

        }

        return false;
    }

}