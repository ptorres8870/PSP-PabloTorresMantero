package actividadesTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Actividad_2 {

    public static void main(String[] args) {
        try {
           
            Process proceso = Runtime.getRuntime().exec("cmd /c dir");

            
            InputStream inputStream = proceso.getInputStream();

          
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            //s
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}