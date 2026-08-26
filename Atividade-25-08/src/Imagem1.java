class Roupa {
    private String tipo;
    private String cor;
    private double preco;

    public Roupa(String tipo, String cor, double preco) {
        this.tipo = tipo;
        this.cor = cor;
        this.preco = preco;
    }

    public void vestir() {
        System.out.println("A roupa " + tipo + " de cor " + cor + " foi vestida.");
    }

    public void vender() {
        System.out.println("A roupa foi vendida por R$ " + preco + ".");
    }

    public void exibirPreco() {
        System.out.println("Preço da roupa: R$ " + preco);
    }
}

class Manequim {
    private String material;
    private String cor;
    private String roupa;

    public Manequim(String material, String cor, String roupa) {
        this.material = material;
        this.cor = cor;
        this.roupa = roupa;
    }

    public void vestirRoupa() {
        System.out.println("O manequim está usando " + roupa + ".");
    }

    public void exibir() {
        System.out.println("Manequim de cor " + cor + " em exposição.");
    }

    public void trocarRoupa() {
        System.out.println("A roupa do manequim foi trocada.");
    }
}

class Loja {
    private String nome;
    private String endereco;
    private int quantidadeFuncionarios;

    public Loja(String nome, String endereco, int quantidadeFuncionarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void abrir() {
        System.out.println("A loja " + nome + " foi aberta.");
    }

    public void fechar() {
        System.out.println("A loja " + nome + " foi fechada.");
    }

    public void exibirInformacoes() {
        System.out.println("Loja: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Funcionários: " + quantidadeFuncionarios);
    }
}