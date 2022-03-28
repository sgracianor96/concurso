package domain;

public class CategoriaPregunta {

    private int idcategoriaPregunta;
    private String categoria;
    private String pregunta;

    public CategoriaPregunta() {
    }

    public CategoriaPregunta(int idcategoriaPregunta) {
        this.idcategoriaPregunta = idcategoriaPregunta;
    }

    public int getIdcategoriaPregunta() {
        return idcategoriaPregunta;
    }

    public void setIdcategoriaPregunta(int idcategoriaPregunta) {
        this.idcategoriaPregunta = idcategoriaPregunta;
    }

    public CategoriaPregunta(int idcategoriaPregunta, String categoria, String pregunta) {
        this.idcategoriaPregunta = idcategoriaPregunta;
        this.categoria = categoria;
        this.pregunta = pregunta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return pregunta;
    }

    

}
