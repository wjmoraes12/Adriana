package Exercicios_2;

public class MascaraTribal {

    private String material;
    private String origem;
    private String expressao;

    public MascaraTribal(String material, String origem, String expressao) {
        this.material = material;
        this.origem = origem;
        this.expressao = expressao;
    }

    public String getMaterial() {
        return material;
    }

    public String getOrigem() {
        return origem;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setExpressao(String expressao) {
        if (expressao.equals("Solene") || expressao.equals("Cerimonial") || expressao.equals("Mística")) {
            this.expressao = expressao;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Máscara da origem: " + origem + " | Material: " + material + " | Expressão: " + expressao);
    }

    public float calcularPrecoComDesconto(float precoOriginal, float porcentagemDesconto) {
        return precoOriginal - (precoOriginal * (porcentagemDesconto / 100f));
    }

    public boolean ehFeitaDeMadeira() {
        return material.equalsIgnoreCase("Madeira");
    }
}