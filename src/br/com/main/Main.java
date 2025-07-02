
package br.com.main;

import br.com.List.exercicios.OrdenacaoDeNumeros.OrdenacaoDeNumeros;

import java.util.List;

public class Main {
        public static void main(String[] args) {
                System.out.println("--- Testando OrdenacaoNumeros ---");


                OrdenacaoDeNumeros ordenacao = new OrdenacaoDeNumeros();


                System.out.println("\nAdicionando números:");
                ordenacao.adicionarNumero(50);
                ordenacao.adicionarNumero(10);
                ordenacao.adicionarNumero(30);
                ordenacao.adicionarNumero(5);
                ordenacao.adicionarNumero(40);
                ordenacao.adicionarNumero(20);

                System.out.println("\n--- Ordenação Ascendente ---");
                List<Integer> numerosAsc = ordenacao.ordenarAscendente();
                System.out.println("Números em ordem ascendente: " + numerosAsc);


                System.out.println("\n--- Ordenação Descendente ---");
                List<Integer> numerosDesc = ordenacao.ordenarDescendente();
                System.out.println("Números em ordem descendente: " + numerosDesc);

                System.out.println("\n--- Fim do Teste ---");
        }
}