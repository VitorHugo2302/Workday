import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void executar(Scanner scanner) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n=== Menu Funcionários ===");
            System.out.println("1. Cadastro de Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner);
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Principal...");
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private void cadastrarFuncionario(Scanner scanner) {
        System.out.println("\n=== Cadastro de Funcionário ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário Base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); 

        Funcionario funcionario = new Funcionario(nome, cpf, cargo, salarioBase);
        funcionarios.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private void listarFuncionarios() {
        System.out.println("\n=== Lista de Funcionários ===");
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + ", CPF: " + f.getCpf() + ", Cargo: " + f.getCargo() + ", Salário Base: " + f.getSalarioBase());
        }
    }
}
