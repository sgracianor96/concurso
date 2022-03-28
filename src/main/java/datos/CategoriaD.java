package datos;

import domain.CategoriaPregunta;
import domain.Respuestas;
import java.sql.SQLException;
import java.util.List;

public class CategoriaD {
    int numero4 = (int) (Math.random() * 5 + 15);
    int i = 0;
    
    public void pregunta4() throws SQLException{
        CategoriaPreguntaDAO pregunta = new CategoriaPreguntaDAO();
        List<CategoriaPregunta> preguntas = pregunta.seleccionar();
        System.out.println("pregunta 4 : " + preguntas.get(numero4));
    }
    
    public void opciones4() throws SQLException {
        RespuestasDAO respuesta4 = new RespuestasDAO();
        List<Respuestas> opcionesRespuestas4 = respuesta4.seleccionar();
        switch (numero4) {
            case 15:
                for(i=60; i<=63; i++){
                    System.out.println(opcionesRespuestas4.get(i));
                }   break;
            case 16:
                for(i=64; i<=67;i++){
                    System.out.println(opcionesRespuestas4.get(i));
                }   break;
            case 17:
                for(i=68; i<=71;i++){
                    System.out.println(opcionesRespuestas4.get(i));
                }   break;
            case 18:
                for(i=72; i<=75;i++){
                    System.out.println(opcionesRespuestas4.get(i));
                }   break;
            case 19:
                for(i=76; i<=79;i++){
                    System.out.println(opcionesRespuestas4.get(i));
                }   break;
            default:
                break;
        }
    }
}
