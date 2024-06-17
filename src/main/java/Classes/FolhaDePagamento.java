/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * A classe FolhaDePagamento representa uma folha de pagamento de um
 * funcionário, calculando o salário líquido, salário bruto e o desconto do
 * INSS.
 *
 * @author Vitor Hugo
 */
public class FolhaDePagamento {

    private double salarioLiquido;
    private double salarioBruto;
    private double inss;

    /**
     * Construtor para criar uma nova folha de pagamento com base no salário
     * base e horas trabalhadas do funcionário.
     *
     * @param salarioBase O salário base do funcionário.
     * @param horasTrabalhadas O número de horas trabalhadas pelo funcionário.
     */
    public FolhaDePagamento(double salarioBase, int horasTrabalhadas) {

        double valorHoraExtra = salarioBase / 160; //dividir por 160 para saber quanto o funcionária ganha por hora
        double salarioComHorasExtras = salarioBase + (valorHoraExtra * horasTrabalhadas);

        double totalBruto = salarioComHorasExtras + 100; //adicionando 100 reais dos benefícios

        double inss = calcularINSS(totalBruto);
        double salarioLiquido = totalBruto - inss;

        this.inss = inss;
        this.salarioLiquido = salarioLiquido;
        this.salarioBruto = totalBruto;
    }

    private double calcularINSS(double salarioBruto) {
        double inss;
        if (salarioBruto <= 1412.00) {
            inss = salarioBruto * 0.075;
        } else if (salarioBruto <= 2666.68) {
            inss = salarioBruto * 0.09;
        } else if (salarioBruto <= 4000.03) {
            inss = salarioBruto * 0.12;
        } else if (salarioBruto <= 7786.02) {
            inss = salarioBruto * 0.14;
        } else {
            inss = 751.99;
        }
        return inss;
    }

    /**
     * Obtém o salário líquido formatado como string.
     *
     * @return O salário líquido formatado.
     */
    public String getSalarioLiquido() {
        return Funcoes.formatar(salarioLiquido);
    }

    /**
     * Obtém o salário bruto formatado como string.
     *
     * @return O salário bruto formatado.
     */
    public String getSalarioBruto() {
        return Funcoes.formatar(salarioBruto);
    }

    /**
     * Obtém o valor do INSS formatado como string.
     *
     * @return O valor do INSS formatado.
     */
    public String getInss() {
        return Funcoes.formatar(inss);
    }
}
