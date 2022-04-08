import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double valorAresta = 0;

        System.out.println("Digite o valor da aresta: ");
        valorAresta = Double.parseDouble(scan.nextLine());

        System.out.println("A area do quadrado é: " + (valorAresta * valorAresta));

    }
}
