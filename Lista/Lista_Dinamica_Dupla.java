package Lista;

public class Lista_Dinamica_Dupla<T> {
    private No_Duplo<T> Inicio;
    private No_Duplo<T> Final;
    private int Tamanho;

    public Lista_Dinamica_Dupla() {
        this.Final = null;
        this.Tamanho = 0;
    }

    public void adicionar_final(T elemento) {
        No_Duplo<T> no_duplo = new No_Duplo<>(elemento);
        if (this.Final == null) {
            this.Inicio = no_duplo;
        } else {
            Final.setProximo(no_duplo);
            no_duplo.setAnterior(Final);
        }
        this.Final = no_duplo;
        this.Tamanho++;
    }

    public void adicionar_inicio(T elemento) {
        No_Duplo<T> no_duplo = new No_Duplo<>(elemento);
        this.Inicio.setAnterior(no_duplo);
        no_duplo.setProximo(Inicio);
        Inicio = no_duplo;

    }
    public void remover_final() {
        if (this.Final != null) {
            if (Inicio == Final) {
                Inicio = null;
                Final = null;
            } else {
                No_Duplo<T> no_atual = Inicio;
                //for(int i = 0; i<tamanho-2;i++){}
                while (no_atual.getProximo() != Final) {
                    no_atual = no_atual.getProximo();
                }
                this.Final = no_atual;
                this.Final.setProximo(null);
            }
        }
    }
    public void remover_inicio(){
        this.Inicio.setAnterior(null);
        this.Inicio.setElemento(null);
        this.Inicio=Inicio.getProximo();

    }
    public T busca_posicao(int posicao){
        if (!(posicao >= 0 && posicao <= this.Tamanho)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        No_Duplo<T> Auxiliar = Inicio;
        for (int i = 0; i < posicao; ) {
            Auxiliar = Auxiliar.getProximo();
            i++;
        }
        return Auxiliar.getElemento();
    }
    public int busca_elemento(T elemento){
        No_Duplo<T> no_Atual = this.Inicio;
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
    public void Print() {
        if (Tamanho == 0) {
            System.out.println("[]");
        } else {
            No_Duplo<T> Atual = Inicio;
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
