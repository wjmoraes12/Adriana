import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}