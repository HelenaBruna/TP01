import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double altura = 0;
        double base = 0;

        System.out.println("Digite a altura do triangulo: ");
        altura = Double.parseDouble(scan.nextLine());

        System.out.println("Digite a base do triangulo: ");
        base = Double.parseDouble(scan.nextLine());

        System.out.println("A area é: " + (altura * base) / 2);

    }
}
