package datos;

public class RespuestasA {

    public String booleana;

    public RespuestasA(String booleana) {
        this.booleana = booleana;
    }

    public String getBooleana() {
        return booleana;
    }

    public void setBooleana(String booleana) {
        this.booleana = booleana;
    }

    @Override
    public String toString() {
        return booleana;
    }

}