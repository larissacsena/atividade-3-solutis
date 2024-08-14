package a19;

/*
19. Exiba dois números fornecidos pelo usuário em ordem crescente.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Atividade19 {

    public static void main(String[] args) {

        final int QUANTIDADE_NUMEROS = 2;

        double[] numeros = new double[QUANTIDADE_NUMEROS];

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i<=QUANTIDADE_NUMEROS-1; i++){

            System.out.println("Digite o "+(i+1)+"º número: ");
            numeros[i] = entrada.nextDouble();

        }

        //Imprime números digitados na ordem fornecida
        System.out.println("Os números digitados foram: ");
        System.out.println(Arrays.toString(numeros));

        //Imprime números digitados na ordem crescente
        Arrays.sort(numeros);
        System.out.println("Os números em ordem crescente são: ");
        System.out.println(Arrays.toString(numeros));

    }
}
