package a2;

import java.util.Scanner;

/* Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
Para isto, peça o valor do seu salário e o valor do salário mínimo atual. */
public class Atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioMinimo;
        double salarioFuncionario;
        double quantSalariosMin;

        System.out.println("Digite o valor do salário do funcionario:");
        salarioFuncionario = scan.nextDouble();
        System.out.println("Digite o valor do salário mínimo atual:");
        salarioMinimo = scan.nextDouble();

        quantSalariosMin = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário recebe %.2f Salarios mínimos", quantSalariosMin);

        scan.close();
    }
}   
