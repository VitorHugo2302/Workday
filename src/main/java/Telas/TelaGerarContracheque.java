/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author Vitor Hugo
 */
public class TelaGerarContracheque extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaGerarContracheque
     */
    public TelaGerarContracheque() {
        initComponents();
        panelTela.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTela = new javax.swing.JPanel();
        lblValorLiquido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSalarioBase = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHorasTrabalhadas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSalarioFuncionario = new javax.swing.JTable();

        setTitle("Contracheque");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
            }
        });

        lblValorLiquido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValorLiquido.setText("Valor Líquido: 2.654,00");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("WORKDAY INFORMÁTICA EIRELI");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Recebi o valor líquido descrito neste recibo em: __________");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("11.235.653-0002-02");

        lblSalarioBase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSalarioBase.setText("Salário Base:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Rua Pelotas, 234 - Bairro Santa Helena - Contagem");

        lblHorasTrabalhadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHorasTrabalhadas.setText("Horas trabalhadas:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Demonstrativo de Pagamento");

        lblFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFuncionario.setText("Funcionário - VITOR HUGO SOARES MARTINS");

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCPF.setText("CPF: 143.025.626-50");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargo.setText("Cargo: PROGRAMADOR");

        lblPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPeriodo.setText("Período: 01-2024");

        tabelaSalarioFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Referência", "Vencimentos", "Descontos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaSalarioFuncionario.setColumnSelectionAllowed(true);
        tabelaSalarioFuncionario.setPreferredSize(new java.awt.Dimension(321, 130));
        jScrollPane1.setViewportView(tabelaSalarioFuncionario);

        javax.swing.GroupLayout panelTelaLayout = new javax.swing.GroupLayout(panelTela);
        panelTela.setLayout(panelTelaLayout);
        panelTelaLayout.setHorizontalGroup(
            panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(290, 290, 290))
            .addGroup(panelTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelTelaLayout.createSequentialGroup()
                .addGroup(panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTelaLayout.createSequentialGroup()
                                .addComponent(lblFuncionario)
                                .addGap(18, 18, 18)
                                .addComponent(lblCPF)
                                .addGap(18, 18, 18)
                                .addComponent(lblCargo)
                                .addGap(18, 18, 18)
                                .addComponent(lblPeriodo))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(panelTelaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(lblValorLiquido)
                            .addComponent(lblSalarioBase)
                            .addComponent(lblHorasTrabalhadas))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        panelTelaLayout.setVerticalGroup(
            panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncionario)
                    .addComponent(lblCPF)
                    .addComponent(lblCargo)
                    .addComponent(lblPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValorLiquido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(lblSalarioBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorasTrabalhadas)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        TelaSelecionarFuncionario selecionar = new TelaSelecionarFuncionario();
        selecionar.setVisible(true);
    }//GEN-LAST:event_formInternalFrameActivated

    public void CarregarTela(int idFuncionario)
    {
        this.panelTela.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblHorasTrabalhadas;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblValorLiquido;
    private javax.swing.JPanel panelTela;
    private javax.swing.JTable tabelaSalarioFuncionario;
    // End of variables declaration//GEN-END:variables
}