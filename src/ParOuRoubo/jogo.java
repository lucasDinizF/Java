package ParOuRoubo;

public class jogo extends Jogadores {

    int s = 0;
    
    public int somador(){
        s = getJ1() + getJ2();
        return s;
    }

    public boolean comparacaoVitoria(){
        if (((getP() == 1 && s%2 == 0) || (getP() == 0 && s%2 == 1)) && (getR() == 0 && getA() == 0)){
            return true;
            
        } else if (((getP() == 0 && s%2 == 0) || (getP() == 1 && s%2 == 1)) && (getR() == 1 && getA() == 0)) {
            return true;
            
        } else if (((getP() == 1 && s%2 == 0) || (getP() == 0 && s%2 == 1)) && (getR() == 1 && getA() == 0)) {
            return true;

        } else if (((getP() == 1 && s%2 == 0) || (getP() == 0 && s%2 == 1)) && (getR() == 0 && getA() == 1)) {
            return true;

        } else if (((getP() == 0 && s%2 == 0) || (getP() == 1 && s%2 == 1)) && (getR() == 0 && getA() == 1)) {
            return true;

        }else {
            return false;
        }
    }
}
