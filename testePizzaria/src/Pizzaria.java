import java.util.ArrayList;

class Pizzaria {
    ArrayList<Pizza> cardapio;

    public Pizzaria() {
        this.cardapio = new ArrayList<>();
    }

    public void adicionarPizza(int numero, String sabor, double preco) {
        Pizza novaPizza = new Pizza(numero,sabor, preco);
        cardapio.add(novaPizza);
    }

    public void exibirCardapio() {
        System.out.println("==== Cardápio ====");
        for (Pizza pizza : cardapio) {
        	System.out.println(pizza.numero + ". " + pizza.sabor + " - R$ " + pizza.preco);
        }
        System.out.println("==================");
    }
}