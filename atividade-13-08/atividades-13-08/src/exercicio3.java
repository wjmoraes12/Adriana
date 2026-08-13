import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LISTA DE COMPRAS ===");

        System.out.print("Arroz (5 kg) - Quantidade: ");
        int qtdArroz = sc.nextInt();
        System.out.print("Arroz (5 kg) - Preço: R$ ");
        float precoArroz = sc.nextFloat();

        System.out.print("Feijão (1 ou 2 kg) - Quantidade: ");
        int qtdFeijao = sc.nextInt();
        System.out.print("Feijão - Preço: R$ ");
        float precoFeijao = sc.nextFloat();

        System.out.print("Óleo de soja (900 ml) - Quantidade: ");
        int qtdOleo = sc.nextInt();
        System.out.print("Óleo de soja - Preço: R$ ");
        float precoOleo = sc.nextFloat();

        System.out.print("Açúcar (1 kg) - Quantidade: ");
        int qtdAcucar = sc.nextInt();
        System.out.print("Açúcar - Preço: R$ ");
        float precoAcucar = sc.nextFloat();

        System.out.print("Café (250 g ou 500 g) - Quantidade: ");
        int qtdCafe = sc.nextInt();
        System.out.print("Café - Preço: R$ ");
        float precoCafe = sc.nextFloat();

        System.out.print("Macarrão (500 g) - Quantidade: ");
        int qtdMacarrao = sc.nextInt();
        System.out.print("Macarrão - Preço: R$ ");
        float precoMacarrao = sc.nextFloat();

        System.out.print("Farinha (1 kg ou 500 g) - Quantidade: ");
        int qtdFarinha = sc.nextInt();
        System.out.print("Farinha - Preço: R$ ");
        float precoFarinha = sc.nextFloat();

        System.out.print("Fubá (500 g) - Quantidade: ");
        int qtdFuba = sc.nextInt();
        System.out.print("Fubá - Preço: R$ ");
        float precoFuba = sc.nextFloat();

        System.out.print("Molho/extrato de tomate (300 g) - Quantidade: ");
        int qtdMolho = sc.nextInt();
        System.out.print("Molho/extrato de tomate - Preço: R$ ");
        float precoMolho = sc.nextFloat();

        System.out.print("Sal refinado (1 kg) - Quantidade: ");
        int qtdSal = sc.nextInt();
        System.out.print("Sal - Preço: R$ ");
        float precoSal = sc.nextFloat();

        float parcialArroz = qtdArroz * precoArroz;
        float parcialFeijao = qtdFeijao * precoFeijao;
        float parcialOleo = qtdOleo * precoOleo;
        float parcialAcucar = qtdAcucar * precoAcucar;
        float parcialCafe = qtdCafe * precoCafe;
        float parcialMacarrao = qtdMacarrao * precoMacarrao;
        float parcialFarinha = qtdFarinha * precoFarinha;
        float parcialFuba = qtdFuba * precoFuba;
        float parcialMolho = qtdMolho * precoMolho;
        float parcialSal = qtdSal * precoSal;

        float valorCompra = parcialArroz + parcialFeijao + parcialOleo + parcialAcucar + parcialCafe + parcialMacarrao + parcialFarinha + parcialFuba + parcialMolho + parcialSal;

        float desconto = 0;

        if (valorCompra > 100) {
            desconto = valorCompra * 0.10f;
        }

        float valorFinal = valorCompra - desconto;

        System.out.println("\n================ CAIXA ================");

        System.out.printf("%-25s %-5s %-12s%n", "ITEM", "QTD", "PARCIAL");

        System.out.println("----------------------------------------");

        System.out.printf("%-25s %-5d R$ %.2f%n", "Arroz (5 kg)", qtdArroz, parcialArroz);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Feijão", qtdFeijao, parcialFeijao);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Óleo (900 ml)", qtdOleo, parcialOleo);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Açúcar (1 kg)", qtdAcucar, parcialAcucar);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Café", qtdCafe, parcialCafe);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Macarrão (500 g)", qtdMacarrao, parcialMacarrao);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Farinha", qtdFarinha, parcialFarinha);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Fubá (500 g)", qtdFuba, parcialFuba);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Molho de tomate", qtdMolho, parcialMolho);

        System.out.printf("%-25s %-5d R$ %.2f%n", "Sal (1 kg)", qtdSal, parcialSal);

        System.out.println("----------------------------------------");

        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto:        R$ %.2f%n", desconto);
        System.out.printf("VALOR FINAL:     R$ %.2f%n", valorFinal);

        System.out.println("========================================");

        sc.close();
    }
}
