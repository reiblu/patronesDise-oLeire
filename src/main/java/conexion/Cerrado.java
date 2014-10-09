package conexion;

public class Cerrado extends State{

    @Override
    public void abrir(Conexion conection) {
        conection.setEstado(new Preparado()); 
    }

    @Override
    public void cerrar(Conexion conection) {
     
    }

    @Override
    public void parar(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");  
    }

    @Override
    public void iniciar(Conexion conection) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(Conexion conection, String mensaje) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion conection, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");  
    }

    @Override
    public Estado getEstado() {
        return Estado.CERRADO;
    }

}
