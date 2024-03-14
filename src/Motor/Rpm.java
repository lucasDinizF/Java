package Motor;

import java.util.ArrayList;

public class Rpm {
    private ArrayList<Integer> R = new ArrayList<>();
    private int N;
    private int m = 0;

    public ArrayList<Integer> getR(){
        return R;

    }

    public void setR(int R) {
        this.R.add(R);

    }

    public int getN() {
        return N;

    }

    public void setN(int N) {
        this.N = N;

    }

    public int rpm(){
        for(int i = 0; i < R.size()-1; i++){
            if (R.get(i) > R.get(i+1)){
                m = i+1;
                break;
            }
        }
        return m;
    }

    public int getM() {
        if (m == 0){
            return 0;

        }
        return m+1;

    }

    public void setM(int m) {
        this.m = m;

    }

}
