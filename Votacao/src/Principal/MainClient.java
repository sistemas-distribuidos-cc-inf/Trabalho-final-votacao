package Principal;

import RMI.Servico;
import View.Client;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClient {
    public static void main(String arts[]) throws NotBoundException, MalformedURLException, RemoteException{

        Client client = new Client();
        client.setVisible(true);
        

    }
}
