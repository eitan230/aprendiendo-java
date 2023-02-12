
public class TextConexion {
	public static void main(String[] args) throws Exception {
		
		try(Conexion conexion = new Conexion () ){
	        conexion.leerDatos();
		} catch(IllegalStateException ex){
		        System.out.println("Surgió un error en la conexión ");
		}
		
		/*Conexion con = null;
		
		try {
			con = new Conexion();
			con.leerDatos();			
		} catch(IllegalStateException ex){
			ex.printStackTrace();
		} finally {
			if(con != null) {
				con.cerrar();			
				
			}
		}*/
	}
}
