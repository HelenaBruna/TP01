import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cotacaoDolar = 0;
        double reaisConvetido = 0;
        double dolar = 0;

        System.out.println("Digite a cotação do dolar: ");
        cotacaoDolar = Double.parseDouble(scan.nextLine());

        System.out.println("Digite uma quantidade de dolar: ");
        dolar = Double.parseDouble(scan.nextLine());

        reaisConvetido = dolar * cotacaoDolar;

        System.out.println("O valor em reais é: " + Double.toString(reaisConvetido));

    }
}
