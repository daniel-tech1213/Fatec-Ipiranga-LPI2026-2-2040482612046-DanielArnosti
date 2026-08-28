import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LP-Atividade-01-07-2040482612046{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor A (ex.: 1.00): ");
        String valorA = scanner.nextLine();

        System.out.print("Informe o valor B (ex.: 0.90): ");
        String valorB = scanner.nextLine();

        System.out.print("Informe o valor total da compra: ");
        String valorCompra = scanner.nextLine();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        double aDouble = Double.parseDouble(valorA);
        double bDouble = Double.parseDouble(valorB);
        double resultadoDouble = aDouble - bDouble;

        BigDecimal aBigDecimal = new BigDecimal(valorA);
        BigDecimal bBigDecimal = new BigDecimal(valorB);
        BigDecimal resultadoBigDecimal = aBigDecimal.subtract(bBigDecimal);

        BigDecimal compra = new BigDecimal(valorCompra);
        BigDecimal parcelas = compra.divide(
                BigDecimal.valueOf(numeroParcelas),
                2,
                RoundingMode.HALF_UP
        );

        System.out.println("\n--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - " + valorB
                + " seria 0.10");
        System.out.println("Resultado real obtido com double: " + resultadoDouble);

        System.out.println("\n--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): "
                + resultadoBigDecimal);

        System.out.println("\n--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + compra + " dividida em "
                + numeroParcelas + "x: R$ " + parcelas + " por parcela.");

        scanner.close();
    }
}