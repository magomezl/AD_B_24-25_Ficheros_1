package ficheros;

public class Utilidades {
	private final static String RUTADATOS = System.getProperty("user.dir") + 
			System.getProperty("file.separator") + "src" + 
			System.getProperty("file.separator") + "main" + 
			System.getProperty("file.separator") + "resources" +
			System.getProperty("file.separator");

	public static String getRutadatos() {
		return RUTADATOS;
	}
	
}
