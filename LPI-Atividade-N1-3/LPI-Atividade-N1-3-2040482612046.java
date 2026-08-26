import java.util.Scanner;

public class ProcessamentoTemperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // ETAPA 1: Leitura da quantidade e instanciação do vetor

        int quantidadeLeituras;
        do {
            System.out.print("Digite a quantidade de leituras (mínimo 1): ");
            quantidadeLeituras = scanner.nextInt();
        } while (quantidadeLeituras < 1);

        double[] leituras = new double[quantidadeLeituras];


        // ETAPA 2: Leitura e armazenamento das temperaturas

        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.print("Digite a temperatura em °C para a leitura [" + i + "]: ");
            leituras[i] = scanner.nextDouble();
        }


        // ETAPA 3: Impressão completa com laço for tradicional

        System.out.println("\n--- Exibição das Leituras ---");
        for (int i = 0; i < leituras.length; i++) {
            System.out.printf("Leitura [%d]: %.1f°C%n", i, leituras[i]);
        }


        // ETAPA 4: Acesso direto por índice (primeira e última leitura)

        System.out.println("\n--- Acesso Direto ---");
        System.out.printf("Primeira leitura (índice 0): %.1f°C%n", leituras[0]);
        System.out.printf("Última leitura (índice %d): %.1f°C%n", leituras.length - 1, leituras[leituras.length - 1]);


        // ETAPA 5: Busca linear (Maior e Menor temperatura e seus índices)

        double maior = leituras[0];
        int indiceMaior = 0;

        double menor = leituras[0];
        int indiceMenor = 0;

        for (int i = 1; i < leituras.length; i++) {
            if (leituras[i] > maior) {
                maior = leituras[i];
                indiceMaior = i;
            }
            if (leituras[i] < menor) {
                menor = leituras[i];
                indiceMenor = i;
            }
        }

        System.out.println("\n--- Resultados da Busca Linear (Maior/Menor) ---");
        System.out.printf("Maior temperatura: %.1f°C no índice %d%n", maior, indiceMaior);
        System.out.printf("Menor temperatura: %.1f°C no índice %d%n", menor, indiceMenor);

        
        // ETAPA 6: Busca linear da primeira ocorrência da temperatura crítica
        
        System.out.println("\n--- Verificação de Temperatura Crítica ---");
        System.out.print("Digite a temperatura crítica de alerta: ");
        double temperaturaCritica = scanner.nextDouble();

        int indiceCritico = -1;

        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] >= temperaturaCritica) {
                indiceCritico = i;
                break; // Interrompe ao encontrar a primeira ocorrência
            }
        }

        if (indiceCritico != -1) {
            System.out.printf("Alerta! A primeira ocorrência >= %.1f°C foi encontrada no índice %d (valor: %.1f°C).%n", 
                              temperaturaCritica, indiceCritico, leituras[indiceCritico]);
        } else {
            System.out.printf("Nenhuma leitura atingiu ou ultrapassou a temperatura crítica de %.1f°C.%n", temperaturaCritica);
        }

        scanner.close();
    }
}