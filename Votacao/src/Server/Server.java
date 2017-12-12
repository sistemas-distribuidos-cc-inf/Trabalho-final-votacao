package Server;

import Controller.CandidatoController;
import Controller.VotoController;
import Model.Candidato;
import Model.Voto;
import RMI.Servico;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server extends UnicastRemoteObject implements Servico{
    
    public Server() throws RemoteException {
        super();
    }

    @Override
    public void cadastraCandidato(String nome, int numero) throws RemoteException {
        CandidatoController cc = new CandidatoController();
        try {
            cc.createCandidato(nome, numero);
        } catch (Exception ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cadastraVoto(Candidato candidato) throws RemoteException {
        VotoController vc = new VotoController();
        try {
            vc.createVoto(candidato);
        } catch (Exception ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
