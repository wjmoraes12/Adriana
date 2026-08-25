package Exercicios_2;

public class PersonagemManga {

    private String nome;
    private String estiloCabelo;
    private int nivelPoder;

    public PersonagemManga(String nome, String estiloCabelo, int nivelPoder) {
        this.nome = nome;
        this.estiloCabelo = estiloCabelo;
        this.nivelPoder = nivelPoder;
    }

    public String getNome() {
        return nome;
    }

    public String getEstiloCabelo() {
        return estiloCabelo;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstiloCabelo(String estiloCabelo) {
        this.estiloCabelo = estiloCabelo;
    }

    public void setNivelPoder(int nivelPoder) {
        if (nivelPoder >= 0) {
            this.nivelPoder = nivelPoder;
        }
    }

    public void treinar(int incremento) {
        if (incremento > 0) {
            this.nivelPoder += incremento;
        }
    }

    public void mudarCorteCabelo(String novoEstilo) {
        this.estiloCabelo = novoEstilo;
    }

    public boolean ehProtagonistaPoderoso() {
        return nivelPoder > 8000;
    }
}