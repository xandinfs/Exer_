package Basica;

public class Fila {
    private char[] elementos;
    private int tamanho;

    public Fila(int capacidade) {
        elementos = new char[capacidade];
        tamanho = 0;
    }

    public void adicionar(char elemento) {
        if (tamanho == elementos.length) {
            System.out.println("Fila cheia!");
            return;
        }

        elementos[tamanho] = elemento;
        tamanho++;
    }

    public char remover() {
        if (tamanho == 0) {
            System.out.println("Fila vazia!");
            return '\0';
        }

        char removido = elementos[0];

        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho--;
        return removido;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public void mostrar() {
        System.out.print("Fila: ");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }

        System.out.println();
    }
}
