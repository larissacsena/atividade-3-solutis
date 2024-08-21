package a56;

import java.util.Scanner;

/* Crie um programa para simular uma urna de votação para exatamente 3 candidatos. Logo
no início deve-se perguntar ao usuário os nomes dos candidatos. Permita votos em branco.
Ao término de toda a entrada, apresente o name, a quantidade de votos e o percentual de
cada candidato. Apresente também a quantidade e o percentual dos votos em branco e
quem foi o ganhador da eleição. */
public class Atividade56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voto;

        System.out.print("Digite o name do primeiro candidato: ");
        Atividade56Candidato candidato1 = new Atividade56Candidato(scan.nextLine());

        System.out.print("Digite o name do segundo candidato: ");
        Atividade56Candidato candidato2 = new Atividade56Candidato(scan.nextLine());

        System.out.print("Digite o name do terceiro candidato: ");
        Atividade56Candidato candidato3 = new Atividade56Candidato(scan.nextLine());

        Atividade56Candidato[] candidatos = {candidato1, candidato2, candidato3};
        Atividade56Urna urna = new Atividade56Urna(candidatos);

        do {
            System.out.printf("Digite o voto :%n1) para " + candidato1.getNome() + "%n2) para " + candidato2.getNome() + "%n3) para " + candidato3.getNome() + "%n0) para voto em branco%n-1) para encerrar):");
            voto = scan.nextInt();

            urna.votar(voto);


        } while (voto >= 0);
        System.out.println("______________________________");
        urna.mostrarResultado();

        scan.close();
    }
}