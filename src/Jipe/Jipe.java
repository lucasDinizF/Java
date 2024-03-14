package Jipe;

public class Jipe {
    private String Direcao;
    private int quantidade;
    private int contadorJ = 0;
    private int Total = 0;

    void setDirecao(String Direcao) {
        this.Direcao = Direcao;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDirecao() {
        return this.Direcao;
    }

    public int getQuatidade(){
        return this.quantidade;
    }

    public int contadorJipes() {
        if (Direcao.equals("SALIDA")) {
            this.contadorJ++;


        }
        else if (Direcao.equals("VUELTA")) {
            this.contadorJ--;

        }
        return this.contadorJ;
    }

    public int totalTurista() {
        if (Direcao.equals("SALIDA")) {
            this.Total = this.quantidade + this.Total;
        }
        else if (Direcao.equals("VUELTA")) {
            this.Total = this.Total - this.quantidade;
        }

        return this.Total;
    }




}
