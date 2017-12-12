package Controller;

import DAO.CandidatoDAO;
import DAO.EMF;
import DAO.VotoDAO;
import Model.Candidato;
import Model.Voto;
import java.util.List;

public class VotoController {
    private static VotoDAO votoDAO;
    private static CandidatoDAO candidatoDAO;
    
    public static void createVoto(Candidato candidato) throws Exception{
        votoDAO = null;
        votoDAO = new VotoDAO(EMF.getEMF());
        Voto voto = new Voto(String.valueOf(candidato.getNumero()));
        votoDAO.create(voto);
    }
    
    public Candidato existeCandidato(int numero) throws Exception{
        candidatoDAO = new CandidatoDAO(EMF.getEMF());
        List lista = candidatoDAO.findCandidatoEntities();
        for(Object c : lista){
            if(((Candidato)c).getNumero() == numero) {
                return (Candidato)c;
            }
        }
        return null;
    }
}
