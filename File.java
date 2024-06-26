public class MyFileD <T> {
    private Lista.No<T> primeiro;
    private Lista.No<T> ultimo;
    private int count;

    public MyFileD(){
        this.ultimo = null;
        this.count = 0;

    }

    public void Queue(T elemento){
        Lista.No<T> novo = new Lista.No<>(elemento);

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
            Lista.No<T> atual = primeiro;
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

    public void Dequeue(){
        No<T> novo = this.primeiro.getProximo();

        primeiro.setElemento(null);
        primeiro.setProximo(null);
        primeiro = novo;
        this.count--;

        if(count == 0){
            this.ultimo = null;

        }


    }



    public Lista.No<T> getAdd(int P){
        if(!(P >= 0 && P <= this.count)){
            throw new IllegalArgumentException("Posicao nao existe");

        }

        Lista.No<T> aux = primeiro;

        for (int i = 0; i < P; i++){
            aux = aux.getProximo();

        }

        return aux;
    }

    public Object Front(){
        return primeiro.getElemento();

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
