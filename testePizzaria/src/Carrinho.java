import java.util.ArrayList;
import java.util.Scanner;

class Carrinho {
    ArrayList<Pizza> pizzas;

    public Carrinho() {
        this.pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void exibirCarrinho() {
        System.out.println("==== Carrinho ====");
        for (Pizza pizza : pizzas) {
        	System.out.println(pizza.numero + ". " + pizza.sabor + " - R$ " + pizza.preco);
        }
        System.out.println("O valor da compra é " + calcularTotal());
        System.out.println("==================");
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.preco;
        }
        return total;
    }
    
}