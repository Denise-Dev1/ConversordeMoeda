import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valor;

        do {
            System.out.println("=== Conversor de Moeda ===");
            System.out.println("1. Converter para Dólar (USD)");
            System.out.println("2. Converter para Euro (EUR)");
            System.out.println("3. Converter para Libra (GBP)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite o valor em Reais (BRL): ");
                valor = Double.parseDouble(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.printf("Valor em Dólar: %.2f USD\n\n", Conversor.converterParaDolar(valor));
                        break;
                    case 2:
                        System.out.printf("Valor em Euro: %.2f EUR\n\n", Conversor.converterParaEuro(valor));
                        break;
                    case 3:
                        System.out.printf("Valor em Libra: %.2f GBP\n\n", Conversor.converterParaLibra(valor));
                        break;
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 4);

        System.out.println("Obrigado por usar o conversor!");
        scanner.close();
    }
}

