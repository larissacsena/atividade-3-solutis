package a15;

import java.util.Scanner;

//Variaveis implantadas diretamente dentro da classe e definidas como public pra poder ser importadas na atividade 16
public class Atividade15 {
    public short dia,mes;
    public String nomeMes = "";
    public boolean validadeData = true;

    //Método para verificar o dia e mês de nascimento
    public void dataNascimento() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia de nascimento");
        dia = sc.nextShort();
        System.out.println("Informe o mes");
        mes = sc.nextShort();

        //Laço de seleção onde ele puxa o número do mês de nascimento, atribui um nomes a ele e determina se a data é válida ou inválida
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                if (dia < 1 || dia > 31) {
                    validadeData = false;
                }
                break;

            case 2:
                nomeMes = "Fevereiro";
                if (dia < 1 || dia > 28) {
                    validadeData = false;
                }
                break;

            case 3:
                nomeMes = "Março";
                if (dia < 1 || dia > 31) {
                    validadeData = false;
                }
                break;

            case 4:
                nomeMes = "Abril";
                if (dia < 1 || dia > 30) {
                    validadeData = false;
                }
                break;

            case 5:
                nomeMes = "Maio";
                if (dia < 1 || dia > 31) {
                    validadeData = false;
                }
                break;

            case 6:
                nomeMes = "Junho";
                if (dia < 1 || dia > 30) {
                    validadeData = false;
                }
                break;

            case 7:
                nomeMes = "Julho";
                if (dia < 1 || dia > 31) {
                    validadeData = false;
                }
                break;

            case 8:
                nomeMes = "Agosto";
                if (dia < 1 || dia > 31) {
                    validadeData = false;
                }
                break;

            case 9:
                nomeMes = "Setembro";
                if (dia < 1 || dia > 30) {
                    validadeData = false;
                }
                break;

            case 10:
                nomeMes = "Outubro";
                if (dia < 1 || dia > 31) {
                    validadeData = false;
                }
                break;

            case 11:
                nomeMes = "Novembro";
                if (dia < 1 || dia > 30) {
                    validadeData = false;
                }
                break;

            case 12:
                nomeMes = "Dezembro";
                if (dia < 1 || dia > 31) {
                    validadeData = false;
                }
                break;

            //Caso o mês não esteja entre os 12 números, ele retorna automaticamente como inválido.
            default:
                validadeData = false;
                break;

        }

        // Verifica o dado boleano pra verificar se a data é valida ou não, e retorna o valor respectivo
        if(validadeData==true){
            System.out.println("Data válida!");
            System.out.println("Mês de nascimento: "+nomeMes);
        }
        else{
            System.out.println("Data inválida!");
        }

    }
}
