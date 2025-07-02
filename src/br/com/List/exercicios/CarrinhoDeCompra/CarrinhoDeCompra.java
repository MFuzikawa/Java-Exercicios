package br.com.List.exercicios.CarrinhoDeCompra;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        System.out.println("--- Building the Shopping Cart ---");

        // 1. Create an instance of CarrinhoDeCompra
        CarrinhoDeCompra meuCarrinho = new CarrinhoDeCompra();

        // 2. Add some items to the cart
        System.out.println("Adding items to the cart...");
        meuCarrinho.adicionarItem("Notebook Dell", 3500.00, 1);
        meuCarrinho.adicionarItem("Mouse Gamer", 150.00, 2);
        meuCarrinho.adicionarItem("Monitor Ultrawide", 1800.00, 1);
        meuCarrinho.adicionarItem("Teclado Mecânico", 400.00, 1);

        System.out.println("\n--- Current Items in the Cart ---");

        // 3. Display the items and their total values
        for (Item item : meuCarrinho.exibirItems()) {
            System.out.printf("Item: %s | Price: R$ %.2f | Qty: %d | Total: R$ %.2f\n",
                    item.getNome(), item.getPreco(), item.getQuantidade(), item.getValorTotal());
        }

        // 4. Calculate and display the total value of the entire cart
        double valorTotalCarrinho = meuCarrinho.calcularValorTotal();
        System.out.printf("\n--- Total value of the cart: R$ %.2f ---\n", valorTotalCarrinho);

        // 5. Remove an item from the cart
        System.out.println("\n--- Removing 'Mouse Gamer' from the cart ---");
        meuCarrinho.removerItem("Mouse Gamer");

        // 6. Display the updated list of items and the new total
        System.out.println("\n--- Updated Items in the Cart ---");
        for (Item item : meuCarrinho.exibirItems()) {
            System.out.printf("Item: %s | Price: R$ %.2f | Qty: %d | Total: R$ %.2f\n",
                    item.getNome(), item.getPreco(), item.getQuantidade(), item.getValorTotal());
        }

        double novoValorTotalCarrinho = meuCarrinho.calcularValorTotal();
        System.out.printf("\n--- New total value of the cart: R$ %.2f ---\n", novoValorTotalCarrinho);

        System.out.println("\n--- End of Test ---");
    }
}
