package Lista;

public class MyListE<T> {
    private int vetor[];
    private int cont;

    public MyListE(int n){
        vetor = new int[n];
        cont = 0;

    }

    public void add(int elemento){
        vetor[cont] = elemento;
        cont++;

    }

    public void show(){
        System.out.print("[");

        for (int i = 0; i < cont; i++){
            System.out.print(vetor[i]);

        }

        System.out.println("]");

    }

    public void add(int position, int element){




    }

    public int size(){


        return 0;
    }


    public void clear(){


    }
    public boolean contains(){


        return false;
    }

    public void remove(int posicao){

    }

    public int get(int posicao){

        return 0;
    }

    public int indexOf(){

        return 0;
    }





}
