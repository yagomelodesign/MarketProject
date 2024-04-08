package classes;

public class Categorias {

    private static int identificadorEstatico;
    private int idCategoria;
    private String tipoCategoria;
    
    public Categorias(){
        this.idCategoria = this.identificadorEstatico;
        this.identificadorEstatico++;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

}
