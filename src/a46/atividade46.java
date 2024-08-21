package a46;

import java.util.Random;

/* Determine a quantidade de homens e mulheres (separadamente) que são maiores de
idade, baseado numa lista de 200 pessoas. */
public class atividade46 {
    public static void main(String[] args) {
        Random random = new Random();
        int totalH = 0;
        int totalM = 0;
        int HMI = 0;
        int MMI = 0;

        for (int i = 1; i <= 200; i++) {

            boolean isMasculino = random.nextBoolean();
            int idade = random.nextInt(100);

            if (isMasculino) {
                totalH++;
                if (idade >= 18) {
                    HMI++;
                }
            } else {
                totalM++;
                if (idade >= 18) {
                    MMI++;
                }
            }
        }

        System.out.println("Total de homens: " + totalH);
        System.out.println("Total de homens maiores de idade: " + HMI);
        System.out.println("Total de mulheres: " + totalM);
        System.out.println("Total de mulheres maiores de idade: " + MMI);
    }
}
