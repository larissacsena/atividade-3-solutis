package a41;

/*
Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada tentativa
dele, forneça uma dica falando se o número é maior ou menor. Quando ele descobrir exiba
uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu.
*/

import java.util.Random;
import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número sorteado entre 1 e 100.");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSorteado) {
                System.out.println("O número é maior.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
                System.out.println("Número de tentativas: " + tentativas);
            }
        } while (tentativa != numeroSorteado);
    }
}
