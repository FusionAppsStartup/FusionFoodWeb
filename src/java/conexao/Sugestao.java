/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

/**
 *
 * @author Samsung
 */
public class Sugestao {
    
    private Long codigoSugestao;
    private String nomeCliente;
    private String emailCliente;
    private String telefoneCliente;
    private String descricaoPratoSugerido;

    public Sugestao(String nomeCliente, String emailCliente, String telefoneCliente, String descricaoPratoSugerido) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
        this.descricaoPratoSugerido = descricaoPratoSugerido;
    }

    public Long getCodigoSugestao() {
        return codigoSugestao;
    }

    public void setCodigoSugestao(Long codigoSugestao) {
        this.codigoSugestao = codigoSugestao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getDescricaoPratoSugerido() {
        return descricaoPratoSugerido;
    }

    public void setDescricaoPratoSugerido(String descricaoPratoSugerido) {
        this.descricaoPratoSugerido = descricaoPratoSugerido;
    }
    
}
