package conexion;

public class Conexion {

    private State state;

    private Link link;

    private Estado estado;

    public Conexion(LinkMock link) {
        this.setEstado(new Cerrado());
        assert link != null;
        this.link = link;
    }

    public Link getLink() {
        return this.link;
    }

    protected void setEstado(State state) {
        this.state = state;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void abrir() {
        state.abrir(this);
    }

    public void cerrar() {
        state.cerrar(this);
    }

    public void parar() {
        state.parar(this);
    }

    public void iniciar() {
        state.iniciar(this);
    }

    public void enviar(String msg) {
        state.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        state.recibir(this, respuesta);
    }

}
