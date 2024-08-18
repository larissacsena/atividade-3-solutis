package a61;
import java.util.Scanner;

public class Atividade61 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o número de linhas da pirâmide: ");
    int numLinhas = scan.nextInt();

    for (int i = 1; i <= numLinhas; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    scan.close();
  }
}