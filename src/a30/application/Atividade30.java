package a30.application;

import a30.entities.Point;
import a30.entities.Rectangle;

import java.util.Scanner;

public class Atividade30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber os pontos do primeiro retângulo
        System.out.println("Digite os quatro pontos do primeiro retângulo (x1 y1 x2 y2 x3 y3 x4 y4):");
        Point[] rect1Points = new Point[4];
        for (int i = 0; i < 4; i++) {
            rect1Points[i] = new Point(scanner.nextDouble(), scanner.nextDouble());
        }

        // Receber os pontos do segundo retângulo
        System.out.println("Digite os quatro pontos do segundo retângulo (x1 y1 x2 y2 x3 y3 x4 y4):");
        Point[] rect2Points = new Point[4];
        for (int i = 0; i < 4; i++) {
            rect2Points[i] = new Point(scanner.nextDouble(), scanner.nextDouble());
        }

        // Criar os retângulos
        Rectangle rect1 = new Rectangle(rect1Points);
        Rectangle rect2 = new Rectangle(rect2Points);

        // Verificar se os retângulos se interceptam
        if (rect1.intersects(rect2)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
    }
}