/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

/**
 *Classe que representa todas as pessoa fisicas do software
 * @version 1.0 31/07/13
 * @author gustavo_cm
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String rg;

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getDataNascimento() {
        return dataNascimento;
    }

    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    public String getRg() {
        return rg;
    }

    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
}
