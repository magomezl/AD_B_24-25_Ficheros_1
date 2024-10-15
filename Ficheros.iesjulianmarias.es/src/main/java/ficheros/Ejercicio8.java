package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Ejercicio8 {
	private static final char SEPARADOR= ',';
	private static final char COMILLA= '"';
	public final static String FICHEROTRABAJO = "ejercicio08.csv";
	
	private static void mostrarValores(String[] fields) {
		for(int i=0; i<fields.length; i++) {
			System.out.println("\t-" + fields[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		CSVReader reader = null;
		
		try {
			reader = new CSVReader(new FileReader(Utilidades.getRutadatos()+FICHEROTRABAJO),
					SEPARADOR, COMILLA);
			String[] nextLine = null;
			while((nextLine=reader.readNext())!=null) {
				mostrarValores(nextLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
