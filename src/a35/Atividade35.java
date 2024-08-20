package a35;

/*
Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que o usuário determine a faixa do sorteio.
*/

import java.util.Random;
import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor da porção máxima de números que estarão presentes no sorteio: ");
        int faixa = scanner.nextInt();

        if (quantidade > faixa) {
            System.out.println("A quantidade de números não pode ser maior que a faixa do sorteio.");
            return;
        }

        System.out.println("Números sorteados:");

        // Aqui exibe os números sorteados únicos
        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado;

            // Aqui vai garantir que os números sorteados sejam únicos
            do {
                numeroSorteado = random.nextInt(faixa) + 1;
            } while (numeroJaSorteado(numeroSorteado, i));

            System.out.println(numeroSorteado);
        }
    }

    // Método que verifica se o número já foi sorteado
    private static boolean numeroJaSorteado(int numero, int quantidadeSorteados) {
        return false;
    }
}

