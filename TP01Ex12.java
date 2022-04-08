import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double altura = 0;
        double raio = 0;
        double volume = 0;

        System.out.println("Digite a altura: ");
        altura = Double.parseDouble(scan.nextLine());

        System.out.println("Digite o raio:");
        raio = Double.parseDouble(scan.nextLine());

        volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;

        System.out.println("O volume é: " + volume);

    }
}
