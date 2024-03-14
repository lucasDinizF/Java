package Lista.Nomes;

import Lista.MyListE;
import Lista.MyListO;

public class Lista_de_nomes<T> {
    private NoD<T> primeiro;
    private NoD<T> ultimo;
    private int count;

    public void adicionar(T elemento) {
        NoD<T> novo = new NoD<>(elemento);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            NoD<T> anterior = null;
            NoD<T> atual = primeiro;

            while (atual != null && novo.getDado().toString().length() >= atual.getDado().toString().length()) {
                anterior = atual;
                atual = atual.getProximo();
            }

            if (anterior == null) {
                novo.setProximo(primeiro);
                primeiro.setAnterior(novo);
                primeiro = novo;

            } else {
                anterior.setProximo(novo);
                novo.setAnterior(anterior);
                novo.setProximo(atual);

                if (atual == null) {
                    ultimo = novo;
                } else {
                    atual.setAnterior(novo);
                }
            }
        }
        this.count++;

    }


    public void remover(Object obj) {
        NoD<T> atual = primeiro;
        boolean found = false;

        if (primeiro.getDado().equals(obj)) {
            primeiro = primeiro.getProximo();

            if (primeiro != null) {
                primeiro.setAnterior(null);

            }

            found = true;

        } else if (ultimo.getDado().equals(obj)) {
            ultimo = ultimo.getAnterior();

            if (ultimo != null) {
                ultimo.setProximo(null);

            }
            found = true;

        } else {
            while (atual != null) {
                if (atual.getDado().equals(obj)) {
                    found = true;
                    break;

                }
                atual = atual.getProximo();

            }

            if (found) {
                NoD<T> anterior = atual.getAnterior();
                NoD<T> proximo = atual.getProximo();

                if (anterior != null) {
                    anterior.setProximo(proximo);

                }
                if (proximo != null) {
                    proximo.setAnterior(anterior);

                }
            }
        }

        if (found) {
            count--;

        }
    }


    public void imprimir() {
        while (count > 0) {
            NoD<T> atual = primeiro;
            int menor = primeiro.getDado().toString().length();
            int maior = ultimo.getDado().toString().length();
            int C = count;
            for (int i = 0; i < C; i++) {
                atual = primeiro;
                for (int j = 0; j < C; j++) {
                    if (atual != null && atual.getDado() != null && atual.getDado().toString().length() == menor) {
                        if (menor == maior) {
                            System.out.print(atual.getDado());
                        } else {
                            System.out.print(atual.getDado() + ", ");
                        }
                        remover(atual.getDado());
                        menor++;
                    }
                    if (menor > maior) {
                        break;
                    }
                    if (atual != null && atual.getProximo() != null) {
                        atual = atual.getProximo();
                    } else {
                        break;
                    }
                }
                if (menor > maior) {
                    break;
                }
                menor++;
            }
            System.out.println();
        }
    }

}
