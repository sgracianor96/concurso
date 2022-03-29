package datos;

import domain.CategoriaPregunta;
import domain.Respuestas;
import java.sql.SQLException;
import java.util.List;

public class CategoriaB {   //Clase para poder mostrar la segunda pregunta de forma aleatoria con sus respectivas posibles respuestas
    int numero2 = (int) (Math.random() * 5 + 5);
    int i = 0;
    
    public void pregunta2() throws SQLException {
        CategoriaPreguntaDAO pregunta = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = pregunta.seleccionar();
        System.out.println("pregunta 2 : " + preguntas.get(numero2));
    }

    public void opciones2() throws SQLException {
        RespuestasDAO respuesta2 = new RespuestasDAO();
        List<Respuestas> opcionesRespuestas2 = respuesta2.seleccionar();
        switch (numero2) {
            case 5:
                for(i=20; i<=23; i++){
                    System.out.println(opcionesRespuestas2.get(i));
                }   break;
            case 6:
                for(i=24; i<=27;i++){
                    System.out.println(opcionesRespuestas2.get(i));
                }   break;
            case 7:
                for(i=28; i<=31;i++){
                    System.out.println(opcionesRespuestas2.get(i));
                }   break;
            case 8:
                for(i=32; i<=35;i++){
                    System.out.println(opcionesRespuestas2.get(i));
                }   break;
            case 9:
                for(i=36; i<=39;i++){
                    System.out.println(opcionesRespuestas2.get(i));
                }   break;
            default:
                break;
        }
    }
}