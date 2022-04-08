import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        double valor4 = 0;
        double media = 0;

        System.out.println("Digite o primeiro valor: ");
        valor1 = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o segundo valor: ");
        valor2 = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o terceiro valor: ");
        valor3 = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o quarto valor: ");
        valor4 = Double.parseDouble(scan.nextLine());

        media = (valor1 + valor2 + valor3 + valor4) / 4;

        System.out.println("A media é: " + media);

    }
}
