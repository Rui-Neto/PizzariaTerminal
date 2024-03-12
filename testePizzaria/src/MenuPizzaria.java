import java.util.ArrayList;
import java.util.Scanner;

class MenuPizzaria {
    private Pizzaria pizzaria;
    private Carrinho carrinho;
    private Scanner scanner;

    public MenuPizzaria(Pizzaria pizzaria, Carrinho carrinho, Scanner scanner) {
        this.pizzaria = pizzaria;
        this.carrinho = carrinho;
        this.scanner = scanner;
    }

    public void exibirOpcoes() {
        System.out.println("1. Exibir Cardápio");
        System.out.println("2. Adicionar Pizza ao Carrinho");
        System.out.println("3. Exibir Carrinho");
        System.out.println("4. Sair");
    }

    public void adicionarPizzaAoCarrinho() {
        pizzaria.exibirCardapio();
        System.out.print("Escolha uma pizza pelo número: ");
        int numeroPizza = scanner.nextInt();
        if (numeroPizza >= 1 && numeroPizza <= pizzaria.cardapio.size()) {
            Pizza pizzaEscolhida = pizzaria.cardapio.get(numeroPizza - 1);
            carrinho.adicionarPizza(pizzaEscolhida);
            System.out.println("Pizza adicionada ao carrinho: " + pizzaEscolhida.sabor);
        } else {
            System.out.println("Número de pizza inválido.");
        }
    }

    public void iniciar() {
        int opcao;
        do {
            exibirOpcoes();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pizzaria.exibirCardapio();
                    iniciar();
                case 2:
                    adicionarPizzaAoCarrinho();
                    iniciar();
                case 3:
                    carrinho.exibirCarrinho();
                    iniciar();
                    break;
                case 4:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao > 4 && opcao != 0);
    }
}
