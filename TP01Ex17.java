import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorX = 0;
        double valorY = 0;

        System.out.println("Digite o valor de X: ");
        valorX = Double.parseDouble(scan.nextLine());

        System.out.println("Digite o valor de Y: ");
        valorY = Double.parseDouble(scan.nextLine());

        System.out.println(Double.toString(valorX) + " elevado a " + Double.toString(valorY) + ": " + Math.pow(valorX, valorY));
    }
}