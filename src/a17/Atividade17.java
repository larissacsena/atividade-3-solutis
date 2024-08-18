package a17;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        System.out.print("Digite o dia: ");
        int dia = scan.nextInt();
        
        if (dia < 1 || dia > 31){
            System.out.println("Dia inválido.");
            scan.close();
            return;
        }
        
        System.out.print("Digite o mês (1-12): ");
        int mes = scan.nextInt();
        scan.close();

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido.");
            return;
        }

        boolean dataValida = false;
        int diasNoMes;

        switch (mes) {
            case 2:
                diasNoMes = 28;
                break;
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            default:
                diasNoMes = 31;
                break;
        }

        if (dia <= diasNoMes) {
            dataValida = true;
        }
        
        String trimestre;
        
        if (mes <= 3) {
            trimestre = "1º ";
        } else if (mes <= 6){
            trimestre = "2º ";
        } else if (mes <= 9){
            trimestre = "3º ";
        } else {
            trimestre = "4º ";
        }

        String signo = "";
        
        switch (mes) {
            case 1:
                if (dia <= 20) {
                    signo = "Capricórnio";
                } else {
                   signo = "Aquário"; 
                }
                break;
            case 2:
                if (dia <= 18) {
                    signo = "Aquário";
                } else {
                    signo = "Peixes";
                }
                break;
            case 3:
                if (dia <= 20) {
                    signo = "Peixes";
                } else {
                    signo = "Áries";
                }
                break;
            case 4:
                if (dia <= 20) {
                    signo = "Áries";
                } else {
                    signo = "Touro";
                }
                break;
            case 5:
                if (dia <= 20){
                    signo = "Touro";
                } else {
                    signo = "Gêmeos";
                }
                break;
            case 6:
                if (dia <= 20){
                    signo = "Gêmeos";
                } else {
                    signo = "Câncer";
                }
                break;
            case 7:
                if (dia <= 22){
                    signo = "Câncer";
                } else {
                    signo = "Leão";
                }
                break;
            case 8:
                if (dia <= 22){
                    signo = "Leão";
                } else {
                    signo = "Virgem";
                }
                break;
            case 9:
                if (dia <= 22){
                    signo = "Virgem";
                } else {
                    signo = "Libra";
                }
                break;
            case 10:
                if (dia <= 22){
                    signo = "Libra";
                } else {
                    signo = "Escorpião";
                }
                break;
            case 11:
                if (dia <= 21){
                    signo = "Escorpião";
                } else {
                    signo = "Sagitário";
                }
                break;
            case 12:
                if (dia <= 21){
                    signo = "Sagitário";
                } else {
                    signo = "Capricórnio";
                }
                break;
        }
        
        if (dataValida) {
            System.out.println("Data válida: " + dia + " de " + nomesMeses[mes - 1]);
            System.out.println("Você nasceu no " + trimestre + "trimestre");
            System.out.println("Seu signo é: " + signo);
        } else {
            System.out.println("Data inválida.");
        }
    }
}