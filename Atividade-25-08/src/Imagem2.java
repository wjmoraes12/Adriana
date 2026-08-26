class Ciclista {
    private String nome;
    private String nivel;
    private double velocidade;

    public Ciclista(String nome, String nivel, double velocidade) {
        this.nome = nome;
        this.nivel = nivel;
        this.velocidade = velocidade;
    }

    public void pedalar() {
        System.out.println(nome + " está pedalando pela trilha.");
    }

    public void frear() {
        System.out.println(nome + " está freando a bicicleta.");
    }

    public void acelerar() {
        System.out.println(nome + " está acelerando para " + velocidade + " km/h.");
    }
}

class Bicicleta {
    private String marca;
    private int aro;
    private String tipoFreio;

    public Bicicleta(String marca, int aro, String tipoFreio) {
        this.marca = marca;
        this.aro = aro;
        this.tipoFreio = tipoFreio;
    }

    public void pedalar() {
        System.out.println("A bicicleta " + marca + " está sendo utilizada.");
    }

    public void calibrarPneu() {
        System.out.println("Os pneus da bicicleta foram calibrados.");
    }

    public void frear() {
        System.out.println("A bicicleta está utilizando freio " + tipoFreio + ".");
    }
}

class Trilha {
    private String nome;
    private double distancia;
    private String dificuldade;

    public Trilha(String nome, double distancia, String dificuldade) {
        this.nome = nome;
        this.distancia = distancia;
        this.dificuldade = dificuldade;
    }

    public void iniciar() {
        System.out.println("A trilha " + nome + " foi iniciada.");
    }

    public void mapear() {
        System.out.println("A trilha de " + distancia + " km foi mapeada.");
    }

    public void finalizar() {
        System.out.println("A trilha foi finalizada. Dificuldade: " + dificuldade + ".");
    }
}