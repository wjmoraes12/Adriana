import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n======================================");
            System.out.println("          SISTEMA DE TESTES");
            System.out.println("======================================");
            System.out.println("1 - Loja de Roupas");
            System.out.println("2 - Ciclista");
            System.out.println("3 - Bicicleta");
            System.out.println("4 - Trilha");
            System.out.println("5 - Máscara");
            System.out.println("6 - Colecionador");
            System.out.println("7 - Exposição");
            System.out.println("8 - Salão de Cabelo");
            System.out.println("0 - Sair");
            System.out.println("======================================");
            System.out.print("Digite uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n=== LOJA DE ROUPAS ===");

                    System.out.print("Digite o tipo da roupa: ");
                    String tipoRoupa = scanner.nextLine();

                    System.out.print("Digite a cor da roupa: ");
                    String corRoupa = scanner.nextLine();

                    System.out.print("Digite o preço da roupa: ");
                    double precoRoupa = scanner.nextDouble();
                    scanner.nextLine();

                    Roupa roupa = new Roupa(
                            tipoRoupa,
                            corRoupa,
                            precoRoupa
                    );

                    System.out.print("Digite o material do manequim: ");
                    String materialManequim = scanner.nextLine();

                    System.out.print("Digite a cor do manequim: ");
                    String corManequim = scanner.nextLine();

                    System.out.print("Digite a roupa usada no manequim: ");
                    String roupaManequim = scanner.nextLine();

                    Manequim manequim = new Manequim(
                            materialManequim,
                            corManequim,
                            roupaManequim
                    );

                    System.out.print("Digite o nome da loja: ");
                    String nomeLoja = scanner.nextLine();

                    System.out.print("Digite o endereço da loja: ");
                    String enderecoLoja = scanner.nextLine();

                    System.out.print("Digite a quantidade de funcionários: ");
                    int funcionarios = scanner.nextInt();
                    scanner.nextLine();

                    Loja loja = new Loja(
                            nomeLoja,
                            enderecoLoja,
                            funcionarios
                    );

                    System.out.println("\n--- ROUPA ---");
                    roupa.vestir();
                    roupa.vender();
                    roupa.exibirPreco();

                    System.out.println("\n--- MANEQUIM ---");
                    manequim.vestirRoupa();
                    manequim.exibir();
                    manequim.trocarRoupa();

                    System.out.println("\n--- LOJA ---");
                    loja.abrir();
                    loja.exibirInformacoes();
                    loja.fechar();

                    break;

                case 2:

                    System.out.println("\n=== CICLISTA ===");

                    System.out.print("Digite o nome do ciclista: ");
                    String nomeCiclista = scanner.nextLine();

                    System.out.print("Digite o nível do ciclista: ");
                    String nivelCiclista = scanner.nextLine();

                    System.out.print("Digite a velocidade: ");
                    double velocidade = scanner.nextDouble();
                    scanner.nextLine();

                    Ciclista ciclista = new Ciclista(
                            nomeCiclista,
                            nivelCiclista,
                            velocidade
                    );

                    System.out.println("\n--- AÇÕES DO CICLISTA ---");

                    ciclista.pedalar();
                    ciclista.acelerar();
                    ciclista.frear();

                    break;

                case 3:

                    System.out.println("\n=== BICICLETA ===");

                    System.out.print("Digite a marca da bicicleta: ");
                    String marcaBicicleta = scanner.nextLine();

                    System.out.print("Digite o tamanho do aro: ");
                    int aro = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o tipo de freio: ");
                    String tipoFreio = scanner.nextLine();

                    Bicicleta bicicleta = new Bicicleta(
                            marcaBicicleta,
                            aro,
                            tipoFreio
                    );

                    System.out.println("\n--- AÇÕES DA BICICLETA ---");

                    bicicleta.pedalar();
                    bicicleta.calibrarPneu();
                    bicicleta.frear();

                    break;

                case 4:

                    System.out.println("\n=== TRILHA ===");

                    System.out.print("Digite o nome da trilha: ");
                    String nomeTrilha = scanner.nextLine();

                    System.out.print("Digite a distância em KM: ");
                    double distancia = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite o nível de dificuldade: ");
                    String dificuldade = scanner.nextLine();

                    Trilha trilha = new Trilha(
                            nomeTrilha,
                            distancia,
                            dificuldade
                    );

                    System.out.println("\n--- AÇÕES DA TRILHA ---");

                    trilha.iniciar();
                    trilha.mapear();
                    trilha.finalizar();

                    break;

                case 5:

                    System.out.println("\n=== MÁSCARA ===");

                    System.out.print("Digite a origem da máscara: ");
                    String origemMascara = scanner.nextLine();

                    System.out.print("Digite o material da máscara: ");
                    String materialMascara = scanner.nextLine();

                    System.out.print("Digite o estilo da máscara: ");
                    String estiloMascara = scanner.nextLine();

                    Mascara mascara = new Mascara(
                            origemMascara,
                            materialMascara,
                            estiloMascara
                    );

                    System.out.println("\n--- AÇÕES DA MÁSCARA ---");

                    mascara.exibirDetalhes();
                    mascara.restaurar();
                    mascara.catalogar();

                    break;

                case 6:

                    System.out.println("\n=== COLECIONADOR ===");

                    System.out.print("Digite o nome do colecionador: ");
                    String nomeColecionador = scanner.nextLine();

                    System.out.print("Digite a quantidade de peças: ");
                    int quantidadePecas = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a especialidade: ");
                    String especialidade = scanner.nextLine();

                    Colecionador colecionador = new Colecionador(
                            nomeColecionador,
                            quantidadePecas,
                            especialidade
                    );

                    System.out.println("\n--- AÇÕES DO COLECIONADOR ---");

                    colecionador.adicionarMascara();
                    colecionador.pesquisarOrigem();
                    colecionador.apresentarColecao();

                    break;

                case 7:

                    System.out.println("\n=== EXPOSIÇÃO ===");

                    System.out.print("Digite o nome da exposição: ");
                    String nomeExposicao = scanner.nextLine();

                    System.out.print("Digite o local da exposição: ");
                    String localExposicao = scanner.nextLine();

                    System.out.print("Digite a quantidade de máscaras: ");
                    int quantidadeMascaras = scanner.nextInt();
                    scanner.nextLine();

                    Exposicao exposicao = new Exposicao(
                            nomeExposicao,
                            localExposicao,
                            quantidadeMascaras
                    );

                    System.out.println("\n--- AÇÕES DA EXPOSIÇÃO ---");

                    exposicao.abrirExposicao();
                    exposicao.informarAcervo();
                    exposicao.encerrarExposicao();

                    break;

                case 8:

                    System.out.println("\n=== SALÃO DE CABELO ===");

                    System.out.println("\n--- CLIENTE ---");

                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefoneCliente = scanner.nextLine();

                    System.out.print("Digite o tipo de cabelo: ");
                    String tipoCabelo = scanner.nextLine();

                    Cliente cliente = new Cliente(
                            nomeCliente,
                            telefoneCliente,
                            tipoCabelo
                    );

                    System.out.println("\n--- CORTE ---");

                    System.out.print("Digite o estilo do corte: ");
                    String estiloCorte = scanner.nextLine();

                    System.out.print("Digite o comprimento: ");
                    String comprimento = scanner.nextLine();

                    System.out.print("Digite o preço do corte: ");
                    double precoCorte = scanner.nextDouble();
                    scanner.nextLine();

                    Corte corte = new Corte(
                            estiloCorte,
                            comprimento,
                            precoCorte
                    );

                    System.out.println("\n--- CABELEIREIRO ---");

                    System.out.print("Digite o nome do cabeleireiro: ");
                    String nomeCabeleireiro = scanner.nextLine();

                    System.out.print("Digite a especialidade: ");
                    String especialidadeCabeleireiro = scanner.nextLine();

                    System.out.print("Digite os anos de experiência: ");
                    int anosExperiencia = scanner.nextInt();
                    scanner.nextLine();

                    Cabeleireiro cabeleireiro = new Cabeleireiro(
                            nomeCabeleireiro,
                            especialidadeCabeleireiro,
                            anosExperiencia
                    );

                    System.out.println("\n--- AÇÕES DO CLIENTE ---");

                    cliente.agendarCorte();
                    cliente.escolherEstilo();
                    cliente.atualizarTelefone();

                    System.out.println("\n--- AÇÕES DO CORTE ---");

                    corte.realizarCorte();
                    corte.alterarEstilo(estiloCorte);
                    corte.exibirPreco();

                    System.out.println("\n--- AÇÕES DO CABELEIREIRO ---");

                    cabeleireiro.atenderCliente();
                    cabeleireiro.demonstrarEspecialidade();
                    cabeleireiro.informarExperiencia();

                    break;

                case 0:

                    System.out.println("\n======================================");
                    System.out.println("       Programa encerrado!");
                    System.out.println("======================================");

                    break;

                default:

                    System.out.println("\nOpção inválida! Digite uma opção de 0 a 8.");

                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}