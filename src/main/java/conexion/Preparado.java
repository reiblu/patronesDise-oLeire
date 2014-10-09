package conexion;

public class Preparado extends State {

    @Override
    public void abrir(Conexion conection) {
        conection.setEstado(new Preparado());
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
        conection.setEstado(new Preparado());

    }

    @Override
    public void enviar(Conexion conection, String mensaje) {
        // TODO Auto-generated method stub

    }

    @Override
    public void recibir(Conexion conection, int respuesta) {
        // TODO Auto-generated method stub

    }

}
