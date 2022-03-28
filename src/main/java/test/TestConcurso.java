package test;

import datos.*;
import domain.*;
import java.sql.SQLException;
import java.util.*;

public class TestConcurso {

    public static void main(String[] args) throws SQLException {
        CategoriaPreguntaDAO preguntaDao = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = preguntaDao.seleccionar();
        RespuestasDAO respuestaDao = new RespuestasDAO();
        List<Respuestas> respuestas = respuestaDao.seleccionar();
        int numero1 = (int) (Math.random() * 5);
        int numero2 = (int) (Math.random() * 5 + 5);
        int numero3 = (int) (Math.random() * 5 + 10);
        int numero4 = (int) (Math.random() * 5 + 15);
        int numero5 = (int) (Math.random() * 5 + 20);
        int i = 0;
        System.out.println("Bienvenido al concurso, para cada pregunta deberas escoger la respuesta correcta entre 4 opciones");
        System.out.println("pregunta 1 : " + preguntas.get(numero1));
        switch (numero1) {
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
        PickAnswer respuestaA = new PickAnswer();

        Scanner sc = new Scanner(System.in);

        respuestaA.setAns(sc.nextLine());

        List<RespuestasA> respuestasB = respuestaA.seleccionarA(respuestaA.getAns());
        System.out.println(respuestasB.get(0));

    }

}
