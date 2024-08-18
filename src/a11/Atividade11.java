package a11;

/*A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16),
ou se o voto é facultativo (idade menor ou igual a 16, ou maior, ou igual a 65), ou ainda se o
voto é obrigatório.*/

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade do cidadão:");
        int age = sc.nextInt();

        if (age < 16) System.out.println("Não pode votar.");
        else if ((age < 18) || (age >= 65)) System.out.println("Voto facultativo.");
        else System.out.println("Voto obrigatório.");

        sc.close();
    }
}
