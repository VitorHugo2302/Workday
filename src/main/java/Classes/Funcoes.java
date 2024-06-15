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
public class Funcoes {

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

    public static String toDouble(String valor) {
        return valor.replace(',', '.');
    }

    public static String formatar(double valor) {
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
        //nf.setMinimumFractionDigits(2);
        //nf.setMaximumFractionDigits(2);
        return nf.format(valor);
    }
}
