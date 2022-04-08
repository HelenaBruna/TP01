import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorProduto1 = 0;
        double valorProduto2 = 0;
        double valorProduto3 = 0;
        double valorProduto4 = 0;
        double valorProduto5 = 0;
        double soma = 0;
        double pagamento = 0;

        System.out.println("Digite o valor do primeiro produto: ");
        valorProduto1 = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o valor do segundo produto: ");
        valorProduto2 = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o valor do terceiro produto: ");
        valorProduto3 = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o valor do quarto produto: ");
        valorProduto4 = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o valor do quinto produto: ");
        valorProduto5 = Double.parseDouble(scan.nextLine());

        soma = valorProduto1 + valorProduto2 + valorProduto3 + valorProduto4 + valorProduto5;

        System.out.println("Digite o pagamento: ");
        pagamento = Double.parseDouble(scan.nextLine());

        System.out.println("O troco para ser devolvido: " + (pagamento - soma));

    }
}
