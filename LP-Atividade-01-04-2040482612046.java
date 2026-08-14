import java.util.Scanner;

public class LP-Atividade-01-04-2040482612046.java {

    public static final String INSTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO_EMPRESTIMO = 14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de dias do empréstimo: ");
        final int diasEmprestimo = scanner.nextInt();

        final int diasDevolucao = calcularDiasDevolucao(diasEmprestimo);

        System.out.println("Instituição: " + INSTITUICAO);
        System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_EMPRESTIMO + " dias.");
        System.out.println("Dias calculados para devolução: " + diasDevolucao);

        scanner.close();
    }

    public static int calcularDiasDevolucao(final int diasEmprestimo) {
        final int diasDevolucao;

        if (diasEmprestimo < 0) {
            diasDevolucao = 0;
        } else if (diasEmprestimo > PRAZO_MAXIMO_EMPRESTIMO) {
            diasDevolucao = PRAZO_MAXIMO_EMPRESTIMO;
        } else {
            diasDevolucao = diasEmprestimo;
        }

        return diasDevolucao;
    }

    /*
    final int prazo = 10;
    prazo = 15;
    */
}
