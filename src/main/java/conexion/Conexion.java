package conexion;

public class Conexion {

    private Estados estado;

    public Conexion(LinkMock link) {
        this.setEstado(new Cerrado());
    }

    protected void setEstado(Estados estado) {
        this.estado = estado;
    }

    public void abrir() {
        estado.abrir(this);
    }

    public void cerrar() {
        estado.cerrar(this);
    }

    public void parar() {
        estado.parar(this);
    }

    public void iniciar() {
        estado.iniciar(this);
    }

}
