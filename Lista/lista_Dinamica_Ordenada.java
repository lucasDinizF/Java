package Lista;

public class lista_Dinamica_Ordenada<T extends Comparable<T>> {
    private No<T> Inicio;
    private No<T> Final;
    private int tamanho;
    public lista_Dinamica_Ordenada() {
        Final = null;
        this.tamanho = 0;
    }
    public void add_Ordenado(T elemento) {
        No<T> novo_No = new No<>(elemento);
        No<T> anterior = null;
        No<T> atual = Inicio;
        while (atual != null && novo_No.getElemento().compareTo(atual.getElemento()) >= 0) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (anterior == null) {
            novo_No.setProximo(Inicio);
            Inicio = novo_No;

        } else {
            anterior.setProximo(novo_No);
            novo_No.setProximo(atual);

        }
        this.tamanho++;
    }
    private No<T> Busca(int posicao) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        No<T> Auxiliar = Inicio;
        for (int i = 0; i < posicao; ) {
            i++;
            Auxiliar = Auxiliar.getProximo();
        }
        return Auxiliar;
    }

    public T busca_posicao(int posicao) {
        return this.Busca(posicao).getElemento();
    }

    public int busca_Elemento(T elemento) {
        No<T> no_Atual = this.Inicio;
        int posicao = 0;
        while (no_Atual != null) {
            if (no_Atual.getElemento().equals(elemento)) {
                return posicao;
            } else {
                posicao++;
                //posicao +=1;
                //posicao = posicao+1;
                no_Atual = no_Atual.getProximo();
            }
        }
        return -1;
    }

    public int get_Tamanho() {
        return this.tamanho;
    }

    public boolean lista_Vazia() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    public void remover_Inicio() {
        No<T> novo_Inicio = this.Inicio.getProximo();
        Inicio.setElemento(null);
        Inicio.setProximo(null);
        Inicio = novo_Inicio;
        this.tamanho--;
        if (tamanho == 0) {
            this.Final = null;
        }
        /*
        Inicio = Inicio.getProximo
        tamanho --
         */
    }
    public void remover_Final(){
        if(this.tamanho == 0){
            System.out.println("Lista vazia");
        } else if (this.tamanho == 1) {
            this.Inicio = null;
            this.Final = null;
            this.tamanho --;
        } else{
            No<T> Auxiliar = this.Inicio;
            for (int i =0; i< this.tamanho-2; i++){
                Auxiliar = Auxiliar.getProximo();
            }
            Auxiliar.setProximo(null);
            this.Final = Auxiliar;
            this.tamanho --;
        }
    }
    public void remover_qL(int posicao){
        if (posicao == 0){
            this.remover_Inicio();
        } else if (posicao == tamanho-1) {
            this.remover_Final();
        } else {
            No<T> Anterior = Busca(posicao-1);
            No<T>Atual = Anterior.getProximo();
            No<T> proximo = Atual.getProximo();
            Anterior.setProximo(proximo);
        }
        this.tamanho--;
    }

    public void limpa() {
        // temos 2 metodos para isso, primeiro:
        for (No<T> Atual = Inicio; Atual != null; ) {// inicia a variavel / estipula a cond de parada.
            No<T> proximo = Atual.getProximo(); // forma de incrementar
            Atual.setElemento(null);
            Atual.setProximo(null);
            Atual = proximo;
        }
        // e temos o segundo metodo:
        this.Inicio = null;
        this.Final = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        return "{" + Inicio + '}';
    }

    public void Print() {
        if (tamanho == 0) {
            System.out.println("[]");
        } else {
            No<T> Atual = Inicio;
            System.out.print("[");
            while (Atual != null) {
                System.out.print(Atual.getElemento());
                Atual = Atual.getProximo();
                if (Atual != null) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
