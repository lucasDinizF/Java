package Camisetas;

public class camiseta implements Comparable<camiseta>{
    private String C;
    private String T;
    private String N;

    public String getC(){
        return C;

    }

    public void setC(String C){
        this.C = C;

    }

    public String getT(){
        return this.T;

    }

    public void setT(String T){
        this.T = T;

    }

    public String getN(){
        return N;

    }

    public void setN(String N){
        this.N = N;

    }

    public void imprimirCamiseta(){
        System.out.println(getC() + "" + getT() + " " + getN());


    }

    @Override
    public int compareTo(camiseta camiseta2){
        int comparacaoC = this.C.compareTo(camiseta2.getC());


        if (comparacaoC == 0){
            int comparacaoT = camiseta2.T.compareTo(this.T);


            if (comparacaoT == 0){
                return this.N.compareTo(camiseta2.getN());

            }
            return comparacaoT;

        }
        return comparacaoC;

    }
}