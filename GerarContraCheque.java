
import java.util.List;
import java.util.Scanner;

public class GerarContraCheque {
    private List<RegistroDeHoras> registrosDeHoras;
    private List<Funcionario> funcionarios;

    public GerarContraCheque(List<Funcionario> funcionarios, List<RegistroDeHoras> registrosDeHoras) {
        this.funcionarios = funcionarios;
        this.registrosDeHoras = registrosDeHoras;
    }

    public void executar(Scanner scanner) {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n=== Geração de Contracheques ===");
            System.out.println("1. Gerar Contracheque");
            System.out.println("2. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    gerarContracheque(scanner);
                    break;
                case 2:
                    System.out.println("Voltando ao Menu Principal...");
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private void gerarContracheque(Scanner scanner) {
        System.out.println("\n=== Gerar Contracheque ===");

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
