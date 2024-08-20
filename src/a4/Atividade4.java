package a4;

import java.util.Scanner;

/*
    Lê as notas respectivamente, divide pelo número de notas (4),
    e calcula a média total
*/

public class Atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, nota4;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextFloat();
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das quatro notas é: " + media);

        sc.close();
    }
}
