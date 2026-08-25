import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algoritmos algoritmos = new Algoritmos();
        int opcao;

        do {
            System.out.println("\n=========================================");
            System.out.println("         MENU PRINCIPAL");
            System.out.println("=========================================");
            System.out.println("Qual você deseja executar?");
            System.out.println("1 - Verificação de Múltiplo");
            System.out.println("2 - Sistema de Login Simplificado");
            System.out.println("3 - Compra com Desconto");
            System.out.println("4 - Temperatura");
            System.out.println("5 - Os 35 Camelos");
            System.out.println("6 - Calculadora de Viagem");
            System.out.println("7 - Aluguel de Carro");
            System.out.println("0 - Sair");
            System.out.println("=========================================");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    algoritmos.verificacaoMultiplo();
                    break;

                case 2:
                    algoritmos.loginSimplificado();
                    break;

                case 3:
                    algoritmos.compraComDesconto();
                    break;

                case 4:
                    algoritmos.temperatura();
                    break;

                case 5:
                    algoritmos.os35Camelos();
                    break;

                case 6:
                    algoritmos.calculadoraViagem();
                    break;

                case 7:
                    algoritmos.aluguelDeCarro();
                    break;

                case 0:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
