package conexion;

public class Esperando extends State {

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
        conection.getLink().recibir(respuesta);
        if(respuesta == 0){
            conection.setEstado(new Preparado());
        }else{
            conection.setEstado(new Cerrado());
        }
        
    }

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }

}
