package Controller.Server;

import Controller.DataBase;
import Model.Product;
import Model.employee;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;


public class Server  implements Serializable {
    public static void main(String[] args) throws Exception {
        String type = "employee";
        ServerSocket serverSocket = new ServerSocket(5678);
        String path;
        Socket socket = null;
        socket = serverSocket.accept();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in= new ObjectInputStream(socket.getInputStream());
        BufferedReader inBusffer = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter outPrint = new PrintWriter(socket.getOutputStream());
        boolean bool=true;
        while(bool) {
            try {
                System.out.println("a client connected");
                out.flush();
//                    path="src\\Controller\\Files\\Employee.txt";
//                    in=new ObjectInputStream(socket.getInputStream());
//                    List<employee> employees =(List<employee>) in.readObject();
//                    DataBase.SaveDataToFile(path, employees);
                path = "src\\Controller\\Files\\Product.txt";
                List<Product> Products = (List<Product>) in.readObject();
                DataBase.SaveDataToFile(path, Products);
                System.err.println("Data has been saved in server");

            } catch (SocketException socketException) {
                System.out.printf("the connection lost");
            }catch (NullPointerException nullPointerException){
                bool=false;
            }
        }
        in.close();
        out.close();
        socket.close();
        serverSocket.close();

    }
}

