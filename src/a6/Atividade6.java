package a6;

/* Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo
é ¶ multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível em Math.PI */
public class Atividade6 {
    public static void main(String[] args) {
        double raio = 5;
        double area = (raio * raio) * Math.PI;

        System.out.println("Area = " + area);
    }
}
