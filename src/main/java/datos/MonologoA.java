package datos;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MonologoA { //clase que alberga el metodo juego() para inicializar el juego en su totalidad(incluyendo las condiciones de victoria)

    public void juego() throws SQLException {
        CategoriaA pregunta1 = new CategoriaA();
        pregunta1.pregunta1();
        pregunta1.opciones1();
        PickAnswer respuesta1 = new PickAnswer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su respuesta respetando las mayusculas:");
        respuesta1.setAns(sc.nextLine());
        List<RespuestasA> respuestaPregunta1 = respuesta1.seleccionarA(respuesta1.getAns());

        System.out.println(respuestaPregunta1.get(0));
        String cadena1 = respuestaPregunta1.get(0).toString();
        if (cadena1.equals("Verdadero")) {
            CategoriaB pregunta2 = new CategoriaB();
            pregunta2.pregunta2();
            pregunta2.opciones2();
            PickAnswer respuesta2 = new PickAnswer();
            System.out.println("Ingrese su respuesta respetando las mayusculas:");
            respuesta2.setAns(sc.nextLine());
            List<RespuestasA> respuestaPregunta2 = respuesta2.seleccionarA(respuesta2.getAns());
            System.out.println(respuestaPregunta2.get(0));
            System.out.println("Llevas acumulado 500 dolares!");
            String cadena2 = respuestaPregunta2.get(0).toString();
            if (cadena2.equals("Verdadero")) {
                CategoriaC pregunta3 = new CategoriaC();
                pregunta3.pregunta3();
                pregunta3.opciones3();
                PickAnswer respuesta3 = new PickAnswer();
                System.out.println("Ingrese su respuesta respetando las mayusculas:");
                respuesta3.setAns(sc.nextLine());
                List<RespuestasA> respuestaPregunta3 = respuesta3.seleccionarA(respuesta3.getAns());
                System.out.println(respuestaPregunta3.get(0));
                System.out.println("Llevas acumulado 1000 dolares!");
                String cadena3 = respuestaPregunta3.get(0).toString();
                if (cadena3.equals("Verdadero")) {
                    CategoriaD pregunta4 = new CategoriaD();
                    pregunta4.pregunta4();
                    pregunta4.opciones4();
                    PickAnswer respuesta4 = new PickAnswer();
                    System.out.println("Ingrese su respuesta respetando las mayusculas:");
                    respuesta4.setAns(sc.nextLine());
                    List<RespuestasA> respuestaPregunta4 = respuesta4.seleccionarA(respuesta4.getAns());
                    System.out.println(respuestaPregunta4.get(0));
                    System.out.println("Llevas acumulado 1500 dolares!");
                    String cadena4 = respuestaPregunta4.get(0).toString();
                    if (cadena4.equals("Verdadero")) {
                        CategoriaE pregunta5 = new CategoriaE();
                        pregunta5.pregunta5();
                        pregunta5.opciones5();
                        PickAnswer respuesta5 = new PickAnswer();
                        System.out.println("Ingrese su respuesta respetando las mayusculas:");
                        respuesta5.setAns(sc.nextLine());
                        List<RespuestasA> respuestaPregunta5 = respuesta5.seleccionarA(respuesta5.getAns());
                        System.out.println(respuestaPregunta5.get(0));
                        System.out.println("Felicitaciones has ganado y te llevaste 2000 dolares!!");
                    } else {
                        System.out.println("Perdiste y solo te llevas 1500 dolares");
                    }

                } else {
                    System.out.println("Perdiste y solo te llevas 1000 dolares");
                }
            } else {
                System.out.println("Perdiste y solo te llevas 500 dolares");
            }
        } else {
            System.out.println("Perdiste");
        }
    }
}