package Lista.Pomekon;

import Lista.MyListO;

public class Pomedex {
    private int C;
    MyListO<String> P = new MyListO<String>();

    public int getC() {

        return C;
    }

    public void setC(int C) {

        this.C = C;
    }

    public void setPomedex(String pomedex){
        boolean controle = this.P.contains(pomedex);
        if (controle == false){
            this.P.add(pomedex);

        }

    }

    public int quantosFaltam(){
        int Q = 151 - P.size();

        return Q;
    }



}
