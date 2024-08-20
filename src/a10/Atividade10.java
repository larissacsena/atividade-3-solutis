package a10;

import java.util.Scanner;

/*
    Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
    salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
    empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.
*/

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salarioBruto, descontos, emprestimo;

        System.out.println("Informe o valor do salário bruto: ");
        salarioBruto = sc.nextFloat();
        System.out.println("Informe o valor dos descontos: ");
        descontos = sc.nextFloat();
        System.out.println("Informe o valor do emprestimo desejado: ");
        emprestimo = sc.nextFloat();

        float salarioLiquido = salarioBruto - descontos;

        if (emprestimo <= salarioLiquido*0.3) {
            System.out.println("Empréstimo aprovado!");
        }
        else {
            System.out.println("Empréstimo negado!");
        }
        sc.close();
    }
}
