package Main;

import Basica.Fila;
import Estrutura.Pilha;

public class Principal {
    public static void main(String[] args) {

        Fila fila = new Fila(20);
        Pilha pilha = new Pilha(20);

        char[] valores = {'A', 'B', 'C', 'D', 'E'};

        for (char valor : valores) {
            fila.adicionar(valor);
        }

        System.out.println("Fila original:");
        fila.mostrar();

        // Coloca os elementos da fila na pilha
        while (!fila.vazia()) {
            pilha.empilhar(fila.remover());
        }

        // Retira da pilha e coloca novamente na fila
        while (!pilha.vazia()) {
            fila.adicionar(pilha.desempilhar());
        }

        System.out.println("Fila invertida:");
        fila.mostrar();
    }
}
