package br.com.ifsc.internacionalizacao;

public class Produto {
   private int codigo;
   private String nome;
   private String descricao;
   private double preco;
   
   public Produto(int codigo, String nome, String descricao, double preco){
       this.codigo = codigo;
       this.nome = nome;
       this.descricao = descricao;
       this.preco = preco;
   }
   
   public void mostrarInformacoes(){
       System.out.println(String.format("Codigo: %d \nDescrição: %s "
               + "\nPreço: %.2f", this.codigo, this.descricao, this.preco));
   }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
       
    
}
