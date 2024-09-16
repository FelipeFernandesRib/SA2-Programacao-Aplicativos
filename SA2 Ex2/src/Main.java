/*
 2. Faça um programa que leia 4 valores,
calcule a média e imprima positivo ou negativo
(para ser positivo a média deve ser acima de 1).
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o primeiro nome: ");
        float numero1 = leia.nextFloat();

        System.out.println("Informe o segundo nome: ");
        float numero2 = leia.nextFloat();

        System.out.println("Informe o terceiro nome: ");
        float numero3 = leia.nextFloat();

        System.out.println("Informe o quarto nome: ");
        float numero4 = leia.nextFloat();

        float media = (numero1 + numero2 + numero3 + numero4) / 4;

        if (media >1){
            System.out.println("A média é " + media + " e ela é positiva");
        }
        else{
            System.out.println("A média é " + media + " e ela é negativa");
        }

    }
}