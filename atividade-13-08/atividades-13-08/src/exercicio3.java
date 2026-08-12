import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        float valorCompra = sc.nextFloat();

        float desconto = 0;

        if (valorCompra > 100) {
            desconto = valorCompra * 0.10f;
        }

        float valorFinal = valorCompra - desconto;

        System.out.println("\n=== CAIXA ===");
        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();
    }
}