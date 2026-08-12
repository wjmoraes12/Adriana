import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
        sc.close();
    }
}
