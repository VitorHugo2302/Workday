public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private double salarioBase;

    public Funcionario(String nome, String cpf, String cargo, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public double calcularSalario(double horasTrabalhadas) {
       
        double valorPorHora = salarioBase / 160; 
        return horasTrabalhadas * valorPorHora;
    }
}