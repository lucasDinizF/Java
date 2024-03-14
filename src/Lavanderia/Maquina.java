package Lavanderia;

public abstract class Maquina {
    private int max;
    private int min;

    public Maquina(){

    }

    public int getMax() {
        return this.max;

    }

    public void setMax(int max) {
        this.max = max;

    }

    public int getMin() {
        return this.min;

    }

    public void setMin(int min) {
        this.min = min;

    }

    public abstract boolean comparacaoRoupas(int n);
}
