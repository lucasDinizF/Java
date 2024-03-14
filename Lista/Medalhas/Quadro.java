package Lista.Medalhas;

import Lista.MyListO;

public class Quadro {
    MyListO<Medalhas> Quadro = new MyListO<Medalhas>();

    public MyListO<Medalhas> getQuadro() {
        return Quadro;
    }

    public void setQuadro(String C, int G, int S, int B) {
        Medalhas M = new Medalhas(C, G, S, B);

        Quadro.add(M);

    }

    public void imprimir(){
        Quadro.show();

    }
}
