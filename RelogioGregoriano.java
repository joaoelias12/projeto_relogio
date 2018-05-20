package clock.pointer;

import java.util.Scanner;

public class RelogioGregoriano {
	  private static int hora;
	  private static int minuto;
	  
	  
      public static void main(String[] args) {
    	  
    	  
    	  //Recebendo os dados referente ao relogio.
    	  
    	  Scanner h = new Scanner(System.in);
    	  System.out.println("Digite a hora.");
    	  if(hora > 12) {
    		 System.out.println("ERRO 001: Digite uma hora com valor válido."); 
    	  }
    	  else {
    	  double hora = h.nextDouble();
    	  
    	  }
    	  Scanner m = new Scanner(System.in);
    	  System.out.println("Digite o minuto.");
    	  if(minuto > 60) {
    		System.out.println("ERRO 002: Digite um minuto com valor váldio");
    	  }
    	  double minuto = m.nextDouble();
    	  
    	  //formula angular 
    	  double angulo = 0;
    	  angulo = (11 * minuto - 60 * hora)/2;
    	  
    	  System.out.println("Relogio marcando angulo de "+angulo+"º graus");
      }
        
}
