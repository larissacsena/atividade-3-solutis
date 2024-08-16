package a12;

import java.util.Scanner;

/* A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
recuperação ou foi reprovado. A média de aprovação é &gt;= 7.0; a média de recuperação é
&gt;= 5.0 e &lt; 7.0; e a média do reprovado é &lt; 5.0 */
public class atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite A nota 1 do aluno: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite A nota 2 do aluno: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite A nota 3 do aluno: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println();

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else if (media < 5) {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
