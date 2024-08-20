package a47;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
Leia uma relação de pacientes de uma clínica, cada um com o name, o sex, o peso, a
idade e a altura. Para sinalizar o fim da lista será fornecido “fim” no name do último
paciente.
Exiba um relatório contendo:
i. a quantidade de pacientes.
ii. a média de idade dos homens.
iii. a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
iv. a quantidade de pessoas com idade entre 18 e 25.
v. o name do paciente mais velho.
vi. o name da mulher mais baixa.
vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.
*/

public class Atividade47 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                boolean quit = inputPatientData(scanner, patients);
                if (quit) break;
            }
            catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.");
            }
        }

        scanner.close();

        // Descrição de cada query se encontra no enunciado da questão
        query1(patients);
        query2(patients);
        query3(patients);
        query4(patients);
        query5(patients);
        query6(patients);
        query7(patients);
    }

    static boolean inputPatientData(Scanner scanner, List<Patient> patients) {
        System.out.println("\nNovo Paciente\n");
        System.out.println("Digite o name do paciente ou 'FIM' para terminar de cadastrar pacientes... ");
        String nome = scanner.nextLine();

        if (nome.equalsIgnoreCase("FIM")) return true;

        System.out.println("Insira o sexo do paciente (M/F): ");
        char sexo = scanner.next().charAt(0);
        if (sexo != 'M' && sexo != 'F') throw new IllegalArgumentException();

        System.out.println("Insira a idade do paciente: ");
        int idade = scanner.nextInt();
        if (idade < 0) throw new IllegalArgumentException();

        System.out.println("Insira o peso do paciente: ");
        float peso = scanner.nextFloat();
        if (peso < 0) throw new IllegalArgumentException();

        System.out.println("Insira a altura do paciente: ");
        float altura = scanner.nextFloat();
        if (altura < 0) throw new IllegalArgumentException();

        patients.add(new Patient(nome, sexo, idade, peso, altura));
        scanner.nextLine();
        return false;
    }

    private static void query1(List<Patient> patients) {
        int query = patients.size();
        System.out.println("Quantidade de patients: " + query);
    }

    private static void query2(List<Patient> patients) {
        float query = getMaleMeanAge(patients);
        System.out.println("Idade média dos homens: " + query);
    }

    private static void query3(List<Patient> patients) {
        int query = (int) patients.stream()
                .filter(patient -> patient.sex() == 'F'
                        && patient.height() >= 1.6
                        && patient.height() <= 1.7
                        && patient.peso() > 70)
                .count();

        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "
                + query);
    }

    private static void query4(List<Patient> patients) {
        int query = (int) patients.stream()
                .filter(patient -> patient.idade() >= 18 && patient.idade() <= 25)
                .count();

        System.out.println("Quantidade de patients entre 18 e 25 anos: " + query);
    }

    private static void query5(List<Patient> patients) {
        Patient query = patients.stream()
                .max(Comparator.comparingInt(Patient::idade))
                .orElse(null);

        if (query != null)
            System.out.println("Paciente mais velho: " + query.name());
        else
            System.out.println("Sem patients cadastrados.");
    }

    private static void query6(List<Patient> patients) {
        Patient query = patients.stream()
                .filter(patient -> patient.sex() == 'F')
                .min(Comparator.comparingDouble(Patient::height))
                .orElse(null);

        if (query != null)
            System.out.println("Mulher mais baixa: " + query.name());
        else
            System.out.println("Sem mulheres cadastradas");
    }

    private static void query7(List<Patient> patients) {
        // query7 - idade media de homens com altura abaixo de 1.6m
        List<Patient> homensBaixos = patients.stream()
                .filter(patient -> patient.height() < 1.6).toList();

        if (!homensBaixos.isEmpty())
            System.out.println("Idade media de homens com altura abaixo de 1.6m: "
                    + getMaleMeanAge(homensBaixos));
        else
            System.out.println("Sem homens baixos cadastrados.");
    }

    static float getMaleMeanAge(List<Patient> patients) {
        float sum = 0;
        int menAmount = 0;

        for (Patient patient : patients) {
            if (patient.sex() == 'F') continue;
            sum += patient.idade();
            menAmount++;
        }

        return (menAmount > 0) ? sum / menAmount : 0;
    }
}
