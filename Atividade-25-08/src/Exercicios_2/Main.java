package Exercicios_2;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opt = -1;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Loja de Roupas");
            System.out.println("2 - Trilha");
            System.out.println("3 - Máscara Tribal");
            System.out.println("4 - Personagem de Mangá");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    menuLojaDeRoupas();
                    break;

                case 2:
                    menuTrilha();
                    break;

                case 3:
                    menuMascaraTribal();
                    break;

                case 4:
                    menuPersonagemManga();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opt != 0);

        scanner.close();
    }

    static void menuLojaDeRoupas() {
        LojaDeRoupas loja = new LojaDeRoupas("Weslley Store", "Rua dos Dominicanos", 1200);
        int opt = -1;

        do {
            System.out.println("\n===== LOJA DE ROUPAS =====");
            System.out.println("1 - Mostrar dados da loja");
            System.out.println("2 - Vender roupa");
            System.out.println("3 - Adicionar roupa");
            System.out.println("4 - Remover roupa");
            System.out.println("5 - Alterar nome da loja");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Nome: " + loja.getNome());
                    System.out.println("Endereço: " + loja.getEndereco());
                    System.out.println("Quantidade de roupas: " + loja.getQuantidadeRoupas());
                    break;

                case 2:
                    loja.venderRoupa();
                    System.out.println("Roupa vendida! Quantidade atual: " + loja.getQuantidadeRoupas());
                    break;

                case 3:
                    loja.adicionarRoupa();
                    System.out.println("Roupa adicionada! Quantidade atual: " + loja.getQuantidadeRoupas());
                    break;

                case 4:
                    loja.removerRoupa();
                    System.out.println("Roupa removida! Quantidade atual: " + loja.getQuantidadeRoupas());
                    break;

                case 5:
                    System.out.print("Digite o novo nome da loja: ");
                    scanner.nextLine();
                    String novoNome = scanner.nextLine();
                    loja.setNome(novoNome);
                    System.out.println("Nome atualizado para: " + loja.getNome());
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opt != 0);
    }

    static void menuTrilha() {
        Trilha trilha = new Trilha("Trilha do Pico", 23, "Intermediário");
        int opt = -1;

        do {
            System.out.println("\n===== TRILHA =====");
            System.out.println("1 - Mostrar dados da trilha");
            System.out.println("2 - Calcular tempo estimado");
            System.out.println("3 - Estender trilha");
            System.out.println("4 - Verificar se é recomendada para iniciantes");
            System.out.println("5 - Alterar nome da trilha");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Nome: " + trilha.getNome());
                    System.out.println("Distância: " + trilha.getDistancia() + " km");
                    System.out.println("Nível de dificuldade: " + trilha.getNivelDificuldade());
                    break;

                case 2:
                    System.out.println("Tempo estimado: " + trilha.calcularTempoEstimado() + " horas");
                    break;

                case 3:
                    System.out.print("Quantos km deseja adicionar à trilha? ");
                    float metros = scanner.nextFloat();
                    trilha.estenderTrilha(metros);
                    System.out.println("Nova distância: " + trilha.getDistancia() + " km");
                    break;

                case 4:
                    if (trilha.recomendadaParaIniciantes())
                        System.out.println("Sim, essa trilha é recomendada para iniciantes.");
                    else
                        System.out.println("Não, essa trilha não é recomendada para iniciantes.");
                    break;

                case 5:
                    System.out.print("Digite o novo nome da trilha: ");
                    scanner.nextLine();
                    String novoNome = scanner.nextLine();
                    trilha.setNome(novoNome);
                    System.out.println("Nome atualizado para: " + trilha.getNome());
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opt != 0);
    }

    static void menuMascaraTribal() {
        MascaraTribal mascara = new MascaraTribal("Madeira", "Tradição Africana", "Cerimonial");
        int opt = -1;

        do {
            System.out.println("\n===== MÁSCARA TRIBAL =====");
            System.out.println("1 - Exibir informações");
            System.out.println("2 - Calcular preço com desconto");
            System.out.println("3 - Verificar se é feita de madeira");
            System.out.println("4 - Alterar expressão");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    mascara.exibirInformacoes();
                    break;

                case 2:
                    System.out.print("Digite o preço original (R$): ");
                    float preco = scanner.nextFloat();
                    System.out.print("Digite a porcentagem de desconto (%): ");
                    float desconto = scanner.nextFloat();
                    float precoFinal = mascara.calcularPrecoComDesconto(preco, desconto);
                    System.out.println("Preço com desconto: R$ " + precoFinal);
                    break;

                case 3:
                    if (mascara.ehFeitaDeMadeira())
                        System.out.println("Sim, a máscara é feita de madeira.");
                    else
                        System.out.println("Não, a máscara é feita de outro material.");
                    break;

                case 4:
                    System.out.print("Digite a nova expressão (Solene / Cerimonial / Mística): ");
                    scanner.nextLine();
                    String novaExpressao = scanner.nextLine();
                    mascara.setExpressao(novaExpressao);
                    System.out.println("Expressão atualizada para: " + mascara.getExpressao());
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opt != 0);
    }

    static void menuPersonagemManga() {
        PersonagemManga personagem = new PersonagemManga("Kaito", "Espetado Shonen", 9500);
        int opt = -1;

        do {
            System.out.println("\n===== PERSONAGEM DE MANGÁ =====");
            System.out.println("1 - Mostrar dados do personagem");
            System.out.println("2 - Treinar (aumentar poder)");
            System.out.println("3 - Mudar corte de cabelo");
            System.out.println("4 - Verificar se é um protagonista poderoso");
            System.out.println("5 - Alterar nome do personagem");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Nome: " + personagem.getNome());
                    System.out.println("Estilo de Cabelo: " + personagem.getEstiloCabelo());
                    System.out.println("Nível de Poder: " + personagem.getNivelPoder());
                    break;

                case 2:
                    System.out.print("Quanto de poder o personagem ganhou no treino? ");
                    int incremento = scanner.nextInt();
                    personagem.treinar(incremento);
                    System.out.println("Novo nível de poder: " + personagem.getNivelPoder());
                    break;

                case 3:
                    System.out.print("Digite o novo estilo de cabelo (ex: Franja Longa, Espetado, Ondulado): ");
                    scanner.nextLine();
                    String novoEstilo = scanner.nextLine();
                    personagem.mudarCorteCabelo(novoEstilo);
                    System.out.println("Estilo de cabelo alterado para: " + personagem.getEstiloCabelo());
                    break;

                case 4:
                    if (personagem.ehProtagonistaPoderoso())
                        System.out.println("Sim! O nível de poder é de mais de 8000!");
                    else
                        System.out.println("Não, o nível de poder ainda é moderado.");
                    break;

                case 5:
                    System.out.print("Digite o novo nome do personagem: ");
                    scanner.nextLine();
                    String novoNome = scanner.nextLine();
                    personagem.setNome(novoNome);
                    System.out.println("Nome atualizado para: " + personagem.getNome());
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opt != 0);
    }
}