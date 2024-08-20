package a42;

/*
Aproveitando o algoritmo do exercício anterior, exiba uma lista de 40 grupos de números
sorteados de 0 a 59. Cada grupo possui 3 números e deve exibido em ordem crescente.
*/

import java.util.Arrays;
import java.util.Random;

public class Atividade42 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroDeGrupos = 40;
        int numerosPorGrupo = 3;
        int faixaMaxima = 60;

        System.out.println("Lista de grupos de números sorteados:");

        for (int i = 0; i < numeroDeGrupos; i++) {
            int[] grupo = new int[numerosPorGrupo];

            for (int j = 0; j < numerosPorGrupo; j++) {
                grupo[j] = random.nextInt(faixaMaxima);
            }

            Arrays.sort(grupo);

            System.out.println(Arrays.toString(grupo));
        }
    }
}
