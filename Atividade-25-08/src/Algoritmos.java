import java.util.Scanner;

public class Algoritmos {
    static Scanner sc = new Scanner(System.in);

    public static void verificacaoMultiplo() {
        System.out.flush();

        System.out.println("Insira um valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Insira outro valor: ");
        int valor2 = sc.nextInt();

        if (valor2 == 0) {
            System.out.println("O segundo número não pode ser zero.");
        } else if (valor1 % valor2 == 0) {
            System.out.println("O número " + valor1 + " é múltiplo de " + valor2);
        } else {
            System.out.println("O número " + valor1 + " NÃO é múltiplo de " + valor2);
        }
    }

    public static void loginSimplificado(){
        System.out.flush();

        System.out.println("Insira a senha: ");
        String senha = sc.next();

        if(senha.equals("1234")){
            System.out.print("Acesso permitido");
        }else{
            System.out.print("Acesso negado");
        }
    }

    public static void compraComDesconto() {

        float total = 0;

        System.out.println("=== LISTA DE COMPRAS ===");

        total += quantidade(
                "Arroz (5 kg) - Quantidade: ",
                "Arroz (5 kg) - Preço: R$ "
        );

        total += quantidade(
                "Feijão (1 ou 2 kg) - Quantidade: ",
                "Feijão - Preço: R$ "
        );

        total += quantidade(
                "Óleo de soja (900 ml) - Quantidade: ",
                "Óleo de soja - Preço: R$ "
        );

        total += quantidade(
                "Açúcar (1 kg) - Quantidade: ",
                "Açúcar - Preço: R$ "
        );

        total += quantidade(
                "Café (250 g ou 500 g) - Quantidade: ",
                "Café - Preço: R$ "
        );

        total += quantidade(
                "Macarrão (500 g) - Quantidade: ",
                "Macarrão - Preço: R$ "
        );

        total += quantidade(
                "Farinha (1 kg ou 500 g) - Quantidade: ",
                "Farinha - Preço: R$ "
        );

        total += quantidade(
                "Fubá (500 g) - Quantidade: ",
                "Fubá - Preço: R$ "
        );

        total += quantidade(
                "Molho/extrato de tomate (300 g) - Quantidade: ",
                "Molho/extrato de tomate - Preço: R$ "
        );

        total += quantidade(
                "Sal refinado (1 kg) - Quantidade: ",
                "Sal - Preço: R$ "
        );

        System.out.printf("%nTotal da compra: R$ %.2f%n", total);

        if (total > 100) {

            float desconto = total * 0.10f;
            float totalComDesconto = total - desconto;

            System.out.printf("Desconto de 10%%: R$ %.2f%n", desconto);
            System.out.printf("Total com desconto: R$ %.2f%n", totalComDesconto);

        } else {
            System.out.println("A compra não possui desconto");
        }
    }

    public static void temperatura(){
        System.out.print("Digite a tempetura em graus Celsius:  ");
        float temperatura = sc.nextFloat();

        if (temperatura >= 18) {
            System.out.println("Temperatura Agradável");
        }else{
            System.out.println("Frio");
        }
    }

    public static void os35Camelos(){
        System.out.print("Digite a quantidade de camelos: ");
        int camelos = sc.nextInt();

        int parcela1 = quantidadeParcela("Digite o denominador da primeira parcela: ");
        int parcela2 = quantidadeParcela("Digite o denominador da segunda parcela: ");
        int parcela3 = quantidadeParcela("Digite o denominador da terceira parcela: ");

        int camelosComExtra = camelos + 1;

        float parte1 = divisaoCamelos(camelosComExtra,parcela1);
        float parte2 = divisaoCamelos(camelosComExtra,parcela2);
        float parte3 = divisaoCamelos(camelosComExtra,parcela3);

        System.out.println("\n=== DIVISÃO DOS CAMELOS ===");
        System.out.println("Primeira pessoa: " + parte1 + " camelos");
        System.out.println("Segunda pessoa: " + parte2 + " camelos");
        System.out.println("Terceira pessoa: " + parte3 + " camelos");
        System.out.println("Camelo restante: " + (camelosComExtra - parte1 - parte2 - parte3));
    }

    public static void calculadoraViagem(){
        System.out.println("Insira a distância da viagem (KM): ");
        float distancia = sc.nextFloat();

        System.out.println("Insira o valor pago no combustível: ");
        float valor = sc.nextFloat();

        float qtdGasolina = distancia / 12;

        float custo;

        if (distancia > 500) {
            custo = (qtdGasolina * valor) * 0.95f;
        } else {
            custo = qtdGasolina * valor;
        }

        System.out.printf("Valor: %.2f%n", custo);
    }

    public static void aluguelDeCarro(){
        System.out.print("Insira a quantidade de dias: ");
        int dias = sc.nextInt();

        System.out.print("Insira a quilometragem percorrida: ");
        float km = sc.nextFloat();

        float diaria = 100;
        float limiteKm = 100;
        float valorKmExcedente = 0.50f;

        float custo = dias * diaria;

        if (km > limiteKm) {
            float kmExcedente = km - limiteKm;
            custo += kmExcedente * valorKmExcedente;
        }

        System.out.printf("O valor total do aluguel foi de R$ %.2f%n", custo);
    }



    //HELPERS PARA ECONOMIZAR LINHAS DE CÓDIGO
    public static float quantidade(String messageQuantidade, String messagePreco) {

        System.out.print(messageQuantidade);
        int quantidade = sc.nextInt();

        System.out.print(messagePreco);
        float preco = sc.nextFloat();

        return quantidade * preco;
    }

    public static int quantidadeParcela(String message){
        System.out.print(message);
        return sc.nextInt();
    }

    public static float divisaoCamelos(int camelostotais, int parcela){
        return camelostotais/parcela;
    }

}
