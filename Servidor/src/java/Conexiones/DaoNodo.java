/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import Dao.DaoClientImpl;
import Interface.DaoCliente;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Erick
 */
@WebService(serviceName = "DaoNodo")
public class DaoNodo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarNodo")
    public String RegistrarNodo(int ID,int Cantidad,String Nicko, String Nickd) {
        Usuarios usu = new Usuarios();


        usu.setID(ID);
        usu.setCantidad(Cantidad);
        usu.setEstado("Activo");
        usu.setNicko(Nicko);
        usu.setNickd(Nickd);
        usu.setFecha("29//201710");
        DaoCliente dao = new DaoClientImpl();
        dao.registrar(usu);
        return null;
    }
}
