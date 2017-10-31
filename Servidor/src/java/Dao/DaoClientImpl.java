/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexiones.Usuarios;
import Interface.DaoCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class DaoClientImpl extends Conexioon implements DaoCliente {

    @Override
    public void registrar(Usuarios usu) {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO transacciones VALUES(?,?,?,?,?,?)");
            st.setInt(1, usu.getID());
            st.setString(2, usu.getNicko());
            st.setString(3, usu.getNickd());
            st.setInt(4, usu.getCantidad());
            st.setString(5, usu.getEstado());
            st.setString(6, usu.getFecha());
            st.executeUpdate();
            
        }catch(Exception e){
         
        }finally{
            
        }
        
    }

    @Override
    public void modificar(Usuarios usu) {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE usuarios set Puerto = ? where Ip = ?");
            
            //st.setInt(1, usu.getPuerto());
            //st.setString(2, usu.getIp());
            st.executeUpdate();
            
        }catch(Exception e){
         
        }finally{
            
        }
    }

    @Override
    public void eliminar(Usuarios usu) {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("delete from usuarios where Ip = ?");
          //  st.setString(1, usu.getIp());
            st.executeUpdate();
            
        }catch(Exception e){
         
        }finally{
            
        }
    }

    @Override
    public List<Usuarios> listar() {
        List<Usuarios> lista = null;
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("select * from usuarios");
      
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Usuarios usu = new Usuarios();
               // usu.setIp(rs.getString("Ip"));
               // usu.setPuerto(rs.getInt("Puerto"));
                lista.add(usu);
            }
                   
            
        }catch(Exception e){
         
        }finally{
            
        }
        return lista;
    }
    
}
