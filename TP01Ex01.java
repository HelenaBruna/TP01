import java.util.Scanner;

public class TP01Ex01 {
    public static void main(String[] args) {

        double baseRetangulo = 0;
        double alturaRetangulo = 0;
        double areaRetangulo = 0;

        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        // base do retangulo
        System.out.println("Digite a base do retângulo: "); // vai exibir na tela
        baseRetangulo = Double.parseDouble(scan.nextLine()); // recebe do usuario e converte string para double

        // altura do retangulo
        System.out.println("Digite a altura do retângulo: "); // vai exibir na tela
        alturaRetangulo = Double.parseDouble(scan.nextLine()); // recebe do usuario e converte string para double

        // calculo

        areaRetangulo = baseRetangulo * alturaRetangulo;

        // Exibir para o usuario o calculo
        System.out.println("A área do retângulo é: " + Double.toString(areaRetangulo));

    }
}