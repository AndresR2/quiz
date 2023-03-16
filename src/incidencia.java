import java.util.Random;

public class incidencia {

    private int codigo;
    private String Descripcion;
    private String estado;

    public incidencia() {
    }

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

    @Override
    public String toString() {
        return "incidencia{" +
                "codigo=" + codigo +
                ", Descripcion='" + Descripcion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public void resolver(){
        setEstado("RESUELTO");
    }

    public void codigoNew(){
        Random ale = new Random();
        setCodigo(ale.nextInt(90));
    }





}
