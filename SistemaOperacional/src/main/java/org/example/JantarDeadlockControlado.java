// Pacote padrão do projeto
package org.example;

// Importação da classe de lock para controle de concorrência
import java.util.concurrent.locks.ReentrantLock;

// Classe que representa cada garfo da mesa
class Garfo {
    // Lock exclusivo para cada garfo (mutex)
    private final ReentrantLock lock = new ReentrantLock();

    // Método para pegar o garfo (adquire o lock)
    public void pegar() {
        lock.lock();
    }

    // Método para largar o garfo (libera o lock)
    public void largar() {
        lock.unlock();
    }
}

// Classe Filosofo, que herda de Thread para executar concorrente
class Filosofo extends Thread {
    private final int id;                  // Identificador único do filósofo
    private final Garfo garfoEsquerdo;     // Referência ao garfo à esquerda
    private final Garfo garfoDireito;      // Referência ao garfo à direita
    private int ciclos = 0;                // Contador de quantas vezes o filósofo comeu

    // Construtor que inicializa os atributos
    public Filosofo(int id, Garfo garfoEsquerdo, Garfo garfoDireito) {
        this.id = id;
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
    }

    // Método que simula o filósofo pensando (aqui só loga no console)
    private void pensar() {
        System.out.println("Filósofo " + id + " está pensando.");
    }

    // Método que simula o filósofo comendo (aqui só loga no console)
    private void comer() {
        System.out.println("Filósofo " + id + " está comendo.");
    }

    // Método que define o comportamento da thread
    @Override
    public void run() {
        while (ciclos < 5) { // Cada filósofo realiza 5 ciclos de pensar e comer
            pensar();

            // Define a ordem de pegar os garfos para evitar deadlock
            Garfo primeiroGarfo = garfoEsquerdo;
            Garfo segundoGarfo = garfoDireito;

            // Compara os objetos pelo identityHashCode para decidir a ordem
            // Isso garante que todos os filósofos peguem os garfos na mesma ordem relativa
            if (System.identityHashCode(garfoDireito) < System.identityHashCode(garfoEsquerdo)) {
                primeiroGarfo = garfoDireito;
                segundoGarfo = garfoEsquerdo;
            }

            // Pega o primeiro garfo
            primeiroGarfo.pegar();
            System.out.println("Filósofo " + id + " pegou o primeiro garfo.");

            // Pega o segundo garfo
            segundoGarfo.pegar();
            System.out.println("Filósofo " + id + " pegou o segundo garfo.");

            // Come
            comer();

            // Libera o primeiro garfo
            primeiroGarfo.largar();
            System.out.println("Filósofo " + id + " devolveu o primeiro garfo.");

            // Libera o segundo garfo
            segundoGarfo.largar();
            System.out.println("Filósofo " + id + " devolveu o segundo garfo.");

            // Incrementa o número de ciclos completados pelo filósofo
            ciclos++;
        }

        // Ao finalizar os 5 ciclos, exibe mensagem de encerramento
        System.out.println("Filósofo " + id + " finalizou após " + ciclos + " ciclos.");
    }
}

// Classe principal do programa
public class JantarDeadlockControlado {
    public static void main(String[] args) {
        int numFilosofos = 5;                       // Define o número de filósofos e garfos
        Garfo[] garfos = new Garfo[numFilosofos];   // Array para armazenar os garfos

        // Cria os objetos Garfo e adiciona ao array
        for (int i = 0; i < numFilosofos; i++) {
            garfos[i] = new Garfo();
        }

        // Cria os objetos Filosofo, associando a cada um seu garfo à esquerda e à direita
        Filosofo[] filosofos = new Filosofo[numFilosofos];
        for (int i = 0; i < numFilosofos; i++) {
            // Garfo à esquerda é o garfo de mesmo índice
            Garfo garfoEsquerdo = garfos[i];
            // Garfo à direita é o próximo no array, com ciclo circular usando módulo
            Garfo garfoDireito = garfos[(i + 1) % numFilosofos];
            // Instancia o filósofo com os dois garfos
            filosofos[i] = new Filosofo(i, garfoEsquerdo, garfoDireito);
            // Inicia a thread do filósofo
            filosofos[i].start();
        }
    }
}
