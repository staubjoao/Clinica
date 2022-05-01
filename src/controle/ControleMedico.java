package controle;

import DAO.MedicoDAO;
import entidade.Medico;
import java.sql.SQLException;


public class ControleMedico {
    MedicoDAO daoMedico;

    public ControleMedico() {
        daoMedico = new MedicoDAO();
    }

    public void inserir(String crm, String nome, int especialidade) throws SQLException {
        Medico medi = new Medico(crm, nome, especialidade);
        daoMedico.inserir(medi);
    }
}
