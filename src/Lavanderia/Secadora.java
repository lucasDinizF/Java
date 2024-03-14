package Lavanderia;

public class Secadora extends Maquina {

    public Secadora(){

    }

    public int secadoraMin(int min){
        setMin(min);

        return getMin();
    }

    public int secadoraMax(int max){
        setMax(max);

        return getMax();
    }

    @Override
    public boolean comparacaoRoupas(int n) {
        boolean controle = true;
        if (getMin() <= n && getMax() >= n) {
            return controle;

        }else {
            controle = false;
            return controle;

        }
    }

}
