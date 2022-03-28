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
        PickAnswer respuesta1 = new PickAnswer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su respuesta respetando las mayusculas:");
        respuesta1.setAns(sc.nextLine());
        List<RespuestasA> respuestaPregunta1 = respuesta1.seleccionarA(respuesta1.getAns());
        System.out.println(respuestaPregunta1.get(0));
        
        CategoriaB pregunta2 = new CategoriaB();
        pregunta2.pregunta2();
        pregunta2.opciones2();
        PickAnswer respuesta2 = new PickAnswer();
        System.out.println("Ingrese su respuesta respetando las mayusculas:");
        respuesta2.setAns(sc.nextLine());
        List<RespuestasA> respuestaPregunta2 = respuesta2.seleccionarA(respuesta2.getAns());
        System.out.println(respuestaPregunta2.get(0));
        
        CategoriaC pregunta3 = new CategoriaC();
        pregunta3.pregunta3();
        pregunta3.opciones3();
        PickAnswer respuesta3 = new PickAnswer();
        System.out.println("Ingrese su respuesta respetando las mayusculas:");
        respuesta3.setAns(sc.nextLine());
        List<RespuestasA> respuestaPregunta3 = respuesta3.seleccionarA(respuesta3.getAns());
        System.out.println(respuestaPregunta3.get(0));
        
        CategoriaD pregunta4 = new CategoriaD();
        pregunta4.pregunta4();
        pregunta4.opciones4();
        PickAnswer respuesta4 = new PickAnswer();
        System.out.println("Ingrese su respuesta respetando las mayusculas:");
        respuesta4.setAns(sc.nextLine());
        List<RespuestasA> respuestaPregunta4 = respuesta4.seleccionarA(respuesta4.getAns());
        System.out.println(respuestaPregunta4.get(0));
        
        CategoriaE pregunta5 = new CategoriaE();
        pregunta5.pregunta5();
        pregunta5.opciones5();
        PickAnswer respuesta5 = new PickAnswer();
        System.out.println("Ingrese su respuesta respetando las mayusculas:");
        respuesta5.setAns(sc.nextLine());
        List<RespuestasA> respuestaPregunta5 = respuesta5.seleccionarA(respuesta5.getAns());
        System.out.println(respuestaPregunta5.get(0));
    }

}
