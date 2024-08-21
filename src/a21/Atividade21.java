package a21;

import java.util.Scanner;

/* Exiba o valor do empréstimo possível para um funcionário de uma empresa. Sabe-se:
Cargo -> % do salário
Diretoria -> 30%
Gerência -> 25%
Operacional -> 20% */
public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o cargo do funcionário (Diretoria, Gerência, Operacional): ");
        String cargo = scanner.nextLine();

        System.out.print("Informe o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double porcentagemEmprestimo;

        if (cargo.equalsIgnoreCase("Diretoria")) {
            porcentagemEmprestimo = 0.30;
        } else if (cargo.equalsIgnoreCase("Gerência")) {
            porcentagemEmprestimo = 0.25;
        } else if (cargo.equalsIgnoreCase("Operacional")) {
            porcentagemEmprestimo = 0.20;
        } else {
            porcentagemEmprestimo = 0;
            System.out.println("Cargo inválido.");
        }

        if (porcentagemEmprestimo > 0) {
            double valorEmprestimo = salario * porcentagemEmprestimo;
            System.out.println("O valor do empréstimo possível é: R$ " + valorEmprestimo);
        }
    }
}
