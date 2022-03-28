package test;

import datos.*;
import domain.*;
import java.sql.SQLException;
import java.util.*;

public class TestConcurso {

    public static void main(String[] args) throws SQLException {
        CategoriaA pregunta1 = new CategoriaA();
        System.out.println("Bienvenido al concurso");
        pregunta1.pregunta1();
        pregunta1.opciones1();
        
        
        
        PickAnswer respuestaA = new PickAnswer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su respuesta respetando las mayusculas:");
        respuestaA.setAns(sc.nextLine());
        List<RespuestasA> respuestasB = respuestaA.seleccionarA(respuestaA.getAns());
        System.out.println(respuestasB.get(0));
    }

}
