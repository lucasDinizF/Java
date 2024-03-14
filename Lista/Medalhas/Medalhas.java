package Lista.Medalhas;

public class Medalhas implements Comparable<Medalhas>{
    private int G;
    private int S;
    private int B;
    private String Country;


    public Medalhas(String Country, int G, int S, int B){
        this.Country = Country;
        this.G = G;
        this.S = S;
        this.B = B;

    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public int compareTo(Medalhas o) {
        int C = o.getG() - G;
        if (C == 0){
            C = o.getS() - S;

        } if (C == 0) {
            C = o.getB() - B;

        } if (C == 0){
            C = Country.compareTo(o.getCountry());

        }

        return C;
    }

    @Override
    public String toString() {
        return Country + " " + G + " " + S + " " + B;
    }

}
