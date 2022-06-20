package br.com.ifsc.internacionalizacao;

import java.util.ResourceBundle;

public class Resultado extends javax.swing.JFrame {

    public ResourceBundle traducao;
    public String pesquisa;
    public String resultado;


    public Resultado(ResourceBundle traducoes, String pesquisa) {
        initComponents();
        this.traducao = traducoes;
        this.pesquisa = pesquisa;
        this.resultado = traducao.getString("resultado_pesquisa");
        
        
        this.lb_titulo.setText(traducao.getString("resultado_titulo"));
        this.lab_resultado.setText(resultado + pesquisa);
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lab_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Resultado da Pesquisa");

        lab_resultado.setText("resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lab_resultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lb_titulo)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_titulo)
                .addGap(49, 49, 49)
                .addComponent(lab_resultado)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lab_resultado;
    private javax.swing.JLabel lb_titulo;
    // End of variables declaration//GEN-END:variables
}
