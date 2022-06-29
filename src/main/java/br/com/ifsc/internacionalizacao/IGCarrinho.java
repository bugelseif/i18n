package br.com.ifsc.internacionalizacao;

import java.util.ArrayList;

public class IGCarrinho extends javax.swing.JFrame {
    ArrayList<Produto> produtosCadastrados;
    ArrayList<Produto> carrinho;
    String itens = "";
    String nome;
    String cpf;
    double sum = 0;
    
    public IGCarrinho(String nomeClient, String cpfCliente, Supermercado produtosCadastrados) {
        initComponents();
        this.carrinho = new ArrayList();
        this.nome = nomeClient;
        this.cpf = cpfCliente;
        clienteNome.setText(nomeClient);
        this.produtosCadastrados = produtosCadastrados.getProdutosCadastrados();
        
        addCombo(this.produtosCadastrados);
        System.out.println(this.produtosCadastrados);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clienteNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        carrinhoCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        carrinhoNome = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        carrinhoDescricao = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carrinhoPreco = new javax.swing.JLabel();
        addCarrinho = new javax.swing.JButton();
        notaFiscal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        carrinhoTotal = new javax.swing.JLabel();
        itensCarrinho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clienteNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clienteNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clienteNome.setText("  ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Boas vindas ao carrinho de compras");

        carrinhoCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carrinhoCombo.setMaximumRowCount(100);
        carrinhoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                carrinhoComboItemStateChanged(evt);
            }
        });

        jLabel5.setText("Nome:");

        carrinhoNome.setText(" ");

        jLabel6.setText("Descrição:");

        carrinhoDescricao.setText(" ");

        jLabel7.setText("Preço:");

        carrinhoPreco.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carrinhoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carrinhoPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carrinhoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carrinhoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(carrinhoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(carrinhoNome))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(carrinhoDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(carrinhoPreco))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        addCarrinho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addCarrinho.setText("Adicionar");
        addCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCarrinhoMouseClicked(evt);
            }
        });

        notaFiscal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notaFiscal.setText("Nota Fiscal");
        notaFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notaFiscalMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total: R$");

        carrinhoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carrinhoTotal.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itensCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(addCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notaFiscal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carrinhoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(clienteNome)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCarrinho)
                    .addComponent(notaFiscal)
                    .addComponent(jLabel8)
                    .addComponent(carrinhoTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itensCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCarrinhoMouseClicked
        addCarrinho(String.valueOf(carrinhoCombo.getSelectedItem()));
    }//GEN-LAST:event_addCarrinhoMouseClicked

    private void notaFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notaFiscalMouseClicked
        System.out.println(String.format("----------------------------\n"
                + "Nota fiscal \nNome: %s \nCPF: %s \nItens:", this.nome,
                this.cpf));
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println(String.format("Produto: %s \n"
                    + "Descrição: %s \nPreço: %.2f \n\n", carrinho.get(i).getNome(),
                    carrinho.get(i).getDescricao(),carrinho.get(i).getPreco()));
        }
        System.out.println(String.format("----------------------------\n"
                + "Total a pagar: %.2f", this.sum));
    }//GEN-LAST:event_notaFiscalMouseClicked

    private void carrinhoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_carrinhoComboItemStateChanged
        vizualizaProduto(String.valueOf(carrinhoCombo.getSelectedItem()));
       }//GEN-LAST:event_carrinhoComboItemStateChanged
    
    public void addCombo(ArrayList<Produto> produtosCadastrados){
        for (int i = 0; i < produtosCadastrados.size(); i++) {
            carrinhoCombo.addItem(produtosCadastrados.get(i).getNome());
        }
    }
    
    public void addCarrinho(String item){
        for (int i = 0; i < produtosCadastrados.size(); i++) {
            if(produtosCadastrados.get(i).getNome().equals(item)){
                carrinho.add(produtosCadastrados.get(i));
                itens += " "+item;
                itensCarrinho.setText(itens);
                sum += produtosCadastrados.get(i).getPreco();
                carrinhoTotal.setText(String.valueOf(sum));
                break;
            }
        }
        
    }
    
    public void vizualizaProduto(String produto){
        for (int i = 0; i < produtosCadastrados.size(); i++) {
          if(produtosCadastrados.get(i).getNome().equals(produto)){
            carrinhoNome.setText(produtosCadastrados.get(i).getNome());
            carrinhoDescricao.setText(produtosCadastrados.get(i).getDescricao());
            carrinhoPreco.setText(String.valueOf(produtosCadastrados.get(i).getPreco()));
          } 
        }
        
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarrinho;
    private javax.swing.JComboBox<String> carrinhoCombo;
    private javax.swing.JLabel carrinhoDescricao;
    private javax.swing.JLabel carrinhoNome;
    private javax.swing.JLabel carrinhoPreco;
    private javax.swing.JLabel carrinhoTotal;
    private javax.swing.JLabel clienteNome;
    private javax.swing.JLabel itensCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton notaFiscal;
    // End of variables declaration//GEN-END:variables
}