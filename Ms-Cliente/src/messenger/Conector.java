
package messenger;
import conexiones.DaoNodo;
import conexiones.DaoNodo_Service;
import java.net.*;
import java.io.*;
public class Conector extends Thread{
    private Socket s;
    private ServerSocket ss;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int puerto = 8180;
    String tokenizer="";
    
    public Conector(String ip)
    {
        try{
            this.s = new Socket(ip,this.puerto);
            
            this.entradaSocket = new InputStreamReader(s.getInputStream());
            this.entrada = new BufferedReader(entradaSocket);
            
            this.salida= new DataOutputStream(s.getOutputStream());
            this.salida.writeUTF("Conectado- \n");
            
        }catch (Exception e){};
    }
    
    public void run()
    {
        String texto;
        while(true)
        {try{
            texto = entrada.readLine();
            VCliente.jTextArea1.setText(VCliente.jTextArea1.getText()+"\n"+ texto);
            
                        String a = null,b = null,c = null,d = null;
String[] result = texto.split("-");
a=result[0];
a=a.substring(2);
b=result[1];
c=result[2];
d=result[3];
int ID=Integer.parseInt(a);
    
    String Nicko=b;
    String Nickd=c;
    int Cantidad=Integer.parseInt(d);
                    System.out.println(ID+"-"+Nicko+"-"+Nickd+"-"+Cantidad);
    DaoNodo_Service servicio = new DaoNodo_Service();
    DaoNodo port= servicio.getDaoNodoPort();
                  port.registrarNodo(ID, Cantidad, Nicko, Nickd);
        }catch(IOException e){};
        }
    }
   
    public void enviarMSG(String msg)
    {
        System.out.println("enviado");
        try{
            this.salida = new DataOutputStream(s.getOutputStream());
            this.salida.writeUTF(msg+"\n");
        }catch (IOException e){
            System.out.println("Problema al enviar");
        };
    }
    public String leerMSG()
    {
        try{
            return entrada.readLine();
        }catch(IOException e){};
        return null;
    }
    
}
