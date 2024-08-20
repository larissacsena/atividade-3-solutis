package a37;

//37. Calcule o fatorial de um número.

public class Atividade37 {
    public static void main(String[] args) {

        System.out.println(fatorial(0));
        System.out.println(fatorial(1));
        System.out.println(fatorial(2));
        System.out.println(fatorial(3));
        System.out.println(fatorial(5));
        System.out.println(fatorial(10));

    }

    public static int fatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}