/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * A classe Funcoes contém métodos utilitários para formatação de CPF, conversão
 * de string para double e formatação de números no formato brasileiro.
 *
 * @author Vitor Hugo
 */
public class Funcoes {

    /**
     * Formata um CPF no formato XXX.XXX.XXX-XX.
     *
     * @param cpf O CPF a ser formatado.
     * @return O CPF formatado.
     * @throws IllegalArgumentException Se o CPF não tiver exatamente 11 dígitos
     * numéricos.
     */
    public static String formatCPF(String cpf) {
        // Verifica se a string tem exatamente 11 caracteres
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos numéricos.");
        }

        return String.format("%s.%s.%s-%s",
                cpf.substring(0, 3),
                cpf.substring(3, 6),
                cpf.substring(6, 9),
                cpf.substring(9, 11));
    }

    /**
     * Converte uma string representando um número com vírgula para um número
     * com ponto.
     *
     * @param valor A string contendo o número com vírgula.
     * @return A string contendo o número com ponto.
     */
    public static String toDouble(String valor) {
        return valor.replace(',', '.');
    }

    /**
     * Formata um número double no formato brasileiro.
     *
     * @param valor O número a ser formatado.
     * @return O número formatado no formato brasileiro.
     */
    public static String formatar(double valor) {
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
        //nf.setMinimumFractionDigits(2);
        //nf.setMaximumFractionDigits(2);
        return nf.format(valor);
    }
}
