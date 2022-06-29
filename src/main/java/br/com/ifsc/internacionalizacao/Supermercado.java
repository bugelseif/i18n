package br.com.ifsc.internacionalizacao;
import java.util.ArrayList;

public class Supermercado {
    private ArrayList<Produto> produtosCadastrados;
    int size;
    
    public Supermercado(){
        this.produtosCadastrados = new ArrayList();
    }

    public ArrayList<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public void setProdutosCadastrados(ArrayList<Produto> produtosCadastrados) {
        this.produtosCadastrados = produtosCadastrados;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void addProduto(Produto unidade){
        this.produtosCadastrados.add(unidade);
    }
    
    public void removeProduto(int codigo){
        this.size = this.produtosCadastrados.size();
        if(size != 0){
            for (int i = 0; i < this.size; i++) {
                if(this.produtosCadastrados.get(i).getCodigo() == codigo){
                    this.produtosCadastrados.remove(i);
                    break;
                }
            }    
        }
    }
    
    public Produto editarProduto(int codigo, String nome, String descricao, double preco){
        this.size = this.produtosCadastrados.size();
        for (int i = 0; i < this.size; i++) {            
            if(this.produtosCadastrados.get(i).getNome().equals(nome)){
                return this.produtosCadastrados.get(i);
            }
        }
        return null;
    }
    
    public Produto buscaProduto(String nomeProduto){
        this.size = this.produtosCadastrados.size();
        for (int i = 0; i < this.size; i++) {
            if(this.produtosCadastrados.get(i).getNome().equalsIgnoreCase(nomeProduto)){
                return this.produtosCadastrados.get(i);
            }
        }
        return null;
    }
    
}
