public class incidencia {

    public int codigo;
    public String Descripcion;
    public String estado;

    public incidencia(int codigo, String descripcion, String estado) {
        this.codigo = codigo;
        Descripcion = descripcion;
        this.estado = estado;


    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void resolver(){
        setEstado("RESUELTO");
    }





}
