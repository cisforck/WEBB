/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Conexiones.Usuarios;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface DaoCliente {
   
    public void registrar(Usuarios usu);
    public void modificar(Usuarios usu);
    public void eliminar(Usuarios usu);
    public List<Usuarios> listar();
}
