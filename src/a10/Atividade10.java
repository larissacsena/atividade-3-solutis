package a10;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salario, descontos, emprestimo;

        System.out.println("Informe o valor do salário bruto: ");
        salario = sc.nextFloat();
        System.out.println("Informe o valor dos descontos: ");
        descontos = sc.nextFloat();
        System.out.println("Informe o valor do emprestimo desejado: ");
        emprestimo = sc.nextFloat();

        //
        float salarioLiquido = salario - descontos;

        if (emprestimo <= salarioLiquido*0.3) {
            System.out.println("Empréstimo aprovado!");
        }
        else {
            System.out.println("Empréstimo negado!");
        }
    }
}
