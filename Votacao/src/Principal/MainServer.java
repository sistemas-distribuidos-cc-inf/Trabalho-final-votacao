package Principal;

import Server.Server;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainServer {
    public static void main(String[] args){
        Registry r;
        try {
            r = LocateRegistry.createRegistry(1099);
            r.rebind("Votacao", new Server());
        } catch (RemoteException ex) {
            Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
