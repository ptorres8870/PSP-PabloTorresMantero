package actividadesTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Actividad_3 {
	
	public static void main(String[] args) {
        try {
        	String ruta = "C:\\Users\\ptorres8870\\eclipse-workspace\\PSP\\psp_prueba\\bin\\psp_prueba\\Actividad_2.class";
            Process proceso = Runtime.getRuntime().exec(ruta);

            InputStream input = proceso.getInputStream();

   
            BufferedReader leer = new BufferedReader(new InputStreamReader(input));
            String linea;
            while ((linea = leer.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
	