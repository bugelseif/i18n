package br.com.ifsc.internacionalizacao;

import java.util.ResourceBundle;

public class Google extends javax.swing.JFrame {

    public ResourceBundle traducao;


    public Google(ResourceBundle traducoes) {
        initComponents();
        this.traducao = traducoes;
        
        this.bt_pesquisa.setText(traducao.getString("google_pesquisa"));
        this.bt_sorte.setText(traducao.getString("google_sorte"));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_pesquisa = new javax.swing.JButton();
        bt_sorte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Google");

        bt_pesquisa.setText("Pesquisa");
        bt_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pesquisaMouseClicked(evt);
            }
        });

        bt_sorte.setText("Estou com Sorte");
        bt_sorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sorteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_pesquisa)
                .addGap(18, 18, 18)
                .addComponent(bt_sorte)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_pesquisa)
                    .addComponent(bt_sorte))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sorteActionPerformed
        Resultado r = new Resultado(traducao);
        r.setVisible(true);
    }//GEN-LAST:event_bt_sorteActionPerformed

    private void bt_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pesquisaMouseClicked
        Resultado r = new Resultado(traducao);
        r.setVisible(true);
    }//GEN-LAST:event_bt_pesquisaMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pesquisa;
    private javax.swing.JButton bt_sorte;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
