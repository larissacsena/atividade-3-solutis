package a13;

import java.util.Scanner;

/*
A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
recuperação ou foi reprovado. A média de aprovação é >=7.0; a média de recuperação é
>= 5.0 e <7.0; e a média do reprovado é < 5.0
Acrescente no problema anterior possibilidade dele fazer prova final em caso de
recuperação. Neste caso a nota de aprovação passa a ser >= 5.0
*/


public class Atividade13 {

    final static int QUANTIDADE_NOTAS = 3;

    public static void main(String[] args) {

        double notas = 0;

        int qntNotas = 1;

        Scanner entrada = new Scanner(System.in);

        while (qntNotas <= 3) {
            System.out.println("Digite a " + qntNotas + "ª nota do aluno: ");
            notas += entrada.nextDouble();
            qntNotas++;
        }

        double mediaNotas = notas / QUANTIDADE_NOTAS;

        System.out.print("Média: ");
        System.out.printf("%.2f%n ", mediaNotas);

        if (mediaNotas < 5.0) {
            System.out.println("Aluno reprovado!");
        } else if (mediaNotas >= 7.0) {
            System.out.println("Aluno aprovado!");

        } else {
            System.out.println("Aluno em recuperação. Digite sua nota da prova de recuperação");

            double notaRecuperacao = entrada.nextDouble();

            System.out.println("Nota recuperação: " + notaRecuperacao);

            if (notaRecuperacao < 5.0) {
                System.out.println("Aluno não atingiu a nota requerida!");
            } else {
                System.out.println("Aluno aprovado na recuperação!");
            }
        }
    }
}