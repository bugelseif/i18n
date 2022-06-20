package br.com.ifsc.internacionalizacao;

import java.util.ResourceBundle;

public class Dicionario extends javax.swing.JFrame {

    public ResourceBundle traducao;
    public String pesquisa;


    public Dicionario(ResourceBundle traducoes) {
        initComponents();
        this.traducao = traducoes;
        
        this.bt_pesquisa.setText(traducao.getString("google_pesquisa"));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input_pesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_pesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Dicionario");

        bt_pesquisa.setText("Pesquisa");
        bt_pesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pesquisaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(input_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(input_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_pesquisa)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pesquisaMouseClicked
        pesquisa = buscaPalavra(input_pesquisa.getText());
        Resultado r = new Resultado(traducao, pesquisa);
        r.setVisible(true);
    }//GEN-LAST:event_bt_pesquisaMouseClicked
    
    private String buscaPalavra(String pesquisa){
        return pesquisa + " significado";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pesquisa;
    private javax.swing.JTextField input_pesquisa;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
