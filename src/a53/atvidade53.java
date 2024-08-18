package a53;

import java.util.Scanner;

/*Exiba a tabuada de um número fornecido pelo usuário.*/
public class atvidade53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
