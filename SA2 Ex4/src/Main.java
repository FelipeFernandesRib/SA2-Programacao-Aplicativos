/*
 4. Crie uma função para desenhar uma linha,
usando o caractere '_' (underline).
O tamanho da linha deve ser
 definido na chamada da função.
*/

import java.util.Scanner;
public class Main {
    public static void desenharLinhar(int tamanho) {
        for (int i = 0; i < tamanho; i++){
            System.out.print("_");
        }
        System.out.println();
    }
    public static void main(String[] args) {

    System.out.println("Linha de tamanho 10:");
    desenharLinhar(10);

    System.out.println("\nLinha de tamanho 25:");
    desenharLinhar(25);

    System.out.println("\nLinha de tamanho 100:");
    desenharLinhar(100);

        Scanner leia = new Scanner(System.in);
        System.out.println("\n\nInforme o tamanho da linha que você gostaria: ");
        int tamanho = leia.nextInt();
        desenharLinhar(tamanho);


    }
}