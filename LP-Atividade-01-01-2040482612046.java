import java.util.Scanner;
public class LP-Atividade-01-01-2040482612046{
public static void main(String[] args) {
    Scanner scanner = new Scanner(Systen.in);
    System.out.print("idade do aluno: ");
    byte idade = scanner.nextByte();
    
    System.out.print("numero de faltas: ");
    short faltas = scanner.nextShort();
    
    System.out.print("matricula ID: ");
    int matriculaId = scanner.nextInt();

    System.out.print("codigo nacional do estudante: ");
    long codigoNacional = scnner.nextLong();

    System.out.print("nota do trabalho: ");
    float notaTrabalho = scanner.nextFloat();

    System.out.print("nota da prova final: ");
    double notaProvaFinal = scanner.nextDouble();

    System.out.print("conceito final do aluno: ");
    char conceitoFinal = scanner.nextChar();

    System.out.print("aluno esta aprovado: ");
    boolean aprovado = scanner.nextBooLean();

    System.out.println("\n--- Dados do Aluno Fictício ---");
    System.out.println("Idade do Aluno: " + idade + " anos");
    System.out.println("Número de Faltas: " + faltas);
    System.out.println("Matrícula ID: " + matriculaId);
    System.out.println("Código Nacional do Estudante: " + codigoNacional);
    System.out.println("Nota do Trabalho: " + notaTrabalho);
    System.out.println("Nota da Prova Final: " + notaProvaFinal);
    System.out.println("Conceito Final do Aluno: " + conceitoFinal);
    System.out.println("Aluno está Aprovado? " + aprovado);

    scanner.close();
}
}
    







