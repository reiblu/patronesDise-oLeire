package conexion;

public class Conexion {

    private State estado;

    private Link link;

    public Conexion(LinkMock link) {
        this.setEstado(new Cerrado());
        assert link != null;
        this.link = link;
    }

    public Link getLink() {
        return this.link;
    }

    protected void setEstado(State estado) {
        this.estado = estado;
    }

    public State getEstado() {
        return this.estado;
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

    public void enviar(String msg) {
        estado.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        estado.recibir(this, respuesta);
    }

}
