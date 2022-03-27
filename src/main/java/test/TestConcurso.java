package test;

import datos.CategoriaPreguntaDAO;
import domain.CategoriaPregunta;
import java.sql.SQLException;
import java.util.List;

public class TestConcurso {
    public static void main(String[] args) throws SQLException {
        CategoriaPreguntaDAO preguntaDao = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = preguntaDao.seleccionar();
        for(CategoriaPregunta pregunta: preguntas){
            System.out.println("pregunta = " + pregunta);
        }
        
    }
}
