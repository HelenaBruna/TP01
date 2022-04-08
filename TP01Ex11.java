import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double diametro = 0;
        double area = 0;

        System.out.println("Digite o diametro: ");
        diametro = Double.parseDouble(scan.nextLine());

        area = Math.PI * Math.pow((diametro / 2), 2);

        System.out.println("A area é: " + Double.toString(area));
    }
}
