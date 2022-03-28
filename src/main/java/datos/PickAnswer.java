package datos;

import domain.Respuestas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PickAnswer {
    public  String ans;
    private  String SQL_SELECT = "SELECT booleana FROM concurso.respuestas WHERE respuestas =" + ans;
    
    public List<RespuestasA> seleccionarA() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        RespuestasA respuesta = null;
        List<RespuestasA> respuestas = new ArrayList<>();

        conn = ConexionPreguntas.getConection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        while (rs.next()) {
//            int idrespuestas = rs.getInt("idrespuestas");
//            String numeroPregunta = rs.getString("numero_pregunta");
            //String answer = rs.getString("respuestas");
            String booleana = rs.getString("booleana");
            respuesta = new RespuestasA(booleana);
            respuestas.add(respuesta);
        }
        return respuestas;
    }
}
