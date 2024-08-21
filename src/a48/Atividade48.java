package a48;

import java.util.Scanner;

/* Descida se um aluno será aprovado, reprovado por nota ou reprovado por faltas. Use o
sistema de avaliação da FAESA. Pergunte ao usuário a quantidade de notas para cálculo
da média semestral, sendo que todas elas possuem o mesmo peso. */
public class Atividade48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de notas para o cálculo da média semestral: ");
        int quantNotas = scan.nextInt();

        double somaNotas = 0;
        for (int i = 1; i <= quantNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            somaNotas += scan.nextDouble();
        }

        double media = somaNotas / quantNotas;
        System.out.printf("Média semestral: %.2f%n", media);
        System.out.print("Digite o número total de aulas: ");
        int totalAulas = scan.nextInt();
        System.out.print("Digite o número de faltas: ");
        int faltas = scan.nextInt();

        double percentualFaltas = (double) faltas / totalAulas * 100;
        System.out.printf("Percentual de faltas: %.2f%%%n", percentualFaltas);

        if (media >= 7 && percentualFaltas <= 25) {
            System.out.println("Aprovado");
        } else if (percentualFaltas > 25) {
            System.out.println("Reprovado por média");
        } else if (media < 7) {
            System.out.println("Reprovado por faltas");

            scan.close();
        }
    }
}