package a47;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a
idade e a altura. Para sinalizar o fim da lista será fornecido “fim” no nome do último
paciente.
Exiba um relatório contendo:
i. a quantidade de pacientes.
ii. a média de idade dos homens.
iii. a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
iv. a quantidade de pessoas com idade entre 18 e 25.
v. o nome do paciente mais velho.
vi. o nome da mulher mais baixa.
vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.
*/

public class Atividade47 {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();

        inputs(pacientes);

        int query1 = pacientes.size();
        System.out.println("Quantidade de pacientes: " + query1);



        float query2 = calcularIdadeMediaHomens(pacientes);
        System.out.println("Idade média dos homens: " + query2);



        int query3 = (int) pacientes.stream()
                .filter(paciente -> paciente.getSexo() == 'F'
                        && paciente.getAltura() >= 1.6
                        && paciente.getAltura() <= 1.7
                        && paciente.getPeso() > 70)
                .count();

        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "
            + query3);

        int query4 = (int) pacientes.stream()
                .filter(paciente -> paciente.getIdade() >= 18 && paciente.getIdade() <= 25)
                .count();

        System.out.println("Quantidade de pacientes entre 18 e 25 anos: " + query4);




        Paciente query5 = pacientes.stream()
                .max(Comparator.comparingInt(Paciente::getIdade))
                .orElse(null);

        if (query5 != null)
            System.out.println("Paciente mais velho: " + query5.getNome());
        else
            System.out.println("Sem pacientes cadastrados.");




        Paciente query6 = pacientes.stream()
                .filter(paciente -> paciente.getSexo() == 'F')
                .min(Comparator.comparingDouble(Paciente::getAltura))
                .orElse(null);

        if (query6 != null)
            System.out.println("Mulher mais baixa: " + query6.getNome());
        else
            System.out.println("Sem mulheres cadastradas");




        // query7 - idade media de homens com altura abaixo de 1.6m
        List<Paciente> homensBaixos = pacientes.stream()
                .filter(paciente -> paciente.getAltura() < 1.6).toList();

        if (!homensBaixos.isEmpty())
            System.out.println("Idade media de homens com altura abaixo de 1.6m: "
                + calcularIdadeMediaHomens(homensBaixos));
        else
            System.out.println("Sem homens baixos cadastrados.");
    }

    static void inputs(List<Paciente> pacientes) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nNovo Paciente\n");
            System.out.println("Digite o nome do paciente ou 'FIM' para terminar de cadastrar pacientes... ");
            String nome = s.nextLine();

            if (nome.equalsIgnoreCase("FIM")) break;

            System.out.println("Insira o sexo do paciente (M/F): ");
            char sexo = s.next().charAt(0);

            System.out.println("Insira a idade do paciente: ");
            int idade = s.nextInt();

            System.out.println("Insira o peso do paciente: ");
            float peso = s.nextFloat();

            System.out.println("Insira a altura do paciente: ");
            float altura = s.nextFloat();

            s.nextLine();

            pacientes.add(new Paciente(nome, sexo, idade, peso, altura));
            s.close();
        }
    }

    static float calcularIdadeMediaHomens(List<Paciente> pacientes) {
        float sum = 0;
        int qtdHomens = 0;

        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'F') continue;
            sum += paciente.getIdade();
            qtdHomens++;
        }

        return (qtdHomens > 0) ? sum / qtdHomens : 0;
    }
}
