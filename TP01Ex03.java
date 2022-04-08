import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double valorDiag = 0;
        double valorArea = 0;

        System.out.println("Digite o valor da diagonal: ");
        valorDiag = Double.parseDouble(scan.nextLine());

        valorArea = (valorDiag * valorDiag) / 2;

        System.out.println("O valor da area é: " + valorArea);

    }
}
