package datos;

import domain.CategoriaPregunta;
import domain.Respuestas;
import java.sql.SQLException;
import java.util.List;

public class CategoriaE {
    int numero5 = (int) (Math.random() * 5 + 20);
    int i = 0;
    
    public void pregunta5() throws SQLException {
        CategoriaPreguntaDAO pregunta = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = pregunta.seleccionar();
        System.out.println("pregunta 5 : " + preguntas.get(numero5));
    }
    
    public void opciones5() throws SQLException {
        RespuestasDAO respuesta5 = new RespuestasDAO();
        List<Respuestas> opcionesRespuestas5 = respuesta5.seleccionar();
        switch (numero5) {
            case 20:
                for(i=80; i<=83; i++){
                    System.out.println(opcionesRespuestas5.get(i));
                }   break;
            case 21:
                for(i=84; i<=87;i++){
                    System.out.println(opcionesRespuestas5.get(i));
                }   break;
            case 22:
                for(i=88; i<=91;i++){
                    System.out.println(opcionesRespuestas5.get(i));
                }   break;
            case 23:
                for(i=92; i<=95;i++){
                    System.out.println(opcionesRespuestas5.get(i));
                }   break;
            case 24:
                for(i=96; i<=99;i++){
                    System.out.println(opcionesRespuestas5.get(i));
                }   break;
            default:
                break;
        }
    }
}
