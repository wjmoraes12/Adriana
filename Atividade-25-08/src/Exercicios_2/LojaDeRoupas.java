package Exercicios_2;

public class LojaDeRoupas {

    private String nome;
    private String endereco;
    private int quantidadeRoupas;

    public LojaDeRoupas(String nome, String endereco, int quantidadeRoupas) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeRoupas = quantidadeRoupas;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getQuantidadeRoupas() {
        return quantidadeRoupas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setQuantidadeRoupas(int quantidadeRoupas) {
        this.quantidadeRoupas = quantidadeRoupas;
    }

    public void venderRoupa() {
        quantidadeRoupas--;
    }

    public void adicionarRoupa() {
        quantidadeRoupas++;
    }

    public void removerRoupa() {
        quantidadeRoupas--;
    }
}