import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double valor1 = 0;
        double valor2 = 0;
        double media = 0;

        System.out.println("Digite o primeiro valor: ");
        valor1 = Double.parseDouble(scan.nextLine());

        System.out.println("Digite o segundo valor: ");
        valor2 = Double.parseDouble(scan.nextLine());

        media = Math.sqrt((valor1 * valor2));

        System.out.println("A media é: " + media);

    }
}
