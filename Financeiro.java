import java.util.Scanner;

public class Financeiro {

    public void executar(Scanner scanner) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n=== Menu Financeiro ===");
            System.out.println("1. Cadastro de Funcionários");
            System.out.println("2. Geração de Contracheques");
            System.out.println("3. Registro de Horas Trabalhadas");
            System.out.println("4. Folha de Pagamento");
            System.out.println("5. Relatórios");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opção escolhida: Cadastro de Funcionários");
                    break;
                case 2:
                    System.out.println("Opção escolhida: Geração de Contracheques");
                    break;
                case 3:
                    System.out.println("Opção escolhida: Registro de Horas Trabalhadas");
                    break;
                case 4:
                    System.out.println("Opção escolhida: Folha de Pagamento");
                    break;
                case 5:
                    System.out.println("Opção escolhida: Relatórios");
                    break;
                case 6:
                    System.out.println("Voltando ao Menu Principal...");
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}