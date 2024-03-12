import java.util.Scanner;

public class MainPizzaria {
    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria();
        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);

        pizzaria.adicionarPizza(1, "Margherita", 25.0);
        pizzaria.adicionarPizza(2, "Pepperoni", 30.0);
        pizzaria.adicionarPizza(3, "Calabresa", 28.0);
        pizzaria.adicionarPizza(4, "Frango com Catupiry", 30.0);
        pizzaria.adicionarPizza(5, "Portuguesa", 32.0);
        pizzaria.adicionarPizza(6, "Salmão", 34.0);
        pizzaria.adicionarPizza(7, "Atum", 29.0);

        MenuPizzaria menu = new MenuPizzaria(pizzaria, carrinho, scanner);
        menu.iniciar();

        scanner.close();
    }
}