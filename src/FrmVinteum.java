
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class FrmVinteum extends JFrame implements ActionListener
 {
     
     int jogador=0;
	 int comput=0;
	 int pontosJogador=0;
	 int pontosComput=0;
	 Carta cartasJogador[]=new Carta[20];
	 Carta cartasComput[]=new Carta[20];
	 boolean flag = true;
	 
	 //usado no teste poker
	 boolean ja_fez =false;	
	 int num_carta =0;
     
     Container c = getContentPane();
     
     JPanel pCartas;
     JPanel pCartasComp;
     JPanel pCartasJog;
     JPanel pTexto;
     JPanel pBotoes;
     
     JButton botaoSim;
     JButton botaoNao;
     JButton botaoSimPoker;
     JButton botaoNaoPoker;
   

     JTextArea texto;
     
     JScrollPane scroll;
     JLabel[] label;

     int n= 0;
     ImageIcon imgcarta;
     
     Carta carta = new Carta();
     Baralho b=new Baralho();
		
     
     public FrmVinteum()
     {
         super("Vinte Um");  
     }
     
     public void criaJanela()
     {        
         
         b.embaralhar();
         
         label = new JLabel[53];
         
         //Inicializa como nulo, os labels que receberão as imagens das cartas 
         for(int i=1; i<53; i++){
         	label[i] = new JLabel();
         }
                
         texto = new JTextArea();
         scroll = new JScrollPane(texto);
        
         pTexto = new JPanel();
         pBotoes= new JPanel();
         pCartas= new JPanel(); 
         pCartasComp= new JPanel(); 
         pCartasJog= new JPanel();       
         
         botaoSim = new JButton("Sim");
         botaoNao = new JButton("Não"); 
         botaoSimPoker = new JButton("Sim");
         botaoNaoPoker = new JButton("Não");
         
         
         pTexto.setLayout(new BorderLayout());
         pCartas.setLayout(new GridLayout(2,1));
         pCartasJog.setLayout(new GridLayout(1,10));
         pCartasComp.setLayout(new GridLayout(1,10));
         pBotoes.setLayout(new GridLayout(2,2));
             
         botaoSim.addActionListener(this);
         botaoNao.addActionListener(this);
         botaoSimPoker.addActionListener(this);
         botaoNaoPoker.addActionListener(this);
       
         pCartas.add(pCartasJog);
         pCartas.add(pCartasComp);
         
         pBotoes.add(botaoSim);
         pBotoes.add(botaoSimPoker);
         pBotoes.add(botaoNao);
         pBotoes.add(botaoNaoPoker);
         
         pTexto.add(scroll, BorderLayout.CENTER);
         pTexto.add(pBotoes, BorderLayout.EAST);
         

		//Monta a barra de menus
	     MenuBar menuBar = new MenuBar();
	     this.setMenuBar(menuBar);
	      
	     //Adiciona os menus
	     Menu mnArquivo = (Menu) menuBar.add(new Menu("Arquivo"));
	     MenuItem sbMnReiniciar = (MenuItem) mnArquivo.add(new MenuItem("Reiniciar"));
	     MenuItem sbMnSair = (MenuItem) mnArquivo.add(new MenuItem("Sair"));
	     MenuItem sbMnTestePoker = (MenuItem) mnArquivo.add(new MenuItem("Teste de Poker"));

         sbMnReiniciar.addActionListener(sbMnReiniciarClick); 
         sbMnSair.addActionListener(sbMnSairClick);
         sbMnTestePoker.addActionListener(sbMnTestePokerClick);
         botaoSimPoker.addActionListener(botaoSimPokerClick);
         botaoNaoPoker.addActionListener(botaoNaoPokerClick);
         botaoSim.addActionListener(botaoSimClick);
         botaoNao.addActionListener(botaoNaoClick);
         
                 
         botaoSimPoker.setVisible(false);
         botaoNaoPoker.setVisible(false);
         

         for(int i=1; i<11; i++){
         	 pCartasJog.add(label[i]);
         }
         
         
         for(int i=11; i<21; i++){
         	 pCartasComp.add(label[i]);
         }
                  

         //getContentPane().add(panel, BorderLayout.CENTER);

         c.setLayout(new BorderLayout());
         
		 
         c.add(pCartas, BorderLayout.CENTER); 
		 //c.add(pLabels, BorderLayout.SOUTH);
		// c.add(pBotoes, BorderLayout.WEST);
		 //c.add(pBotoes, BorderLayout.EAST);
		 c.add(pTexto, BorderLayout.NORTH);

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         pack();
         setVisible(true);        
     }
     
     
     public void print(String s){
     	texto.append(s);
     };
     
     public void println(String s){
     	print(s+"\n");
     };
          
   
  
  	public int mostraCartas(Carta mao[], int quant){
		int pontos=0;
		for(int i=0; i<quant; i++){
			
			label[i+1].setIcon(mao[i].toImage());
			
			if(mao[i].getValor()>10){
				pontos+=10;
			}else{
				pontos+=mao[i].getValor();
			}//if
		}//for
		return pontos;
	}//mostraCartas   
     
    
    public int mostraCartasComp(Carta mao[], int quant){
		int pontos=0;
		for(int i=0; i<quant; i++){
			
			label[i+11].setIcon(mao[i].toImage());
			
			if(mao[i].getValor()>10){
				pontos+=10;
			}else{
				pontos+=mao[i].getValor();
			}//if
			
		}//for
		return pontos;
	}//mostraCartas   


     ///LISTENERS/////
     
     public void actionPerformed(ActionEvent event)
     {
         
         
     }
     


      private ActionListener botaoSimPokerClick = new ActionListener(){         
         public void actionPerformed(ActionEvent ae){
            try{
                 
         	    //só faz uma vez
         	    if(!ja_fez){
	         	 	b.embaralhar();
	         	 	ja_fez =true;	
         	    }
         	    	 	
                //teste
                ///////////////////////////////////
//         	 	if(b.temCarta()){
//         	 		carta = b.darCarta();
//         	 				
//         	 	}else{
//         	 		println("Não tem mais cartas!");
//         	 	}
//         	 	
//         	 	num_carta++; 
//         	 	label[num_carta].setIcon(carta.toImage());
//         	 	cartasJogador[num_carta]=carta;
                /////////////////////////////////
                
   
   
              label[10 + comput].setIcon(cartasComput[comput++].toImage());

             
 
 
                 
            }
            catch (Exception e) {
               System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }
         }
      };


      private ActionListener botaoNaoPokerClick = new ActionListener(){         
         public void actionPerformed(ActionEvent ae){
            try{
                 
         	 	  println(num_carta+ " cartas!");
         	 	  
         	 	  
         	 	  Poker p = new Poker();
         	 	  
         	 	  p.analizaJogada(cartasJogador);
         	 	
         	 	//int naipe=0;
         	 	//int naipe_aux=0;
         	 
         	 	//for(int i=1; i<=num_carta; i++){
         	 		
         	 	//falta terminar
         	 	//naipe_aux= cartasJogador.[i].getValor()		

 
                 
            }
            catch (Exception e) {
               System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }
         }
      };



      private ActionListener botaoSimClick = new ActionListener(){         
         public void actionPerformed(ActionEvent ae){
            try{
                   
		         //Flag que acabou o jogo
		         if (flag){					         
						if( pontosJogador <21){							
							cartasJogador[jogador++]=b.darCarta();
						
							pontosJogador = mostraCartas(cartasJogador,jogador);
							println("Seus pontos + (" + cartasJogador[jogador-1].toString() +    ") ="+ pontosJogador);
							println("");
														
							if(pontosJogador < 21){
								println("Ainda quer carta?");
								texto.setSelectionStart(1);
							}
						} 
			
						if(pontosJogador==21){
							println("");
							println("Você ganhou!");
							flag =false;
							texto.setSelectionStart(1);
						}//if
					
						if(pontosJogador>21){
							println("");
							println("Passou de 21, você perdeu!");
							flag =false;
							texto.setSelectionStart(1);
							
						}//if          
		         }//flag   
            }
            catch (Exception e) {
               System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }
         }
      };





      private ActionListener botaoNaoClick = new ActionListener(){         
         public void actionPerformed(ActionEvent ae){
            try{
                 
	
	         //Flag que acabou o jogo
	         if (flag){	
		        
			        println("Não! Então o Computador joga ...");
			        println("");
			        
			        cartasComput[comput++]=b.darCarta();
					
					pontosComput = mostraCartasComp(cartasComput,comput);
					println("Pontos Computador = "+ pontosComput);
					texto.setSelectionStart(1);
			        
			        while (pontosComput <20 &&  pontosComput< pontosJogador){
						
						cartasComput[comput++]=b.darCarta();
					
						pontosComput = mostraCartasComp(cartasComput,comput);
						println("Pontos Computador + (" + cartasComput[comput-1].toString() + ") = "+ pontosComput);
						texto.setSelectionStart(1);
						
					} 
		
			        
			        if(pontosComput>=pontosJogador && pontosComput<=21){
					    println("");
						println("É...você perdeu!");
	                    flag =false;
						texto.setSelectionStart(1);
					}else{
						println("");
						println("Você ganhou!");
						flag =false;
						texto.setSelectionStart(1);
					} 
	             
	         }//flag  
                
            }
            catch (Exception e) {
               System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }
         }
      };




      //Menu Reiniciar       
      private ActionListener sbMnReiniciarClick = new ActionListener(){         
         public void actionPerformed(ActionEvent ae){
            try{
                 
                 inicializaVariaveis();
                 botaoSim.setVisible(true);
                 botaoSimPoker.setVisible(false);
                 botaoNao.setVisible(true);
                 botaoNaoPoker.setVisible(false);
                 
 		         cartasJogador[jogador++]=b.darCarta();
			
		         pontosJogador = mostraCartas(cartasJogador,jogador);
			
		         println("Seus pontos = "+ pontosJogador);
	         	 texto.setSelectionStart(1);                
                 
	             println("");
                 println("Quer carta?");  
 
                 
            }
            catch (Exception e) {
               System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }
         }
      };
      //Menu Sair
      private ActionListener sbMnSairClick = new ActionListener(){         
         public void actionPerformed(ActionEvent ae){
            try{
               dispose(); 
               
            }
            catch (Exception e) {
               System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }
         }
      };
      
 
       //Menu Teste de Poker
      private ActionListener sbMnTestePokerClick = new ActionListener(){         
         public void actionPerformed(ActionEvent ae){
            try{
               inicializaVariaveis();
               comput =1;
               botaoSim.setVisible(false);
               botaoSimPoker.setVisible(true);
               botaoNao.setVisible(false);
               botaoNaoPoker.setVisible(true);
               println("Teste de Poker"); 
               println(""); 
               println("O botão SIM acrescenta cartas e o botão não analisa se há alguma combinação");
               println("Ainda não está funcionando.");
               
               //Dá 5 cartas para o computador
               for (int i=1;i<=5;i++){
               		cartasComput[i]=b.darCarta();
               }
               
               //Dá 2 cartas para o jogador
               for (int i=1;i<=2;i++){
               		cartasJogador[i]=b.darCarta();
               }
              
              label[1].setIcon(cartasJogador[1].toImage());
              label[2].setIcon(cartasJogador[2].toImage());

 
              label[11].setIcon(cartasComput[1].getVerso());
              label[12].setIcon(cartasComput[2].getVerso());
              label[13].setIcon(cartasComput[3].getVerso());
              label[14].setIcon(cartasComput[4].getVerso());
              label[15].setIcon(cartasComput[5].getVerso());

  
            }
            catch (Exception e) {
               System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
            }
         }
      };

      
      private void inicializaVariaveis(){
      	 
      	 ja_fez =false;
      	 num_carta =0;
      	 texto.setText("");
                                  
         b = null;
         carta =null;
         carta = new Carta();
         b = new Baralho();
         b.embaralhar();
         
	     jogador=0;
		 comput=0;
		 pontosJogador=0;
		 pontosComput=0;

		 cartasJogador=null;
		 cartasComput=null;				 
		 cartasJogador=new Carta[20];
		 cartasComput=new Carta[20];


         //Inicializa como nulo, os labels que receberão as imagens das cartas 
 	     for(int i=1; i<53; i++){
 		 	
 		 	label[i].setIcon(null);

         }
          
         flag = true;
      	
      }
      
      public static void main(String args[]){
        
        FrmVinteum ex2 = new FrmVinteum();
        
        ex2.criaJanela();
        ex2.setSize(600,600);
		
		ex2.cartasJogador[ex2.jogador++]=ex2.b.darCarta();
			
		ex2.pontosJogador = ex2.mostraCartas(ex2.cartasJogador,ex2.jogador);
			
		ex2.println("Seus pontos = "+ ex2.pontosJogador);
		ex2.texto.setSelectionStart(1);
	    
	    ex2.println("");
		ex2.println("Quer carta?");
		ex2.texto.setSelectionStart(1);
         
     }
     
 }  