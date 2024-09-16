/*
 5. Crie uma função que receba como parâmetro uma lista,
 com valores de qualquer tipo. A função deve imprimir
 todos os elementos da lista, enumerando-os
 */

import java.util.ArrayList;
public class Main {
    public static <t >void criarLista(ArrayList<t> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }

    }
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();
        lista.add("Quero");
        lista.add(10000);
        lista.add("e vou conseguir");

        criarLista(lista);

    }
}