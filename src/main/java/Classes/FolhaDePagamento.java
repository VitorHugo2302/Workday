/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Vitor Hugo
 */
public class FolhaDePagamento {

    private double salarioLiquido;
    private double salarioBruto;
    private double inss;

    public FolhaDePagamento(double salarioBase, int horasTrabalhadas) {
         
        double valorHoraExtra = salarioBase / 20;
        double salarioComHorasExtras = salarioBase + (valorHoraExtra * horasTrabalhadas);

        double totalBruto = salarioComHorasExtras;

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

    public String getSalarioLiquido() {
        return Funcoes.formatar(salarioLiquido);
    }

    public String getSalarioBruto() {
        return Funcoes.formatar(salarioBruto);
    }

    public String getInss() {
        return Funcoes.formatar(inss);
    }

}
