/*
Escreva um programa que leia 20 valores inteiros e
informe a média deles, o maior e o menor valor.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] valoresInteiro = new int[20];
        String[] contagem = {"primeiro", "segundo", "terceiro", "quarto", "quinto",
            "sexto",  "sétimo", "oitavo", "nono", "décimo",
            "décimo primeiro", "décimo segundo", "décimo terceiro",
            "décimo quarto", "décimo quinto", "décimo sexto",
            "décimo sétimo", "décimo oitavo", "décimo nono", "vigésimo"
        };

        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 20; i++){
            System.out.println("Informe o " + contagem[i] + " valor: ");
            valoresInteiro[i] = leia.nextInt();
        }

        float media = 0;

        for (int i = 0; i < valoresInteiro.length; i++) {
            media += valoresInteiro[i];
        }



        int maior = valoresInteiro[0];
        int menor = valoresInteiro[0];

        for (int i = 0; i < valoresInteiro.length; i++) {
            if(valoresInteiro[i] > maior){
                maior = valoresInteiro[i];
            }
            else if(valoresInteiro[i] < menor){
                menor = valoresInteiro[i];
            }
        }

        System.out.println("Media: " + media/20);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}