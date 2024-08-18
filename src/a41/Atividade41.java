package a41;
import java.util.Random;
import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        boolean acertou = false;
        System.out.println("Tente adivinhar o número sorteado entre 1 e 100.");
        while (!acertou) {
            tentativas++;

            System.out.print("Digite o seu palpite: ");
            palpite = scan.nextInt();

            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor.");
            } else {
                acertou = true;
                System.out.println("Parabéns! voce acertou o número em " + tentativas + " tentativas.");
            }
        }
        scan.close();
    }
}