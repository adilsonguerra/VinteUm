
import java.util.Arrays;

class Poker {
	
	
	public Poker(){
	
	};
		
    public void analizaJogada(Carta[] cartas){
    	
    	
    	CartaComparator cartaComparator = new CartaComparator();
    	
    	System.out.println ("Sem ordena��o:");
    		
    	
    	for (int i=1;i<=2;i++){
  
   
        	System.out.println (cartas[i].getValor());
         		
       	}

        System.out.println ("");
        System.out.println ("Com ordena��o:");
    	
    	Arrays.sort(cartas,cartaComparator);
    	
    	System.out.println (cartas.length);
    	
    	for (int i=1;i<=2;i++){
   
        	System.out.println (cartas[i].getValor());
         		
       	}
    	
    	
    	
    }
    
    
    

}



