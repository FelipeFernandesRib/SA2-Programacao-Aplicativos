/*
Crie um programa que converta horas em segundos,
conforme o valor que o usuário informar quan
do solicitado a ele.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe uma quantas horas voc~e quer que sejam tranformadas em segundo:");
        float horas = leia.nextFloat();

        float segundos = horas*60*60;

        System.out.println(horas + "horas tem " + segundos + " segundos");
    }
}