package a56;

/*Classe urna*/

public class Atividade56Urna {
  private Atividade56Candidato[] candidatos;
  private int votosEmBranco;
  private int totalVotos;
  
  public Atividade56Urna(Atividade56Candidato[] candidatos){
    this.candidatos = candidatos;
    this.votosEmBranco = 0;
    this.totalVotos = 0;
  }

  public void votar(int numeroCandidato) {
    if (numeroCandidato == 0){
      votosEmBranco++;
    } else if (numeroCandidato >=1 && numeroCandidato <= candidatos.length){
    	candidatos[numeroCandidato-1].adicionarVoto();
    } else if (numeroCandidato == -1){
    	System.out.println("Eleições encerradas");
    } else {
    	System.out.println("Voto inválido");
    	return;
    }
    totalVotos++;
  }

  public void mostrarResultado() {
    System.out.println("Resultados da eleição:");
    for (Atividade56Candidato candidato : candidatos) {
      System.out.printf("Candidato: %s - Votos: %d - Percentual: %.2f%%%n", candidato.getNome(), candidato.getVotos(), candidato.percentual(totalVotos));
    }
    if (votosEmBranco > 0){
      System.out.printf("Votos em branco: %d - Percentual: %.2f%%" , votosEmBranco, (votosEmBranco * 100.0 / totalVotos));
    } else {
      System.out.println("Nenhum voto em branco");
    }  
  }

  public String Ganhador() {
    if (totalVotos == 0){
      return "Nenhum vencedor, sem votos.";
    }

    Atividade56Candidato vencedor = candidatos[0];
    for (Atividade56Candidato candidato : candidatos) {
      if (candidato.getVotos() > vencedor.getVotos()){
        vencedor = candidato;
      }
    }
    return vencedor.getNome();
  }
}
