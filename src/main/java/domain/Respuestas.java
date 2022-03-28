package domain;

public class Respuestas {
    private int idrespuestas;
    private String numeroPregunta;
    public  String respuestas;
    public  String booleana;

    public Respuestas() {
    }

    public Respuestas(int idrespuestas) {
        this.idrespuestas = idrespuestas;
    }

    public Respuestas(String respuestas, String booleana) {
//        this.idrespuestas = idrespuestas;
//        this.numeroPregunta = numeroPregunta;
        this.respuestas = respuestas;
        this.booleana = booleana;
    }

    public int getIdrespuestas() {
        return idrespuestas;
    }

    public void setIdrespuestas(int idrespuestas) {
        this.idrespuestas = idrespuestas;
    }

    public String getNumeroPregunta() {
        return numeroPregunta;
    }

    public void setNumeroPregunta(String numeroPregunta) {
        this.numeroPregunta = numeroPregunta;
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }

    public String getBooleana() {
        return booleana;
    }

    public void setBooleana(String booleana) {
        this.booleana = booleana;
    }

    @Override
    public String toString() {
        return  respuestas;
    }
    
    
}
