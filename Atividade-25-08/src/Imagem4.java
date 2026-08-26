class Cliente {
    private String nome;
    private String telefone;
    private String tipoCabelo;

    public Cliente(String nome, String telefone, String tipoCabelo) {
        this.nome = nome;
        this.telefone = telefone;
        this.tipoCabelo = tipoCabelo;
    }

    public void agendarCorte() {
        System.out.println(nome + " agendou um corte de cabelo.");
    }

    public void escolherEstilo() {
        System.out.println(nome + " escolheu um estilo para cabelo " + tipoCabelo + ".");
    }

    public void atualizarTelefone() {
        System.out.println("Telefone de " + nome + " atualizado para " + telefone + ".");
    }
}

class Corte {
    private String estilo;
    private String comprimento;
    private double preco;

    public Corte(String estilo, String comprimento, double preco) {
        this.estilo = estilo;
        this.comprimento = comprimento;
        this.preco = preco;
    }

    public void realizarCorte() {
        System.out.println("Realizando corte no estilo " + estilo + ".");
    }

    public void alterarEstilo(String novoEstilo) {
        this.estilo = novoEstilo;
        System.out.println("Estilo alterado para " + novoEstilo + ".");
    }

    public void exibirPreco() {
        System.out.println("Preço do corte: R$ " + preco);
    }
}

class Cabeleireiro {
    private String nome;
    private String especialidade;
    private int anosExperiencia;

    public Cabeleireiro(String nome, String especialidade, int anosExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public void atenderCliente() {
        System.out.println(nome + " está atendendo um cliente.");
    }

    public void demonstrarEspecialidade() {
        System.out.println(nome + " é especialista em " + especialidade + ".");
    }

    public void informarExperiencia() {
        System.out.println(nome + " possui " + anosExperiencia + " anos de experiência.");
    }
}