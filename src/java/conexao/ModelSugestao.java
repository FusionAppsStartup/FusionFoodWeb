/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Samsung
 */
public class ModelSugestao {
    
     private ArrayList<Sugestao> listaBebida = new ArrayList();
    
    private static ModelSugestao instance;
    
    public static ModelSugestao getInstance(){
        if(instance == null){
            instance = new ModelSugestao();
        }
        return instance;
    }
    
    public void inserirSugestao(Sugestao s) throws ClassNotFoundException {
    try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeUpdate("INSERT INTO sugestaoprato(nomeCliente, emailCliente , telefoneCliente, descricaoPratoSugerido) VALUES('"
                                +s.getNomeCliente()+"','"
                                +s.getEmailCliente()+"','"
                                +s.getTelefoneCliente()+"','"
                                +s.getDescricaoPratoSugerido()+"');");
            listaBebida.add(s);
            
        }catch(SQLException ex) {
            System.err.println(ex);
            ex.getStackTrace();
        }
    }
    
}
