package br.com.ifsc.internacionalizacao;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IGCadastroProduto extends javax.swing.JFrame {
    Supermercado produtosCadastrados;
    int codigo = 0;
    String nomeSelect;
    String descricaoSelect;
    String precoSelect;
    
    
    public IGCadastroProduto(String nomeAdm) {
        initComponents();
        admNome.setText(nomeAdm);
        Supermercado novo = new Supermercado();
        this.produtosCadastrados = novo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        admNome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        descricaoProduto = new javax.swing.JTextField();
        precoProduto = new javax.swing.JTextField();
        cadastroProduto = new javax.swing.JButton();
        optionProdutos = new javax.swing.JComboBox<>();
        removeProduto = new javax.swing.JButton();
        editaProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mostraNome = new javax.swing.JLabel();
        mostraDescricao = new javax.swing.JLabel();
        mostraPreco = new javax.swing.JLabel();
        trocaUsuario = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Boas vindas ao cadastro de produtos");

        admNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        admNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admNome.setText("  ");

        jLabel2.setText("Nome:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Preço:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(nomeProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(precoProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(17, 17, 17)
                        .addComponent(descricaoProduto)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        cadastroProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroProduto.setText("Cadastrar");
        cadastroProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroProdutoMouseClicked(evt);
            }
        });

        optionProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optionProdutos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optionProdutosItemStateChanged(evt);
            }
        });

        removeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removeProduto.setText("Remover");
        removeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeProdutoMouseClicked(evt);
            }
        });

        editaProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editaProduto.setText("Editar");
        editaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editaProdutoMouseClicked(evt);
            }
        });

        jLabel5.setText("Nome:");

        jLabel6.setText("Descrição:");

        jLabel7.setText("Preço:");

        mostraNome.setText(" ");

        mostraDescricao.setText(" ");

        mostraPreco.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostraPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostraDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostraNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mostraNome))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mostraDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mostraPreco))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        trocaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trocaUsuario.setText("Trocar Usuario");
        trocaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trocaUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastroProduto)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(optionProdutos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(removeProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(trocaUsuario))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(admNome)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroProduto)
                .addGap(18, 18, 18)
                .addComponent(optionProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeProduto)
                    .addComponent(editaProduto)
                    .addComponent(trocaUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroProdutoMouseClicked
        if(verificaExite(nomeProduto.getText())){
            cadastroProduto(nomeProduto.getText(), descricaoProduto.getText(), 
                precoProduto.getText());
        optionProdutos.addItem(nomeProduto.getText());
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", null,
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Produto existente",
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_cadastroProdutoMouseClicked

    private void removeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeProdutoMouseClicked
        Produto encontrado = this.produtosCadastrados.buscaProduto(
                String.valueOf(optionProdutos.getSelectedItem()));
        this.produtosCadastrados.removeProduto(encontrado.getCodigo());
        optionProdutos.removeItem(encontrado.getNome());
    }//GEN-LAST:event_removeProdutoMouseClicked

    private void editaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editaProdutoMouseClicked
//        editaProduto(String.valueOf(optionProdutos.getSelectedItem()));
        Produto encontrado = this.produtosCadastrados.buscaProduto(
        String.valueOf(optionProdutos.getSelectedItem()));
        
        Produto editar = this.produtosCadastrados.editarProduto(encontrado.getCodigo(),
                encontrado.getNome(), encontrado.getDescricao(),
                encontrado.getPreco());
        editarProduto(editar);
    }//GEN-LAST:event_editaProdutoMouseClicked

    private void trocaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trocaUsuarioMouseClicked
        this.setVisible(false);
        IGUsuario novo = new IGUsuario(this.produtosCadastrados);
//        IGUsuario cadastro = new IGUsuario();
        novo.setLocationRelativeTo(null);
        novo.setVisible(true);
    }//GEN-LAST:event_trocaUsuarioMouseClicked

    private void optionProdutosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optionProdutosItemStateChanged
        Produto encontrado = this.produtosCadastrados.buscaProduto(
                String.valueOf(optionProdutos.getSelectedItem()));
        vizualizaProduto(encontrado);
    }//GEN-LAST:event_optionProdutosItemStateChanged
    
    public void cadastroProduto(String nome, String descricao, String preco){
        this.codigo++;
        Produto unidade = new Produto(this.codigo, nome, descricao, 
                Double.parseDouble(preco));
        this.produtosCadastrados.addProduto(unidade);
    }
    
    public void vizualizaProduto(Produto encontrado){
          mostraNome.setText(encontrado.getNome());
          mostraDescricao.setText(encontrado.getDescricao());
          mostraPreco.setText(String.valueOf(encontrado.getPreco()));
    }
    
    public void editarProduto(Produto editar){
        IGEdita editaProduto = new IGEdita(
            editar.getCodigo(),
            editar.getNome(),
            editar.getDescricao(),
            editar.getPreco(),
            produtosCadastrados
        );
        editaProduto.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        editaProduto.setLocationRelativeTo(null);
        editaProduto.setVisible(true);
    }
    
    public boolean verificaExite(String nome){
        Produto encontrado = this.produtosCadastrados.buscaProduto(nome);
        if(encontrado != null){
            return false;
        }
        return true;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admNome;
    private javax.swing.JButton cadastroProduto;
    private javax.swing.JTextField descricaoProduto;
    private javax.swing.JButton editaProduto;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostraDescricao;
    private javax.swing.JLabel mostraNome;
    private javax.swing.JLabel mostraPreco;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JComboBox<String> optionProdutos;
    private javax.swing.JTextField precoProduto;
    private javax.swing.JButton removeProduto;
    private javax.swing.JButton trocaUsuario;
    // End of variables declaration//GEN-END:variables
}
