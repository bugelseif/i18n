package br.com.ifsc.internacionalizacao;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> listaDeProdutos;
    private double total = 0;
    
    public Carrinho(ArrayList<Produto> listaDeProdutos){
        this.listaDeProdutos = listaDeProdutos;
    }
    
    public void addProduto(Produto add){
        this.listaDeProdutos.add(add);
    }
    
    public void removeProduto(int codigo){
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println(listaDeProdutos.get(i));
        }
    }
    
    public double totalPagar(double sum){
        this.total += sum;
        return this.total;
    }
            
}
