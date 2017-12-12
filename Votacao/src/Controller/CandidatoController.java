package Controller;

import DAO.CandidatoDAO;
import DAO.EMF;
import Model.Candidato;

public class CandidatoController {
    private static CandidatoDAO candidatoDAO;
    
    public static void createCandidato(String nome, int numero) throws Exception{
        candidatoDAO = new CandidatoDAO(EMF.getEMF());
        Candidato candidato = new Candidato(nome, numero);
        candidatoDAO.create(candidato);
    }
    
    
    
}
