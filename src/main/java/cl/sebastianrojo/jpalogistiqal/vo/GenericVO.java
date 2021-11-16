package cl.sebastianrojo.jpalogistiqal.vo;

/**
 * GenericVO
 */
public class GenericVO {

    protected String mensaje;
    protected String codigo;
    
    public GenericVO() {
    }

    public GenericVO(String mensaje, String codigo) {
        this.mensaje = mensaje;
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "GenericVO [codigo=" + codigo + ", mensaje=" + mensaje + "]";
    }
    
}