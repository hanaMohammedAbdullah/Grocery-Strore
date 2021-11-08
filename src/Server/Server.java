package Server;

import Controller.viewController;
import Model.packet;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server  implements Serializable{
    public static void main(String[] args) throws Exception {

        Socket socket=null;
        ObjectOutputStream out=null;
        ObjectInputStream in= null;
        ServerSocket serverSocket =new ServerSocket(5678);
            socket=serverSocket.accept();
        System.out.println("a client connected");
            out=new ObjectOutputStream(socket.getOutputStream() );
            out.flush();
            in=new ObjectInputStream(socket.getInputStream());
        boolean running = true;
        while (running) {
            packet massage =(packet) in.readObject();

            System.out.println(massage);
            if(massage.equals("start")){
                viewController.ViewController();

                System.err.println("hello manager");
            }else{
                packet message=new packet("sorry this is not valid request");
                out.writeObject(message);
                out.flush();
            }
        }
         in.close();
         out.close();
         socket.close();
         serverSocket.close();
    }

}
