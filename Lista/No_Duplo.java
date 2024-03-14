package Lista;

public class No_Duplo<T> {
    private No_Duplo<T> Anterior;
    private  T elemento;
    private No_Duplo<T> Proximo;


    public No_Duplo(T elemento){
        this.Anterior = null;
        this.elemento = elemento;
        this.Proximo = null;
    }

    public No_Duplo(No_Duplo<T> Anterior, T Elemento, No_Duplo<T> Proximo){
        this.Anterior = Anterior;
        this.elemento = Elemento;
        this.Proximo = Proximo;

    }

    public No_Duplo<T> getAnterior() {
        return Anterior;
    }

    public void setAnterior(No_Duplo<T> anterior) {
        Anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No_Duplo<T> getProximo() {
        return Proximo;
    }

    public void setProximo(No_Duplo<T> proximo) {
        Proximo = proximo;
    }
}
