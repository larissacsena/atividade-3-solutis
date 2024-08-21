package a36;

import java.util.Scanner;

/* Exiba todos os números ímpares existentes entre dois números informados pelo usuário.
Dica: use o operador % para calcular o resto da divisão entre dois números. */
public class Atividade36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N1 - Informe um número: ");
        int n1 = sc.nextInt();
        System.out.println("N2 - Informe outro número: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            for (int i = n2 + 1; i < n1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else if (n2 > n1) {
            for (int i = n1 + 1; i < n2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Os números são iguais!");
        }

        sc.close();
    }
}