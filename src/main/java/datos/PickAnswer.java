package datos;

import domain.Respuestas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class PickAnswer {
    public String ans;
   // private  String SQL_SELECT = "SELECT booleana FROM concurso.respuestas WHERE respuestas =" + "'" + ans + "'";
    
    public List<RespuestasA> seleccionarA(String answer) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        RespuestasA respuesta = null;
        List<RespuestasA> respuestasA = new ArrayList<>();

        conn = ConexionPreguntas.getConection();
        stmt = conn.prepareStatement("SELECT booleana FROM concurso.respuestas WHERE respuestas = " + "'" + answer + "'");
        rs = stmt.executeQuery();
        while (rs.next()) {
           String booleana = rs.getString("booleana");
            respuesta = new RespuestasA(booleana);
            respuestasA.add(respuesta);
        }
        return respuestasA;
    }
    

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
    
}
