import java.util.List;

public class FolhaPagamento {

    private double calcularINSS(double salarioBruto) {
        double inss;
        if (salarioBruto <= 1100) {
            inss = salarioBruto * 0.075; 
        } else if (salarioBruto <= 2203.48) {
            inss = salarioBruto * 0.09; 
        } else if (salarioBruto <= 3305.22) {
            inss = salarioBruto * 0.12; 
        } else if (salarioBruto <= 6433.57) {
            inss = salarioBruto * 0.14; 
        } else {
            inss = 751.99; 
        }
        return inss;
    }

    public void calcularFolha(List<Funcionario> funcionarios, List<RegistroDeHoras> registrosDeHoras) {
    
        for (Funcionario funcionario : funcionarios) {
            double salarioBase = funcionario.getSalarioBase();
            double totalHorasTrabalhadas = 0;

            for (RegistroDeHoras registro : registrosDeHoras) {
                if (registro.getCpf().equals(funcionario.getCpf())) {
                    totalHorasTrabalhadas += registro.getHorasTrabalhadas();
                }
            }

            double valorHoraExtra = salarioBase * 1.5; 
            double horasExtras = Math.max(totalHorasTrabalhadas - 160, 0); 
            double salarioComHorasExtras = salarioBase + (horasExtras * valorHoraExtra);

            double totalBruto = salarioComHorasExtras;

            double inss = calcularINSS(totalBruto);

            double salarioTotal = totalBruto - inss;

            System.out.println("Nome: " + funcionario.getNome() + ", Salário Total: " + salarioTotal);
        }
    }
}