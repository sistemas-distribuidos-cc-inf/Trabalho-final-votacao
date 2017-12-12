
package RMI;

import Model.Candidato;
import Model.Voto;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Servico extends Remote{
    public void cadastraCandidato(String nome, int numero) throws RemoteException;
    public void cadastraVoto(Candidato candidato) throws RemoteException;
}
