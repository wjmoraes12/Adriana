import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de camelos: ");
        int camelos = sc.nextInt();

        System.out.print("Digite o denominador da primeira parcela: ");
        int parcela1 = sc.nextInt();

        System.out.print("Digite o denominador da segunda parcela: ");
        int parcela2 = sc.nextInt();

        System.out.print("Digite o denominador da terceira parcela: ");
        int parcela3 = sc.nextInt();

        int camelosComExtra = camelos + 1;

        int parte1 = camelosComExtra / parcela1;
        int parte2 = camelosComExtra / parcela2;
        int parte3 = camelosComExtra / parcela3;

        System.out.println("\n=== DIVISÃO DOS CAMELOS ===");
        System.out.println("Primeira pessoa: " + parte1 + " camelos");
        System.out.println("Segunda pessoa: " + parte2 + " camelos");
        System.out.println("Terceira pessoa: " + parte3 + " camelos");
        System.out.println("Camelo restante: " + (camelosComExtra - parte1 - parte2 - parte3));

        sc.close();
    }
}
