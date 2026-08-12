import java.util.Scanner;

public class exercicio1 {

    public static int inputData(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERRO: digite um número válido.");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        int numero1 = inputData(sc);

        System.out.println("Insira o segundo valor: ");
        int numero2 = inputData(sc);

        if (numero2 == 0) {
            System.out.println("O segundo número não pode ser zero.");
        } else if (numero1 % numero2 == 0) {
            System.out.println("O número " + numero1 + " é multiplo de " + numero2);
        } else {
            System.out.println("O número " + numero1 + " não é multiplo de " + numero2);
        }

        sc.close();
    }
}
