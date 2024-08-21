package a30.application;

import a30.entities.Point;
import a30.entities.Rectangle;

import java.util.Scanner;

/*Receba dois retângulos através dos seus quatro vértices. Cada vértice é um ponto e é
formado por duas coordenadas x e y. Faça a crítica destes pontos, pois eles não podem se
sobrepor. Observe que o usuário pode fornecê-los em qualquer ordem. Em seguida informe
se os dois retângulos se interceptam em algum lugar. */
public class Atividade30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os quatro pontos do primeiro retângulo (x1 y1 x2 y2 x3 y3 x4 y4):");
        Point[] rect1Points = new Point[4];
        for (int i = 0; i < 4; i++) {
            rect1Points[i] = new Point(scanner.nextDouble(), scanner.nextDouble());
        }

        System.out.println("Digite os quatro pontos do segundo retângulo (x1 y1 x2 y2 x3 y3 x4 y4):");
        Point[] rect2Points = new Point[4];
        for (int i = 0; i < 4; i++) {
            rect2Points[i] = new Point(scanner.nextDouble(), scanner.nextDouble());
        }

        Rectangle rect1 = new Rectangle(rect1Points);
        Rectangle rect2 = new Rectangle(rect2Points);

        if (rect1.intersects(rect2)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
    }
}