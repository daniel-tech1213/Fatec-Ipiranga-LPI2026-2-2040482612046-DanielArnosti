import java.util.Scanner;

public class LP-Atividade-01-06-2040482612046{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome de usuário: ");
        String texto = scanner.nextLine();

        boolean textoValido = texto != null && texto.length() > 0;

        if (textoValido) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        scanner.close();
    }
}