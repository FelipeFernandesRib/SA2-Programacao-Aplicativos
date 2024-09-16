/*
 1. Dada a lista L = [5, 7, 2, 9, 4, 1, 3],
escreva um programa que imprima as seguintes informações:
a) tamanho da lista;
b) maior valor da lista;
c) menor valor da lista;
d) soma de todos os elementos da lista;
e) lista em ordem crescente;
f) lista em ordem decrescente.
*/

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Integer[] L = {5, 7, 2, 9, 4, 1, 3};

        // a) Tamanho da lista
        System.out.println("Tamanho da lista: " + L.length);

        // b) Maior valor da lista
        int max = Collections.max(Arrays.asList(L));
        System.out.println("Maior valor da lista: " + max);

        // c) Menor valor da lista
        int min = Collections.min(Arrays.asList(L));
        System.out.println("Menor valor da lista: " + min);

        // d) Soma de todos os elementos da lista
        int sum = Arrays.stream(L).mapToInt(Integer::intValue).sum();
        System.out.println("Soma de todos os elementos da lista: " + sum);

        // e) Lista em ordem crescente
        Arrays.sort(L);
        System.out.println("Lista em ordem crescente: " + Arrays.toString(L));

        // f) Lista em ordem decrescente
        Arrays.sort(L, Collections.reverseOrder());
        System.out.println("Lista em ordem decrescente: " + Arrays.toString(L));
    }
}