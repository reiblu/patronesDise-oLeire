package conexion;

public class Parado extends State {

    @Override
    public void abrir(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void cerrar(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void parar(Conexion conection) {
        conection.setEstado(new Parado());
    }

    @Override
    public void iniciar(Conexion conection) {
        conection.setEstado(new Preparado());

    }

    @Override
    public void enviar(Conexion conection, String mensaje) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion conection, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

}
