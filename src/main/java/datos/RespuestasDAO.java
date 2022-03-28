package datos;

import domain.Respuestas;
import java.sql.*;
import java.util.*;

public class RespuestasDAO {

    private static final String SQL_SELECT = "SELECT idrespuestas, numero_pregunta, respuestas, booleana FROM concurso.respuestas";
    private static final String SQLSELECTA = "SELECT respuestas, booleana FROM concurso.respuestas";

    public List<Respuestas> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Respuestas respuesta = null;
        List<Respuestas> respuestas = new ArrayList<>();

        conn = ConexionPreguntas.getConection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        while (rs.next()) {
//            int idrespuestas = rs.getInt("idrespuestas");
//            String numeroPregunta = rs.getString("numero_pregunta");
            String answer = rs.getString("respuestas");
            String booleana = rs.getString("booleana");
            respuesta = new Respuestas(answer, booleana);
            respuestas.add(respuesta);
        }
        return respuestas;
    }

}
