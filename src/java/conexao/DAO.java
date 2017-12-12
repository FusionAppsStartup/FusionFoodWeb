/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AndrheiHenrique
 */
public class DAO {
    
    //Configurações de acesso ao banco de dados.
    private String ClassConn = "com.mysql.jdbc.Driver";
    private String BdConn ="fusionfood";
    private String HostConn = "localhost";//host/servidor/maquina
    private String PortaConn = "3306";
    private String UserConn = "root";
    private String PassConn = "andrhei";
    
    
    private static DAO instance;
    
    public static DAO getInstance(){
        if(instance == null){
            instance = new DAO();
        }
        return instance;
    }
    
    public Statement acessaBd() throws ClassNotFoundException, SQLException{
            
            Class.forName(ClassConn);
            Connection conn =  DriverManager.getConnection("jdbc:mysql://"+HostConn+":"+PortaConn+"/"+BdConn+"?zeroDateTimeBehavior=convertToNull", UserConn, PassConn);
            Statement st = conn.createStatement();

        return st;
    }
            
    
}