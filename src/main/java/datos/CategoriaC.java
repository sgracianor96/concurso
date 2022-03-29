package datos;

import domain.CategoriaPregunta;
import domain.Respuestas;
import java.sql.SQLException;
import java.util.List;

public class CategoriaC {  //Clase para poder mostrar la tercer pregunta de forma aleatoria con sus respectivas posibles respuestas
    int numero3 = (int) (Math.random() * 5 + 10);
    int i = 0;
    
    public void pregunta3() throws SQLException{
        CategoriaPreguntaDAO pregunta = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = pregunta.seleccionar();
        System.out.println("pregunta 3 : " + preguntas.get(numero3));
    }
    
    public void opciones3() throws SQLException {
        RespuestasDAO respuesta3 = new RespuestasDAO();
        List<Respuestas> opcionesRespuestas3 = respuesta3.seleccionar();
        switch (numero3) {
            case 10:
                for(i=40; i<=43; i++){
                    System.out.println(opcionesRespuestas3.get(i));
                }   break;
            case 11:
                for(i=44; i<=47;i++){
                    System.out.println(opcionesRespuestas3.get(i));
                }   break;
            case 12:
                for(i=48; i<=51;i++){
                    System.out.println(opcionesRespuestas3.get(i));
                }   break;
            case 13:
                for(i=52; i<=55;i++){
                    System.out.println(opcionesRespuestas3.get(i));
                }   break;
            case 14:
                for(i=56; i<=59;i++){
                    System.out.println(opcionesRespuestas3.get(i));
                }   break;
            default:
                break;
        }
    }
}
