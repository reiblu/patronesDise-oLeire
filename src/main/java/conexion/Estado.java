package conexion;

public abstract class Estado {

    public abstract void abrir(Conexion conection);

    public abstract void cerrar(Conexion conection);

    public abstract void parar(Conexion conection);

    public abstract void iniciar(Conexion conection);

    public abstract void enviar(Conexion conection, String mensaje);

    public abstract void recibir(Conexion conection, int respuesta);

}
