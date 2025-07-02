package br.com.List.exercicios.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros {
    List<Integer> numberList;

    public OrdenacaoDeNumeros() {
        this.numberList = new ArrayList<>();
    }
    public void adicionarNumero(int number) {
        numberList.add(number);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> ordemAscendente = new ArrayList<>(numberList);
        Collections.sort(ordemAscendente);

        return ordemAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDescendente = new ArrayList<>(numberList);
        Collections.sort(ordemDescendente, Collections.reverseOrder());

        return ordemDescendente;
    }
}
