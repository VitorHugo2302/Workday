/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import Banco.BancoMysql;
import Classes.FolhaDePagamento;
import Classes.Funcoes;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TelaFolhaDePagamento é uma classe que representa uma janela interna
 * (JInternalFrame) para exibir a folha de pagamento do mês atual.
 * <p>
 * A tela exibe a folha de pagamento da empresa Workday
 * </p>
 *
 * @version 1.0
 * @since 2023-06-13
 *
 * @see javax.swing.JInternalFrame
 * @see Banco.BancoMysql
 */
public class TelaFolhaDePagamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFolhaDePagamento
     */
    public TelaFolhaDePagamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFolha = new javax.swing.JTextArea();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Folha de Pagamento");

        txtFolha.setEditable(false);
        txtFolha.setColumns(20);
        txtFolha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFolha.setRows(5);
        jScrollPane1.setViewportView(txtFolha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            // TODO add your handling code here:
            PreencheFolhaPagamento();
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(TelaFolhaDePagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened
    
    /**
     * Método para carregar os dados das tabelas de funcionários e benefícios. Este método
     * recupera os dados do banco de dados e preenche a tela com esses
     * dados.
     *
     * @throws java.sql.SQLException
     * @throws java.text.ParseException
     */
    public void PreencheFolhaPagamento() throws SQLException, ParseException {
        var retorno = BancoMysql.ExecutarConsulta("select * from funcionarios inner join beneficios on idBeneficios = idBeneficio");

        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        String dataFormatada = dataAtual.format(formatter);
        txtFolha.setText("Folha de Pagamento dos Funcionários do mês " + dataFormatada + ":\n\n");

        double salarioTotal = 0;
        while (retorno.next()) {
            FolhaDePagamento folha = new FolhaDePagamento(retorno.getDouble("salario"), retorno.getInt("horasTrabalhadas"));

            txtFolha.append(retorno.getString("nomeFuncionario") + ": Salário base: R$" + Funcoes.formatar(retorno.getDouble("salario"))
                    + ": Horas: " + retorno.getInt("horasTrabalhadas") + ": Salário bruto: R$" + folha.getSalarioBruto() + ": Benefícios " + retorno.getString("NomeBeneficio") + ";\n\n");

            Locale locale = Locale.GERMANY;
            NumberFormat numberFormat = NumberFormat.getInstance(locale);
            Number number = numberFormat.parse(folha.getSalarioBruto());
            double doubleValue = number.doubleValue();
            salarioTotal += doubleValue;
        }
        txtFolha.append("Valor mensal total: R$" + Funcoes.formatar(salarioTotal));

        BancoMysql.FecharConexao();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtFolha;
    // End of variables declaration//GEN-END:variables
}
