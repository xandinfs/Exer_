package Main;

import java.util.Scanner;
import Estrutura.Pilha;

public class Principal {

    public static boolean ehPalindromo(String texto) {

        texto = texto.toLowerCase();

        Pilha pilha = new Pilha(texto.length());

        // Empilha todos os caracteres
        for (int i = 0; i < texto.length(); i++) {
            pilha.empilhar(texto.charAt(i));
        }

        // Compara a String original com a ordem retirada da pilha
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != pilha.desempilhar()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        scanner.close();
    }
}
