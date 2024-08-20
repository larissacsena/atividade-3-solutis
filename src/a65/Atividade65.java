package a65;

import java.util.Scanner;

/*
    Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.

            *
           ***
          *****
         *******
        *********
       ***********
      *************
     ***************
*/

public class Atividade65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de linhas da pirâmide: ");
        int numeroLinha = sc.nextInt();

        for (int i = 1; i <= numeroLinha; i++) {
            // Atribui o numero de espaços de cada linha respectivamente ao número de linhas informado pelo usuário
            // ou seja, se o usuário quer que imprima 10 linhas, serão adicionados 10 espaços na primeira linha,
            // 9 na segunda, assim por diante
            for (int espaco = numeroLinha; espaco > i; espaco--) {
                System.out.print(" ");
            }

            // Loop para adicionar 2 asteríscos ao montante atual
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Usado para pular uma linha entre cada vez do loop realizado
            System.out.println();
        }
      sc.close();
    }
}
