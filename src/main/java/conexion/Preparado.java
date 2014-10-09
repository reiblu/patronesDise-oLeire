package conexion;

public class Preparado extends State {

    @Override
    public void abrir(Conexion conection) {
        
    }

    @Override
    public void cerrar(Conexion conection) {
        conection.setEstado(new Cerrado());
    }

    @Override
    public void parar(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion conection) {

    }

    @Override
    public void enviar(Conexion conection, String mensaje) {
        conection.setEstado(new Esperando());;

    }

    @Override
    public void recibir(Conexion conection, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
