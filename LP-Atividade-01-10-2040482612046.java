import java.util.Scanner;

public class LP-Atividade-01-10-2040482612046{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor B: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor C: ");
        double c = scanner.nextDouble();

        System.out.print("Informe o valor D: ");
        double d = scanner.nextDouble();

        System.out.print("Informe a média do aluno: ");
        double media = scanner.nextDouble();

        System.out.print("Informe o percentual de presença: ");
        double presenca = scanner.nextDouble();

        double resultadoSemParenteses = a + b * c / d;
        double resultadoComParenteses = a + ((b * c) / d);

        boolean aprovadoDireto = (media >= 6) && (presenca >= 75);

        System.out.println("\n--- Demonstração de Precedência Aritmética ---");
        System.out.println("Resultado Sem parênteses: " + resultadoSemParenteses);
        System.out.println("Resultado Com parênteses explícitos: " + resultadoComParenteses);
        System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, / depois +), mas a segunda forma é mais legível.");

        System.out.println("\n--- Validação do Critério de Aprovação ---");
        System.out.println("Entrada -> Média: " + media + " | Presença: " + presenca + "%");
        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        scanner.close();
    }
}