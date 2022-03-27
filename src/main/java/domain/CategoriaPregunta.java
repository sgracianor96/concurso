package domain;

public class CategoriaPregunta {

    private int idcategoriaPregunta;

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

    @Override
    public String toString() {
        return "CategoriaPregunta{" + "idcategoriaPregunta=" + idcategoriaPregunta + '}';
    }

   

}
