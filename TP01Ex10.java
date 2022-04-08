import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double tempCel = 0;
        double tempConvertida = 0;

        System.out.println("Digite a temperatura em celsius: ");
        tempCel = Double.parseDouble(scan.nextLine());

        tempConvertida = ((tempCel * 1.8) + 32);

        System.out.println("A temperatura em fahrenheit é: " + Double.toString(tempConvertida));

    }
}
