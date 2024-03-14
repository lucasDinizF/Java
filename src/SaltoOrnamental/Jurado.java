package SaltoOrnamental;

import java.util.ArrayList;
import java.util.Collections;

public class Jurado {
    private ArrayList<Double> P = new ArrayList<>();
    private double T;
    private double D;

    public ArrayList<Double> getP() {

        return P;
    }

    public void setP(double P) {
        this.P.add(P);

    }

    public double getD() {
        return D;
    }

    public void setD(double D) {

        this.D = D;
    }

    public double getT() {
        return T;

    }

    public void setT(double t) {
        T = t;

    }
    public double calculoTotal(){
        P.remove(Collections.max(P));
        P.remove(Collections.min(P));
        for (int i = 0; i < P.size(); i++){
            setT(getT() + P.get(i));

        }


        return getT() * getD();
    }



}
