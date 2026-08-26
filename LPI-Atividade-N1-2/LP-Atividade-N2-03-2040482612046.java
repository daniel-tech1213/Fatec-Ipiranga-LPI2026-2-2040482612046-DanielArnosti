import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalVendido = 0;
        int quantidadeVendas = 0;

        while (true) {
            System.out.print("Digite o valor da venda (0 para encerrar): ");
            double venda = scanner.nextDouble();

            if (venda == 0) {
                break;
            }

            totalVendido += venda;
            quantidadeVendas++;
        }

        System.out.println("\nTotal vendido: " + totalVendido);
        System.out.println("Quantidade de vendas: " + quantidadeVendas);

        if (quantidadeVendas > 0) {
            double media = totalVendido / quantidadeVendas;
            System.out.printf("Valor médio por venda: %.2f%n", media);
        } else {
            System.out.println("Nenhuma venda registrada nesta sessão.");
        }

        scanner.close();
    }
}