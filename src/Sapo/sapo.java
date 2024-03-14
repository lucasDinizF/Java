package Sapo;

import java.util.ArrayList;


public class sapo {
    private ArrayList<Integer> A = new ArrayList<>();
    private int P;
    private int N;
    private int C = 0;

    public ArrayList<Integer> getA() {
        return A;
    }

    public void setA(int Pulo) {
        this.A.add(Pulo);
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int getP() {
        return P;
    }

    public void setP(int P) {
        this.P = P;
    }


    public void calculoPulos(){
        for (int i = 0; i < A.size() - 1; i++){
            int salto = Math.abs(A.get(i) - A.get(i + 1));

            if (salto > P){
                C++;
                break;

            }
        }

    }

    public boolean comparacao() {
        if (C != 0){
            return true;

        }else {
            return false;

        }
    }
}
