import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double valorR = 0;
        double valorA = 0;
        double volume = 0;

        System.out.println("Digite o valor R: ");
        valorR = Double.parseDouble(scan.nextLine());
        System.out.println("Digite valor A: ");
        valorA = Double.parseDouble(scan.nextLine());

        volume = Math.pow(valorA, 3);

        System.out.println("O valor: " + Math.PI * volume);

    }
}
