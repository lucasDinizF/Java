public class MyPileD<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private int count;

    public MyPileD(){
        this.ultimo = null;
        this.count = 0;

    }

    public void Push(T elemento){
        No<T> novo = new No<>(elemento);

        if (this.ultimo == null){
            this.primeiro = novo;
        }else {
            ultimo.setProximo(novo);
        }

        this.ultimo = novo;
        count++;
    }

    public void show(){
        if (this.count == 0){
            System.out.println("[]");

        } else {
            No<T> atual = primeiro;
            System.out.print("[ ");

            while (atual != null){
                System.out.print(atual.getElemento() + " ");
                atual = atual.getProximo();

            }

            System.out.println("]");
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


    public void Pop(){
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

    public Object Top(){
        return ultimo.getElemento();

    }

    public Object Search(int posicao){
        return getAdd(posicao).getElemento();

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
