package a24;

public class ValidaData {

    public static boolean isAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static boolean isDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isAnoBissexto(ano)) {
            diasPorMes[1] = 29;
        }
        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }
}
