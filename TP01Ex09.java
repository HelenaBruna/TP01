import java.util.Scanner;

public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // isso aqui vai ser usado para pega os valores digitados do usuario

        double valorResistencia = 0;
        double valorCorrente = 0;

        System.out.println("Digite o valor da resistencia: ");
        valorResistencia = Double.parseDouble(scan.nextLine());

        System.out.println("DIgite o valor da corrente eletrica");
        valorCorrente = Double.parseDouble(scan.nextLine());

        System.out.println("O valor da tensão é: " + Double.toString(valorCorrente * valorResistencia));
    }

}
