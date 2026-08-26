import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidade = scanner.nextInt();

        double soma = 0;
        double maiorNota = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            soma += nota;

            if (i == 0 || nota > maiorNota) {
                maiorNota = nota;
            }
        }

        double media = soma / quantidade;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Soma total das notas: " + soma);
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);

        scanner.close();
    }
}