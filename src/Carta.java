 import javax.swing.*;
 import java.util.Comparator;
 
public class Carta implements Comparable{
	public static final int PAUS=1;
	public static final int OUROS=2;
	public static final int ESPADAS=3;
	public static final int COPAS=4;
	
	private int naipe;
	private String naipe_s;
	private int valor;
	private String valor_s;
	
	
	public Carta(){}
	
	public Carta(int n,int v){
		if(n>=PAUS && n<=COPAS){
			naipe=n;
		}else{
			naipe=1;
		}
		if(v>=1 && v<=13){
			valor=v;
		}else{
			valor=1;
		}
		
	}
	
	public int getNaipe(){
		return naipe;
	}

	public ImageIcon getVerso(){
		
		ImageIcon img = new ImageIcon("../cartas/verso.jpg");
	
		return img;
	}


	public String getNaipeStr(){
		
		
	String n="";
	
	switch(naipe){
		case PAUS: 	  n="paus";    break;
		case OUROS:   n="ouros";   break;
		case ESPADAS: n="espadas"; break;
		case COPAS:   n="copas";   break;
	}
			
		return n;
	}
	
	
	
	public int getValor(){
		return valor;	
	}
	


	public String getValorStr(){
		
	String v="";
		switch(valor){
			case 1:  v="as";      break;
			case 2:  v="dois";    break;
			case 3:  v="três";    break;
			case 4:  v="quatro";  break;
			case 5:  v="cinco";   break;
			case 6:  v="seis";    break;
			case 7:  v="sete";    break;
			case 8:  v="oito";    break;
			case 9:  v="nove";    break;
			case 10: v="dez";     break;
			case 11: v="valete";  break;
			case 12: v="dama";    break;
			case 13: v="rei";     break;
		}			
		
		return v;	
	}
	
		
	
	public String toString(){
		String tmp="";
		switch(valor){
			case 1:  tmp="as";      break;
			case 2:  tmp="dois";    break;
			case 3:  tmp="três";    break;
			case 4:  tmp="quatro";  break;
			case 5:  tmp="cinco";   break;
			case 6:  tmp="seis";    break;
			case 7:  tmp="sete";    break;
			case 8:  tmp="oito";    break;
			case 9:  tmp="nove";    break;
			case 10: tmp="dez";     break;
			case 11: tmp="valete";  break;
			case 12: tmp="dama";    break;
			case 13: tmp="rei";     break;
		}
		switch(naipe){
			case PAUS: 	  tmp=tmp+" de paus";    break;
			case OUROS:   tmp=tmp+" de ouros";   break;
			case ESPADAS: tmp=tmp+" de espadas"; break;
			case COPAS:   tmp=tmp+" de copas";   break;
		}
		return tmp;
	}
	
	
	public ImageIcon toImage(){
		
		String tmp ="";
		
		switch(valor){
			case 1:  tmp="as";      break;
			case 2:  tmp="dois";    break;
			case 3:  tmp="tres";    break;
			case 4:  tmp="quatro";  break;
			case 5:  tmp="cinco";   break;
			case 6:  tmp="seis";    break;
			case 7:  tmp="sete";    break;
			case 8:  tmp="oito";    break;
			case 9:  tmp="nove";    break;
			case 10: tmp="dez";     break;
			case 11: tmp="valete";  break;
			case 12: tmp="dama";    break;
			case 13: tmp="rei";     break;
		}
		switch(naipe){
			case PAUS: 	  tmp=tmp+"_paus.jpg";    break;
			case OUROS:   tmp=tmp+"_ouro.jpg";   break;
			case ESPADAS: tmp=tmp+"_espada.jpg"; break;
			case COPAS:   tmp=tmp+"_copas.jpg";   break;
		}
		
		

		ImageIcon img = new ImageIcon("../cartas/"+tmp);
		
		
		return img;

	}
	
	public int compareTo(Object o){
    
    	Carta outro=(Carta)o;
    	
    	int valorOutroObj = outro.getValor();
    	
    	return  valor - valorOutroObj;
    
    }	
	
	
}
