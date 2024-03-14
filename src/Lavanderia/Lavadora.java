package Lavanderia;

public class Lavadora extends Maquina {

    public Lavadora() {


    }

    public int lavadoraMin(int min){
        setMin(min);

        return getMin();
    }

    public int lavadoraMax(int max){
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
