package br.com.ifsc.internacionalizacao;

import java.util.ResourceBundle;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IGUsuario extends javax.swing.JFrame {
    boolean adm;
    public ResourceBundle traducao;

    Supermercado produtosCadastrados;
    
    public IGUsuario(ResourceBundle traducoes) {
        initComponents();
        this.traducao = traducoes;
        this.lbBoasVindas.setText(traducao.getString("boas_vindas"));
        this.lbCadastro.setText(traducao.getString("cadastre_se"));
        this.lbNome.setText(traducao.getString("nome"));
        this.admSim.setText(traducao.getString("sim"));
        this.admNao.setText(traducao.getString("nao"));
        this.cadastrarUsuario.setText(traducao.getString("bt_cadastrar"));

    }

    public IGUsuario(Supermercado produtosCadastrados){
        initComponents();
        this.produtosCadastrados = produtosCadastrados;
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admOption = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbAdm = new javax.swing.JLabel();
        nomeCadastro = new javax.swing.JTextField();
        cpfCadastro = new javax.swing.JTextField();
        admSim = new javax.swing.JRadioButton();
        admNao = new javax.swing.JRadioButton();
        lbBoasVindas = new javax.swing.JLabel();
        lbCadastro = new javax.swing.JLabel();
        cadastrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNome.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CPF:");

        lbAdm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAdm.setText("Adm:");

        admOption.add(admSim);
        admSim.setText("Sim");
        admSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admSimMouseClicked(evt);
            }
        });

        admOption.add(admNao);
        admNao.setText("Não");
        admNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admNaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAdm)
                        .addGap(18, 18, 18)
                        .addComponent(admSim)
                        .addGap(18, 18, 18)
                        .addComponent(admNao)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(cpfCadastro)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(nomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cpfCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdm)
                    .addComponent(admSim)
                    .addComponent(admNao))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbBoasVindas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbBoasVindas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBoasVindas.setText("Boas Vindas");

        lbCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCadastro.setText("Cadastre-se");

        cadastrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrarUsuario.setText("Entrar");
        cadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBoasVindas)
                            .addComponent(lbCadastro))
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(cadastrarUsuario)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBoasVindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCadastro)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarUsuarioMouseClicked
        if (!verifica(cpfCadastro.getText())){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros para o CPF",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }else if(!admNao.isSelected() && !admSim.isSelected()){
            JOptionPane.showMessageDialog(null, "Marque uma opção",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            Usuario usuario = new Usuario(nomeCadastro.getText(),
                cpfCadastro.getText(), this.adm);
            direciona(usuario); 
        }
    }//GEN-LAST:event_cadastrarUsuarioMouseClicked

    private void admNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admNaoMouseClicked
        this.adm = false;
    }//GEN-LAST:event_admNaoMouseClicked

    private void admSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admSimMouseClicked
        this.adm = true;
    }//GEN-LAST:event_admSimMouseClicked
    
    public void direciona(Usuario usuario){
        if(usuario.isIsAdm()){
            IGCadastroProduto cadastroAdm = new IGCadastroProduto(usuario.getNome());
            cadastroAdm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            cadastroAdm.setLocationRelativeTo(null);
            cadastroAdm.setVisible(true);
            this.setVisible(false);
        }else{
            IGCarrinho cadastroCliente = new IGCarrinho(usuario.getNome(), usuario.getCpf(), produtosCadastrados);
            cadastroCliente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            cadastroCliente.setLocationRelativeTo(null);
            cadastroCliente.setVisible(true);
        }
    }
    
    public boolean verifica(String cpf){
        Scanner a = new Scanner(cpf.trim());
        if(!a.hasNextInt(10)) return false;
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admNao;
    private javax.swing.ButtonGroup admOption;
    private javax.swing.JRadioButton admSim;
    private javax.swing.JButton cadastrarUsuario;
    private javax.swing.JTextField cpfCadastro;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAdm;
    private javax.swing.JLabel lbBoasVindas;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTextField nomeCadastro;
    // End of variables declaration//GEN-END:variables
}
