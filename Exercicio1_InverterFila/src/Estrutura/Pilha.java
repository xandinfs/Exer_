package Estrutura;

public class Pilha {
    private char[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new char[capacidade];
        topo = -1;
    }

    public void empilhar(char elemento) {
        if (topo == elementos.length - 1) {
            System.out.println("Pilha cheia!");
            return;
        }

        topo++;
        elementos[topo] = elemento;
    }

    public char desempilhar() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return '\0';
        }

        char elemento = elementos[topo];
        topo--;

        return elemento;
    }

    public boolean vazia() {
        return topo == -1;
    }
}
