import java.util.Scanner;

public class calculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE MÉDIA FINAL ===");

        System.out.print("Digite a nota de P1 (Prova1): ");
        double p1 = sc.nextDouble();

        System.out.print("Digite a nota de E1 (Entrega E1): ");
        double e1 = sc.nextDouble();

        System.out.print("Digite a nota de E2 (Entrega E2): ");
        double e2 = sc.nextDouble();

        System.out.print("Digite o valor de X (Atividades extras): ");
        double x = sc.nextDouble();

        System.out.print("Digite a nota de SUB (Prova substitutiva): ");
        double sub = sc.nextDouble();

        System.out.print("Digite a nota de API (Aprendizagem por Projeto Integrado): ");
        double api = sc.nextDouble();

        System.out.print("Digite a nota de EXF (Exame Final): ");
        double exf = sc.nextDouble();

        // Média base ponderada (SUB entra com peso 0.15)
        double mb = p1 * 0.5 + e1 * 0.2 + e2 * 0.3 + x + sub * 0.15;

        // mesma expressão, subtraindo 5.9 (usada como "gatilho")
        double mbMenos59 = p1 * 0.5 + e1 * 0.2 + e2 * 0.3 + x + (sub * 0.15) - 5.9;

        // max(mbMenos59, 0)
        double maxParte = Math.max(mbMenos59, 0);

        // fatorAPI vira 1 se mbMenos59 > 0 (média base > 5.9)
        // vira 0 se mbMenos59 < 0
        // evita divisão por zero quando mbMenos59 = 0
        double fatorAPI;
        if (mbMenos59 != 0) {
            fatorAPI = maxParte / mbMenos59;
        } else {
            fatorAPI = 0;
        }

        // parte base da fórmula: (MB * 0.5) + fatorAPI * API * 0.5
        double parteBase = (mb * 0.5) + (fatorAPI * api * 0.5);

        // resultado final = max(parteBase, EXF)
        double resultado = Math.max(parteBase, exf);

        System.out.println();
        System.out.printf("Média base (MB) considerada: %.2f%n", mb);
        System.out.printf("Fator de bônus da API aplicado (0 ou 1): %.0f%n", fatorAPI);
        System.out.printf("MÉDIA FINAL: %.2f%n", resultado);

        sc.close();
    }
}