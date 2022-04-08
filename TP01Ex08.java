import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {

        double milhasDigitadas;
        double quilometrosConvertido;

        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        System.out.println("Digite a milha maritima: ");
        milhasDigitadas = Double.parseDouble(scan.nextLine());

        quilometrosConvertido = (milhasDigitadas * 1852) / 1000;

        System.out.println("Quilometros: " + Double.toString(quilometrosConvertido));

    }
}
