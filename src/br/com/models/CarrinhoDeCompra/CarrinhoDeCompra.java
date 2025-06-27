package br.com.models.CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> carrinhoDeCompra;

    public CarrinhoDeCompra() {
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompra.add(new Item( nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        carrinhoDeCompra.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }
    public double calcularValorTotal() {
        double valorTotalCarrinho = 0.0;
        for (Item item : carrinhoDeCompra) {
            valorTotalCarrinho += item.getValorTotal();
        }
        return valorTotalCarrinho;
    }
    public List<Item> exibirItems() {
        return Collections.unmodifiableList(carrinhoDeCompra);
    }
}
