import java.util.Scanner;

public class LP-Atividade-01-08-2040482612046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = scanner.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        long valorTotalCentavos = Math.round(valorTotalReais * 100);
        long valorParcelaCentavos = valorTotalCentavos / numeroParcelas;

        double valorParcelaReais = valorParcelaCentavos / 100.0;

        System.out.println("\n--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorTotalCentavos + " centavos.");
        System.out.println("Divisão de R$" + String.format("%.2f", valorTotalReais)
                + " por " + numeroParcelas + " em centavos: "
                + valorParcelaCentavos + " centavos por parcela.");
        System.out.println("Valor convertido para exibição: R$"
                + String.format("%.2f", valorParcelaReais));

        scanner.close();
    }
}