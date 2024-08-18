package a27;

import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número:");
        int num2 = scan.nextInt();
        System.out.print("Digite o terceiro número:");
        int num3 = scan.nextInt();

        scan.close();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O maior número é: " + num3);
        } else {
            System.out.println("os números São iguais");
        }
    }
}