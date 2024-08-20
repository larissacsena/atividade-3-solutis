package a56;

/*Classe candidato*/

public class Atividade56Candidato {
    private String nome;
    private int votos;

    public Atividade56Candidato(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto() {
        this.votos++;
    }

    public double percentual(int totalVotos) {
        return (totalVotos > 0) ? (this.votos * 100 / totalVotos) : 0;
    }

}