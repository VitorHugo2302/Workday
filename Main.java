import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Financeiro financeiro = new Financeiro();

        char opcao;
        do {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Benefícios");
            System.out.println("2 - Funcionários");
            System.out.println("3 - Financeiro");
            System.out.println("4 - Relatórios ");
            System.out.println("S - Sair");

            opcao = Character.toUpperCase(scanner.next().charAt(0));

            switch (opcao) {
                case '1':
                    // Código para administrar benefícios
                    break;
                case '2':
                    // Código para funcionários
                    break;
                case '3':
                    System.out.println("Acessando o módulo Financeiro...");
                    financeiro.executar(scanner); 
                    break;
                case '4':
                    // Código para relatórios
                    break;
                case 'S':
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 'S');

        scanner.close();
    }
}