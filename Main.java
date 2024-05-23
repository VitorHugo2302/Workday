import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Financeiro financeiro = new Financeiro();
        Relatorios relatorios = new Relatorios();
        Funcionarios funcionarios = new Funcionarios();
        Beneficios beneficios = new Beneficios();
        

        char opcao;
        do {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Benefícios");
            System.out.println("2 - Funcionários");
            System.out.println("3 - Financeiro");
            System.out.println("4 - Relatórios");
            System.out.println("S - Sair");

            opcao = Character.toUpperCase(scanner.next().charAt(0));

            switch (opcao) {
                case '1':
                    System.out.println("Acessando o módulo Benefícios...");
                    beneficios.executar(scanner);
                    break;
                case '2':
                    System.out.println("Acessando o módulo Funcionários...");
                    funcionarios.executar(scanner);
                    break;
                case '3':
                    System.out.println("Acessando o módulo Financeiro...");
                    financeiro.executar(scanner);
                    break;
                case '4':
                    System.out.println("Acessando o módulo Relatórios...");
                    relatorios.executar(scanner);
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