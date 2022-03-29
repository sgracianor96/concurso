package test;

import datos.*;
import java.sql.SQLException;

public class TestConcurso {     // Clase para iniciar el juego

    public static void main(String[] args) throws SQLException {
        MonologoA jugador1 = new MonologoA(); //creacion del objeto jugador1 en la clase MonologoA
        jugador1.juego(); // metodo juego, el cual inicializa el juego en su totalidad

    }

}