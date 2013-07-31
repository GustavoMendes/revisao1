/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

/**
 *Classe que representa as pessoas juridicas do sistema
 *@version 1.0
 * 31/07/13
 * @author gustavo_cm
 */
public class PessoaJuridica {
    
   private String cnpj; 
   private String razaoSocial;
   private String nomeFantasia;

    public PessoaJuridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
   
   
}
