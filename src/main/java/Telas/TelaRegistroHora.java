/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import Banco.BancoMysql;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 * TelaRegistroHora é uma classe que representa uma janela interna
 * (JInternalFrame) para o cadastro e gerenciamento das horas extras dos funcionários. Esta classe
 * permite adicionar, editar e excluir horas dos funcionários em um banco de dados MySQL.
 * <p>
 * A tela inclui campos para o nome do funcionário, e horas trabalhadas, além de uma
 * tabela para exibir as horas dos funcionários cadastrados.
 * </p>
 *
 * @version 1.0
 * @since 2023-06-13
 *
 * @see javax.swing.JInternalFrame
 * @see Banco.BancoMysql
 */
public class TelaRegistroHora extends javax.swing.JInternalFrame {

    private final Set<Integer> editedRows = new HashSet<>();

    /**
     * Creates new form TelaRegistroHora
     */
    public TelaRegistroHora() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        btnRegistrarHoras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtHorasTrabalhadas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRegistroHora = new javax.swing.JTable();
        btnEditarFuncionário = new javax.swing.JButton();
        btnDeletarHorasFuncionario = new javax.swing.JButton();

        setTitle("Registro de horas");
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar horas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CPF:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnRegistrarHoras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRegistrarHoras.setText("Registrar");
        btnRegistrarHoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarHorasMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Horas trabalhadas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarHoras)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHorasTrabalhadas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(523, 523, 523))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtHorasTrabalhadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarHoras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaRegistroHora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDFuncionario", "Nome do Funcionário", "CPF", "Horas trabalhadas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRegistroHora.setColumnSelectionAllowed(true);
        tabelaRegistroHora.setPreferredSize(new java.awt.Dimension(321, 130));
        jScrollPane1.setViewportView(tabelaRegistroHora);
        tabelaRegistroHora.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabelaRegistroHora.getColumnModel().getColumnCount() > 0) {
            tabelaRegistroHora.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaRegistroHora.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaRegistroHora.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnEditarFuncionário.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarFuncionário.setText("Salvar alterações");
        btnEditarFuncionário.setEnabled(false);
        btnEditarFuncionário.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarFuncionárioMouseClicked(evt);
            }
        });

        btnDeletarHorasFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeletarHorasFuncionario.setText("Excluir");
        btnDeletarHorasFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarHorasFuncionarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(btnEditarFuncionário)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletarHorasFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarFuncionário)
                    .addComponent(btnDeletarHorasFuncionario))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de evento para o botão Registrar Horas do Funcionário. Este método é
     * chamado quando o botão é clicado e adiciona as horas extras do funcionário ao banco
     * de dados.
     *
     * @param evt evento de clique do mouse
     */
    private void btnRegistrarHorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarHorasMouseClicked
        String horas = txtHorasTrabalhadas.getText();
        String cpf = txtCPF.getText().replaceAll("[^0-9]+", "");

        if (!cpf.isEmpty() && !horas.isEmpty()) {
            try {

                String sql = "UPDATE funcionarios SET horasTrabalhadas = " + horas + " WHERE cpfFuncionario = " + cpf + ";";

                var inseriu = BancoMysql.Atualizar(sql);

                if (inseriu) {
                    JOptionPane.showMessageDialog(this, "Horas do funcionário adicionadas com sucesso!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao adicionar horas do funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        try {
            PreencheTabelaHorasFuncionario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaRegistroHora.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtHorasTrabalhadas.setText("");
        txtCPF.setText("");
    }//GEN-LAST:event_btnRegistrarHorasMouseClicked

    /**
     * Método de evento para o botão Editar Horas do Funcionário. Este método é chamado
     * quando o botão é clicado e edita as horas dos funcionários selecionados na tabela.
     *
     * @param evt evento de clique do mouse
     */
    private void btnEditarFuncionárioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarFuncionárioMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelaRegistroHora.getModel();
        int qtd = 0;
        for (int row : editedRows) {
            int id = (int) model.getValueAt(row, 0);
            int horasTrabalhadas = (int) model.getValueAt(row, 3);

            try {
                String sql = "UPDATE funcionarios SET horasTrabalhadas = '" + horasTrabalhadas + "' WHERE idFuncionarios = " + id + "";
                var atualizou = BancoMysql.Atualizar(sql);
                if (atualizou) {
                    qtd++;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao atualizar as horas do funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        editedRows.clear();
        JOptionPane.showMessageDialog(this, qtd + " funcionários(s) atualizado(s) com sucesso!");
        btnEditarFuncionário.setEnabled(false);
    }//GEN-LAST:event_btnEditarFuncionárioMouseClicked

    /**
     * Método de evento para o botão Deletar Horas do Funcionário. Este método é chamado
     * quando o botão é clicado e deleta as horas dos funcionários selecionados na tabela.
     *
     * @param evt evento de clique do mouse
     */
    private void btnDeletarHorasFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarHorasFuncionarioMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelaRegistroHora.getModel();
        int selectedRow = tabelaRegistroHora.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um funcionário para deletar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = (int) tabelaRegistroHora.getValueAt(selectedRow, 0);

        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja deletar as horas deste funcionário?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "UPDATE funcionarios SET horasTrabalhadas = null WHERE idFuncionarios = " + id + "";
                var deletou = BancoMysql.Atualizar(sql);

                if (deletou) {
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "Horas do funcionário deletadas com sucesso!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao deletar horas do funcionário.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeletarHorasFuncionarioMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            // TODO add your handling code here:
            PreencheTabelaHorasFuncionario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaRegistroHora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    /**
     * Método para carregar os dados da tabela de horas dos funcionários. Este método
     * recupera os dados do banco de dados e preenche a tabela com esses dados.
     *
     * @throws java.sql.SQLException
     */
    public void PreencheTabelaHorasFuncionario() throws SQLException {
        var retorno = BancoMysql.ExecutarConsulta("select * from funcionarios where horasTrabalhadas > 0");
        DefaultTableModel model = (DefaultTableModel) tabelaRegistroHora.getModel();
        model.setNumRows(0);
        while (retorno.next()) {
            model.addRow(new Object[]{
                retorno.getInt("idfuncionarios"),
                retorno.getString("nomeFuncionario"),
                Classes.Funcoes.formatCPF(retorno.getString("cpfFuncionario")),
                retorno.getInt("horasTrabalhadas")
            });
        }
        BancoMysql.FecharConexao();
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    editedRows.add(row);
                    btnEditarFuncionário.setEnabled(true);
                }
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarHorasFuncionario;
    private javax.swing.JButton btnEditarFuncionário;
    private javax.swing.JButton btnRegistrarHoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRegistroHora;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtHorasTrabalhadas;
    // End of variables declaration//GEN-END:variables
}
