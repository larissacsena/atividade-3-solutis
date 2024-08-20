package a29;

/*
    Receba do usuário dois pontos do plano cartesiano. Estes pontos devem representar os
    vértices superior esquerdo e inferior direito de um retângulo paralelo aos eixos x e y.
    Primeiramente informe se estes pontos podem constituir um retângulo, ou seja:
    - se é um retângulo
    - se é uma reta horizontal
    - se é uma reta vertical
    - se é um ponto
*/

import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ponto X do item 1: ");
        int x1 = sc.nextInt();
        System.out.println("Informe o ponto Y do item 1: ");
        int y1 = sc.nextInt();

        System.out.println("Informe o ponto X do item 2: ");
        int x2 = sc.nextInt();
        System.out.println("Informe o ponto Y do item 2: ");
        int y2 = sc.nextInt();

        if (x1 == x2 && y1 == y2) {
            System.out.println("As coordenadas representam um ponto");
        } else if (x1 == x2) {
            System.out.println("As coordenadas representam uma reta vertical");
        } else if (y1 == y2) {
            System.out.println("As coordenadas representam uma reta horizontal");
        } else {
            System.out.println("As coordenadas podem representar um quadrado ou retângulo");
        }
        sc.close();
    }
}
