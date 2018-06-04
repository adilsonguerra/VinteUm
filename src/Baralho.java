
public class Baralho {
	private Carta monte[];
	private int topo;
	
	public Baralho(){
		monte=new Carta[52];
		topo=0;
		for (int n=1;n<5;n++){
			for (int v=1;v<14;v++){
				monte[topo++]=new Carta(n,v);
			}//for v
		}//for n
	}//construtor
	
	public boolean temCarta(){
		return topo>0;
	}
	
	public Carta darCarta(){
		Carta tmp=null;
		if(topo>0){
			tmp=monte[--topo];
		}
		return tmp;
	}//darCarta
	
	public void embaralhar(){
		for (int c=0;c<52;c++){
			int i=(int)Math.round(Math.random()*51);
			Carta tmp=monte[i];
			monte[i]=monte[c];
			monte[c]=tmp;
		}//for
	}//embaralhar
	
	public void todasCartas(){
		for(int i=0;i<monte.length;i++){
			System.out.println ((i+1)+"->"+monte[i].toString());
		}	
	}
	
}//classe
