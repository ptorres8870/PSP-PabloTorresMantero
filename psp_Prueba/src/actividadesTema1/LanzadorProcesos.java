package actividadesTema1;


public class LanzadorProcesos {

	
		public void ejecutar(String ruta) {
			
			 ProcessBuilder pb;
             try {
                     pb = new ProcessBuilder(ruta);
                     pb.start();
             } catch (Exception e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
             }
     }
     /**
      * @param args
      */
     public static void main(String[] args) {
             String ruta=
                     "C:\\WINDOWS\\System32\\notepad.exe";
             LanzadorProcesos lp = new LanzadorProcesos();
             lp.ejecutar(ruta);
             System.out.println("Finalizado");
     }
}