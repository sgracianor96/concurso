package test;

import datos.CategoriaPreguntaDAO;
import datos.RespuestasDAO;
import domain.*;
import java.sql.SQLException;
import java.util.List;

public class TestConcurso {

    public static void main(String[] args) throws SQLException {
        CategoriaPreguntaDAO preguntaDao = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = preguntaDao.seleccionar();
//        for (CategoriaPregunta pregunta : preguntas) {
//            System.out.println("pregunta = " + pregunta);
//        }
//        RespuestasDAO respuestaDao = new RespuestasDAO();
//        List<Respuestas> respuestas = respuestaDao.seleccionar();
//        for (Respuestas respuesta : respuestas) {
//            System.out.println("respuesta = " + respuesta);
//        }
        
    }
}
