package controle;

import DAO.EspecialidadeDAO;
import entidade.Especialidade;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControleEspecialidade {

    EspecialidadeDAO daoEspecialidade;

    public ControleEspecialidade() {
        daoEspecialidade = new EspecialidadeDAO();
    }

    public void inserir(int id, String especialidade) throws SQLException {
        Especialidade espc = new Especialidade(id, especialidade);
        daoEspecialidade.inserir(espc);
    }
    
     public ArrayList listar(){
         ArrayList<Especialidade> especialidades = new ArrayList<>();
         especialidades = daoEspecialidade.listar();
         return especialidades;
     } 
}
