import java.util.Scanner;

public class LP-Atividade-01-09-2040482612046{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();

        String situacaoIfElse;

        if (notaFinal >= 6) {
            situacaoIfElse = "Aprovado";
        } else {
            situacaoIfElse = "Reprovado";
        }

        System.out.println("\n--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        System.out.println("Situação (if-else): " + situacaoIfElse);

        String situacaoTernario = notaFinal >= 6 ? "Aprovado" : "Reprovado";

        System.out.println("\n--- Abordagem 2: Operador Ternário Simples ---");
        System.out.println("Situação (Ternário): " + situacaoTernario);

        scanner.close();
    }
}