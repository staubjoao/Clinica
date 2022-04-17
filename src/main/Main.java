package main;

import DAO.EspecialidadeDAO;
import java.io.*;
import java.sql.*;
import telas.TelaEspecialidade;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        //TelaEspecialidade telaEspeci = new TelaEspecialidade();
        EspecialidadeDAO controleEspeci = new EspecialidadeDAO();
        controleEspeci.listar();
    }

}

/*
CREATE TABLE especialidade(
	id_especialidade INT PRIMARY KEY,
    nome varchar(45)
);
*/
