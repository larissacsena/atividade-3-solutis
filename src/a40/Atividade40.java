package a40;

import java.util.*;

/* Solicite ao usuário a idade de cada um componente de um grupo de pessoas. A quantidade
de pessoas também será determinada por ele. Após o término da entrada, apresente:
a. a média das idades,
b. a maior idade,
c. a menor idade,
d. a quantidade de pessoas maior de idade. */
public class Atividade40 {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas.");
        int peopleAmount = s.nextInt();

        for (int i = 0; i < peopleAmount; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1));
            ages.add(s.nextInt());
        }

        System.out.println("Média das idades: " + mean(ages, peopleAmount));
        System.out.println("Maior idade: " + Collections.max(ages));
        System.out.println("Menor idade: " + Collections.min(ages));

        int adultAmount = (int) ages.stream().filter(age -> age >= 18).count();
        System.out.println("Quantidade de maiores de idade: " + adultAmount);

        s.close();
    }

    static float mean(List<Integer> ages, int peopleAmount) {
        float sum = 0;
        for (int i = 0; i < peopleAmount; i++) sum += ages.get(i);

        return sum / peopleAmount;
    }
}
