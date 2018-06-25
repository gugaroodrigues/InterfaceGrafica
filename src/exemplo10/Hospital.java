/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo10;

/**
 *
 * @author Alunos
 */
public class Hospital {
    
    private String nome, cnpj, categoria;
    private double rendaAnual;
    private short ano;
    private boolean privado;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public short getAno() {
        return ano;
    }

    public boolean isPrivado() {
        return privado;
    }
    
    
    
}
