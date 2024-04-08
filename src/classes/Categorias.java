package classes;

public class Categorias {

    private static int identificadorEstatico;
    private int idCategoria;
    private String tipoCategoria;
    
    public Categorias(String tipoCategoria){
        this.idCategoria = this.identificadorEstatico;
        this.identificadorEstatico++;
        this.tipoCategoria = tipoCategoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

}
