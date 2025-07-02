package br.com.List.exercicios.SomaDeNumeros;

import java.util.List;


public class SomaDeNumeros {
    public List<Integer> listaNumeros;

    public void adicionaNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int somaDosNumero = 0;
        if(!listaNumeros.isEmpty()) {
            for (Integer num : listaNumeros) {
            somaDosNumero += num;
            }
        }
        return somaDosNumero;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer num : listaNumeros) {
                if (num >= menorNumero) {
                    menorNumero = num;
                }
            }
        }
        return menorNumero;
    }

}
