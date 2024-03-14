package Pomekon;

import java.util.ArrayList;

public class Pomedex {
    private int C;
    private ArrayList<String> P = new ArrayList<>();

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public ArrayList<String> getP() {
        return P;
    }

    public void setPomedex(String pomedex) {
        boolean controle = this.P.contains(pomedex);
        if (controle == false) {
            this.P.add(pomedex);
        }
    }

    public int quantosFaltam(){
        int Q = 151 - P.size();
        return Q;

    }

}

