import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double diametro = 0;
        double volume = 0;

        System.out.println("Digite o valor do diametro: ");
        diametro = Double.parseDouble(scan.nextLine());

        volume = (4  * Math.PI * Math.pow((diametro / 2), 3)) / 3;

        System.out.println("O volume é: " + volume);

    }
}
