class Mascara {
    private String origem;
    private String material;
    private String estilo;

    public Mascara(String origem, String material, String estilo) {
        this.origem = origem;
        this.material = material;
        this.estilo = estilo;
    }

    public void exibirDetalhes() {
        System.out.println("Máscara de origem " + origem +
                ", feita de " + material +
                ", estilo " + estilo + ".");
    }

    public void restaurar() {
        System.out.println("A máscara de " + origem + " está sendo restaurada.");
    }

    public void catalogar() {
        System.out.println("Máscara catalogada no acervo.");
    }
}

class Colecionador {
    private String nome;
    private int quantidadePecas;
    private String especialidade;

    public Colecionador(String nome, int quantidadePecas, String especialidade) {
        this.nome = nome;
        this.quantidadePecas = quantidadePecas;
        this.especialidade = especialidade;
    }

    public void adicionarMascara() {
        quantidadePecas++;
        System.out.println(nome + " adicionou uma nova máscara à coleção.");
    }

    public void pesquisarOrigem() {
        System.out.println(nome + " está pesquisando peças de " + especialidade + ".");
    }

    public void apresentarColecao() {
        System.out.println(nome + " possui " + quantidadePecas +
                " peças em sua coleção.");
    }
}

class Exposicao {
    private String nome;
    private String local;
    private int quantidadeMascara;

    public Exposicao(String nome, String local, int quantidadeMascara) {
        this.nome = nome;
        this.local = local;
        this.quantidadeMascara = quantidadeMascara;
    }

    public void abrirExposicao() {
        System.out.println("A exposição \"" + nome +
                "\" foi aberta no local " + local + ".");
    }

    public void informarAcervo() {
        System.out.println("A exposição possui " + quantidadeMascara +
                " máscaras em exibição.");
    }

    public void encerrarExposicao() {
        System.out.println("A exposição \"" + nome + "\" foi encerrada.");
    }
}