package Exercicios_2;

public class Trilha {

    private String nome;
    private float distancia;
    private String nivelDificuldade;

    public Trilha(String nome, float distancia, String nivelDificuldade) {
        this.nome = nome;
        this.distancia = distancia;
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getNome() {
        return nome;
    }

    public float getDistancia() {
        return distancia;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        if (nivelDificuldade.equals("Fácil") || nivelDificuldade.equals("Intermediário") || nivelDificuldade.equals("Difícil"))
            this.nivelDificuldade = nivelDificuldade;
    }

    //Estimando que a média da velocidade seja de 4km/h
    public float calcularTempoEstimado() {
        return distancia / 4f;
    }

    public void estenderTrilha(float metrosAdicionais) {
        distancia += metrosAdicionais;
    }

    public boolean recomendadaParaIniciantes() {
        return nivelDificuldade.equals("Fácil");
    }
}