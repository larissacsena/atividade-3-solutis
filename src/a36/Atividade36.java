package a36;

import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N1 - Informe um número: ");
        int n1 = sc.nextInt();
        System.out.println("N2 - Informe outro número");
        int n2 = sc.nextInt();

        for (int i=n1; i<=n2; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
