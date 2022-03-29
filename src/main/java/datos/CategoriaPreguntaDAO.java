package datos;

import domain.CategoriaPregunta;
import java.sql.*;
import java.util.*;

public class CategoriaPreguntaDAO {  //Clase con la finalidad de hacer la funcion de SELECT para las preguntas en SQL en nuestra base de datos

    private static final String SQL_SELECT = "SELECT idcategoria_pregunta, categoria, pregunta FROM concurso.categoria_pregunta";

    public List<CategoriaPregunta> seleccionar() throws SQLException  {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CategoriaPregunta pregunta = null;
        List<CategoriaPregunta> preguntas = new ArrayList<>();

        conn = ConexionPreguntas.getConection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        while (rs.next()) {
            int idCategoriaPregunta = rs.getInt("idcategoria_pregunta");
            String categoria = rs.getString("categoria");
            String question = rs.getString("pregunta");
            pregunta = new CategoriaPregunta(idCategoriaPregunta, categoria, question);
            preguntas.add(pregunta);

        }
        return preguntas;
    }
}
