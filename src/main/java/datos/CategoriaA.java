package datos;

import domain.CategoriaPregunta;
import domain.Respuestas;
import java.sql.SQLException;
import java.util.*;

public class CategoriaA {

    int numero = (int) (Math.random() * 5);
    int i = 0;

    public void pregunta1() throws SQLException {
        CategoriaPreguntaDAO pregunta = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = pregunta.seleccionar();
        System.out.println("pregunta 1 : " + preguntas.get(numero));
    }

    public void opciones1() throws SQLException {
        RespuestasDAO respuesta1 = new RespuestasDAO();
        List<Respuestas> respuestas = respuesta1.seleccionar();
        switch (numero) {
            case 0:
                for (i = 0; i <= 3; i++) {
                    System.out.println(respuestas.get(i));
                }
                break;
            case 1:
                for (i = 4; i <= 7; i++) {
                    System.out.println(respuestas.get(i));
                }
                break;
            case 2:
                for (i = 8; i <= 11; i++) {
                    System.out.println(respuestas.get(i));
                }
                break;
            case 3:
                for (i = 12; i <= 15; i++) {
                    System.out.println(respuestas.get(i));
                }
                break;
            case 4:
                for (i = 16; i <= 19; i++) {
                    System.out.println(respuestas.get(i));
                }
                break;
            default:
                break;
        }
    }

}
