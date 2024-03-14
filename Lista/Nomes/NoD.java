package Lista.Nomes;

public class NoD<T> {
    private NoD<T> Anterior;
    private  T Dado;
    private NoD<T> Proximo;
    public NoD(T Dado){
        this.Anterior = null;
        this.Dado = Dado;
        this.Proximo = null;
    }
    public NoD(NoD<T> Anterior, T Dado, NoD<T> Proximo){
        this.Anterior = Anterior;
        this.Dado = Dado;
        this.Proximo = Proximo;
    }
    public NoD<T> getAnterior() {
        return this.Anterior;
    }

    public void setAnterior(NoD<T> Anterior) {
        this.Anterior = Anterior;
    }

    public T getDado() {
        return Dado;
    }

    public void setDado(T Dado) {
        this.Dado = Dado;
    }

    public NoD<T> getProximo() {
        return this.Proximo;
    }

    public void setProximo(NoD<T> Proximo) {
        this.Proximo = Proximo;
    }
}
