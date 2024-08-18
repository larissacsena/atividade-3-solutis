package a18;

// Questoes 15 a 18

/*
15. Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).
Além de falar se a data está ok, informe também o nome do mês.
Dica: meses com 30 dias: abril, junho, setembro e novembro.

16. Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.

17. Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa.

18. Inclua no exercício anterior a solicitação do ano de nascimento e também da data de hoje. A
partir destas informações, apresente a idade atual desta pessoa.
*/


import java.util.Scanner;

public class Atividade18 {
    private static final String[] nomesMeses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia do nascimento: ");
        int diaDoNascimento = scan.nextInt();

        System.out.print("Digite o mês do nascimento: ");
        int mesDoNascimento = scan.nextInt();

        System.out.print("Digite o ano do nascimento: ");
        int anoDoNascimento = scan.nextInt();

        System.out.print("Digite o dia atual: ");
        int diaAtual = scan.nextInt();

        System.out.print("Digite o mês atual: ");
        int mesAtual = scan.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scan.nextInt();

        scan.close();


        if (!validarData(diaDoNascimento, mesDoNascimento, anoDoNascimento)) {
            System.out.println("Data de nascimento inválida.");
            return;
        }

        if (!validarData(diaAtual, mesAtual, anoAtual)) {
            System.out.println("Data atual inválida.");
            return;
        }


        String trimestre = getTrimestre(mesDoNascimento);
        String signo = getSigno(diaDoNascimento, mesDoNascimento);
        int idade = getIdade(diaDoNascimento, mesDoNascimento, anoDoNascimento,
                diaAtual, mesAtual, anoAtual);

        System.out.println("\nData de nascimento válida: " + diaDoNascimento + " de " + nomesMeses[mesDoNascimento - 1]);
        System.out.println("Você nasceu no " + trimestre + "trimestre");
        System.out.println("Seu signo é: " + signo);
        System.out.println("Você tem " + idade + " anos");
    }

    private static boolean ehAnoBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                return ano % 400 == 0;
            }
            else return true;
        }

        else return false;
    }

    private static boolean validarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31){
            System.out.println("Dia inválido.");
            return false;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido.");
            return false;
        }

        int diasNoMes = switch (mes) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        if (ehAnoBissexto(ano) || mes == 2) diasNoMes++;

        return (dia <= diasNoMes);
    }

    private static String getTrimestre(int mes) {
        if (mes <= 3) return "1º ";
        else if (mes <= 6) return "2º ";
        else if (mes <= 9) return "3º ";
        else return "4º ";
    }

    private static String getSigno(int dia, int mes) {
        switch (mes) {
            case 1:
                return (dia <= 20) ? "Capricórnio" : "Aquário";
            case 2:
                return (dia <= 18) ? "Aquário" : "Peixes";
            case 3:
                return (dia <= 20) ? "Peixes" : "Áries";
            case 4:
                return (dia <= 20) ? "Áries" : "Touro";
            case 5:
                return (dia <= 20) ? "Touro" : "Gêmeos";
            case 6:
                return (dia <= 20) ? "Gêmeos" : "Câncer";
            case 7:
                return (dia <= 22) ? "Câncer" : "Leão";
            case 8:
                return (dia <= 22) ? "Leão" : "Virgem";
            case 9:
                return (dia <= 22) ? "Virgem" : "Libra";
            case 10:
                return (dia <= 22) ? "Libra" : "Escorpião";
            case 11:
                return (dia <= 21) ? "Escorpião" : "Sagitário";
            case 12:
                return (dia <= 21) ? "Sagitário" : "Capricórnio";
            default:
                return "";
        }
    }

    private static int getIdade(int diaNascimento, int mesNascimento, int anoNascimento,
                                int diaAtual, int mesAtual, int anoAtual)
    {
        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }
}