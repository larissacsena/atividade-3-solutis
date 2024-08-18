package a59;

public class Atividade59 {
    public static void main(String[] args) {
        int maxTabuada = 10;

        for (int i = 1; i <= maxTabuada; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= maxTabuada; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
