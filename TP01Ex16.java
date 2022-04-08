import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valorAngulo = 0;

        System.out.println("Digite o valor do angulo: ");
        valorAngulo = Double.parseDouble(scan.nextLine());

        System.out.println("Seno : " + Math.sin(valorAngulo));
        System.out.println("Cosseno : " + Math.cos(valorAngulo));
        System.out.println("Tangente : " + Math.tan(valorAngulo));
        System.out.println("Secante : " + 1 / Math.cos(valorAngulo));

    }
}
