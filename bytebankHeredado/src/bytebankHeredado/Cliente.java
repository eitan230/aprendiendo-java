package bytebankHeredado;

public class Cliente implements Autenticable{

    private String nombre;
    private String documento;
    private String telefono;
    
    private AutenticacionUtil util;
    
    public Cliente() {
    	this.util = new AutenticacionUtil();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public void setContraseña(int contraseña) {
        this.util.setClave(contraseña);
    }

    @Override
    public boolean iniciarSesion(int contraseña) {
    	return this.util.iniciarSesion(contraseña);
    }
}
