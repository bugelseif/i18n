package br.com.ifsc.internacionalizacao;

public class Usuario {
    private String nome;
    private String cpf;
    private boolean isAdm;

    public Usuario(String nome, String cpf, boolean isAdm){
        this.nome = nome;
        this.cpf = cpf;
        this.isAdm = isAdm;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isIsAdm() {
        return isAdm;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIsAdm(boolean isAdm) {
        this.isAdm = isAdm;
    }
    
}
