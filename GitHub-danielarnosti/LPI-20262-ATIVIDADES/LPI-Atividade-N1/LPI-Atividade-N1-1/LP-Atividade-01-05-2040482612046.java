import java.util.Scanner;

public class LP-Atividade-01-05-2040482612046{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Estoque inicial: ");
        int estoque = scanner.nextInt();

        System.out.print("Quantidade de entrada: ");
        int qtdEntrada = scanner.nextInt();

        System.out.print("Quantidade de saída 1: ");
        int qtdSaida1 = scanner.nextInt();

        System.out.print("Quantidade de saída 2: ");
        int qtdSaida2 = scanner.nextInt();

        System.out.print("Estoque mínimo: ");
        int estoqueMinimo = scanner.nextInt();

        System.out.print("Tamanho do lote (caixa): ");
        int tamanhoLote = scanner.nextInt();

        System.out.println("Estoque inicial: " + estoque + " unidades.");

        estoque += qtdEntrada;
        System.out.println("Após entrada (+" + qtdEntrada + "): "
                + estoque + " unidades.");

        estoque -= qtdSaida1;
        System.out.println("Após saída (-" + qtdSaida1 + "): "
                + estoque + " unidades.");

        estoque -= qtdSaida2;
        System.out.println("Após outra saída (-" + qtdSaida2 + "): "
                + estoque + " unidades.");

        boolean abaixoDoMinimo = estoque < estoqueMinimo;

        System.out.println("O nível de estoque atual (" + estoque
                + ") está abaixo do mínimo (" + estoqueMinimo + ")? "
                + abaixoDoMinimo);

        int unidadesForaDeCaixas = estoque % tamanhoLote;

        System.out.println("Unidades fora de caixas fechadas de "
                + tamanhoLote + ": " + unidadesForaDeCaixas);

        boolean estoqueFracionado = estoque % tamanhoLote == 0;

        System.out.println("O estoque está perfeitamente fracionado em "
                + "caixas completas? " + estoqueFracionado);

        scanner.close();
    }
}