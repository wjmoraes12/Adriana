import java.util.Scanner;

public class calculo {

    public static float calcularMB(float p1, float e1, float e2, float x, float sub) {
        return p1 * 0.5f + e1 * 0.2f + e2 * 0.3f + x + sub * 0.15f;
    }

    public static float calcularFatorAPI(float mbMenos59) {
        float maxParte = Math.max(mbMenos59, 0);
        if (mbMenos59 != 0) return maxParte / mbMenos59;
        return 0;
    }

    public static float calcularMediaFinal(float mb, float fatorAPI, float api, float exf) {
        float parteBase = mb * 0.5f + fatorAPI * api * 0.5f;
        return Math.max(parteBase, exf);
    }

    public static void outputdata(String frase) {
        System.out.println(frase);
    }

    public static void outputdata(String frase, Object... valores) {
        System.out.printf(frase + "%n", valores);
    }

    public static float inputData(Scanner sc) {
        while (true) {
            try { return sc.nextFloat(); }
            catch (Exception e) { outputdata("ERRO: digite um número válido."); sc.next(); }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        outputdata("=== CÁLCULO DE MÉDIA FINAL ===");

        outputdata("Digite a nota de P1 (Prova1): "); float p1 = inputData(sc);
        outputdata("Digite a nota de E1 (Entrega E1): "); float e1 = inputData(sc);
        outputdata("Digite a nota de E2 (Entrega E2): "); float e2 = inputData(sc);
        outputdata("Digite o valor de X (Atividades extras): "); float x = inputData(sc);
        outputdata("Digite a nota de SUB (Prova substitutiva): "); float sub = inputData(sc);
        outputdata("Digite a nota de API (Aprendizagem por Projeto Integrado): "); float api = inputData(sc);
        outputdata("Digite a nota de EXF (Exame Final): "); float exf = inputData(sc);

        float mb = calcularMB(p1, e1, e2, x, sub);
        float mbMenos59 = mb - 5.9f;
        float fatorAPI = calcularFatorAPI(mbMenos59);
        float resultado = calcularMediaFinal(mb, fatorAPI, api, exf);

        outputdata("");
        outputdata("Média base (MB) considerada: %.2f", mb);
        outputdata("Fator de bônus da API aplicado (0 ou 1): %.0f", fatorAPI);
        outputdata("MÉDIA FINAL: %.2f", resultado);

        sc.close();
    }
}
