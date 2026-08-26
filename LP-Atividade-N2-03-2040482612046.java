import java.util.Scanner;

public class ValidacaoPin {

    public static final int PIN_CORRETO = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pinDigitado;
        int tentativas = 0;

        
        do {
            System.out.print("Digite o PIN de acesso: ");
            pinDigitado = scanner.nextInt();
            tentativas++;

            if (pinDigitado != PIN_CORRETO) {
                System.out.println("PIN incorreto. Tente novamente.");
            }
        } while (pinDigitado != PIN_CORRETO);

        System.out.println("Acesso liberado! Total de tentativas: " + tentativas);

        scanner.close();
    }
}