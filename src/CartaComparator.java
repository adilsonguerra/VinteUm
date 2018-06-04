import java.util.Comparator;

class CartaComparator implements Comparator {
	

	 
	public int compare(Object o1, Object o2) {
		
		Carta pri =(Carta) o1;
		Carta seg =(Carta) o2;
		
		System.out.println ( seg.getValor()-pri.getValor());
		return seg.getValor()-pri.getValor();
		
		
		
	}

//	public boolean equals(Object parm1) {

//	}	
}
