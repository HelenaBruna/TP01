import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double velocidade = 0;
        double aceleracao = 0;
        double tempo = 0;
        double calculo = 0;

        System.out.println("Digite a velocidade inical: ");
        velocidade = Double.parseDouble(scan.nextLine());
        System.out.println("Digite aceleracao: ");
        aceleracao = Double.parseDouble(scan.nextLine());
        System.out.println("Tempo de percuso");
        tempo = Double.parseDouble(scan.nextLine());

        calculo = velocidade + (aceleracao * tempo);

        System.out.println("A velocidade final: " + calculo);

    }
}
