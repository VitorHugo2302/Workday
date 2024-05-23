import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Financeiro {
    private List<RegistroDeHoras> registrosDeHoras = new ArrayList<>();
    private List<Funcionario> funcionarios;

    public Financeiro(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }


	public Financeiro() {
        
    }


    public void executar(Scanner scanner) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n=== Menu Financeiro ===");
            System.out.println("1. Geração de Contracheques");
            System.out.println("2. Registro de Horas Trabalhadas");
            System.out.println("3. Folha de Pagamento");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    gerarContracheque(scanner);
                    break;
                case 2:
                    registrarHoras(scanner);
                    break;
                case 3:
                    System.out.println("Opção escolhida: Folha de Pagamento");
                    FolhaPagamento folhaPagamento = new FolhaPagamento();
                    folhaPagamento.calcularFolha(funcionarios, registrosDeHoras);
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal...");
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private void registrarHoras(Scanner scanner) {
        System.out.println("\n=== Registro de Horas Trabalhadas ===");

        System.out.print("CPF do Funcionário: ");
        String cpf = scanner.nextLine();
        
        boolean cpfCadastrado = false;
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                cpfCadastrado = true;
                break;
            }
        }
        
        if (!cpfCadastrado) {
            System.out.println("CPF não cadastrado. Por favor, cadastre o funcionário primeiro.");
            return;
        }

        System.out.print("Data (dd/mm/aaaa): ");
        String data = scanner.nextLine();
        
        System.out.print("Horas Trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        scanner.nextLine(); 

        RegistroDeHoras registro = new RegistroDeHoras(cpf, data, horasTrabalhadas);
        registrosDeHoras.add(registro);

        System.out.println("Horas trabalhadas registradas com sucesso!");
    }

    private void gerarContracheque(Scanner scanner) {
        System.out.println("\n=== Geração de Contracheques ===");

        System.out.print("CPF do Funcionário: ");
        String cpf = scanner.nextLine();

        Funcionario funcionario = null;
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                funcionario = f;
                break;
            }
        }

        if (funcionario == null) {
            System.out.println("Funcionário não encontrado.");
            return;
        }

        double totalHorasTrabalhadas = 0;
        for (RegistroDeHoras registro : registrosDeHoras) {
            if (registro.getCpf().equals(cpf)) {
                totalHorasTrabalhadas += registro.getHorasTrabalhadas();
            }
        }

        double salarioTotal = funcionario.calcularSalario(totalHorasTrabalhadas);

        System.out.println("=== Contracheque ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Base: " + funcionario.getSalarioBase());
        System.out.println("Horas Trabalhadas: " + totalHorasTrabalhadas);
        System.out.println("Salário Total: " + salarioTotal);
    }
}
