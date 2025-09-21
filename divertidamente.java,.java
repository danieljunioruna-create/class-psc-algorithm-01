import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   
	String amizadadeRiley = "Sim";
	
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("---------Riley chega em uma nova cidade");
		
		
		System.out.println("\nA Riley tem algum amigo  (Sim/Não) ?");
		String amigo = scanner.nextLine();

		/*inicia variáveis para poder usar depois do if */
		
		int pontosAlegriaUm = 0;
		int pontosTristezaUm = 0;

		if(amigo.equals(amizadadeRiley)){
		    System.out.println("\nQuantos amigos ela fez ?");
		    int quantidadeAmigos = scanner.nextInt();
		    pontosAlegriaUm = (quantidadeAmigos * 10);
		    System.out.println("Alegria tem " + pontosAlegriaUm + " pontos" );
		}else{
		    pontosTristezaUm = 30;
		    System.out.println("Tristeza tem " + pontosTristezaUm + " pontos");
		}
		
	   
	   System.out.println("\n---------Na nova cidade, a Riley fez três provas na universidade: A1, A2 e A3. E cada uma valia 10 pontos.");
	   
	   System.out.print("\nQuantos a Riley tirou na A1 ? ");
	   double notaUm = scanner.nextDouble();
	   
	   System.out.print("\nQuantos a Riley tirou na A2 ? ");
	   double notaDois = scanner.nextDouble();
	   
	   System.out.print("\nQuantos a Riley tirou na A3 ? ");
	   double notaTres = scanner.nextDouble();
	   
	   double mediaNota= (notaUm + notaDois + notaTres )/3;
	   
	   System.out.println("\n A media da nota da Riley é" + mediaNota + "  pontos" );
	   
	   
	   int pontosAlegriaDois = 0;
	  int pontosTristezaDois = 0;
	    int notaDecisiva = 7;
	    
	    
	   if(mediaNota >= notaDecisiva){
	       System.out.println("Aprovada");
	        pontosAlegriaDois = (pontosAlegriaUm + 50 );
	       System.out.println("\nA alegria tem " + pontosAlegriaDois + "pontos.");
	   }else{
	        pontosTristezaDois = ( pontosTristezaUm + 50);
	       System.out.println("\nTristeza tem " + pontosTristezaDois + " pontos");
	   }
	   
	   //A Riley esta estudando programação. E ela tem 10 algoritmos para resolver.
	   
	   System.out.println("\n---------A Riley esta estudando programação. E ela tem 10 algoritmos para resolver.");
	   
	   System.out.println("\nQuantas atividades a Riley consegui fazer ?");
	   int quantidadeFeita = scanner.nextInt();
	    
	    int quantidadeTotalTrabalho = 100;
	    int pontosAlegriaTres = (quantidadeFeita * 10) + pontosAlegriaDois;
	    int pontosTristezaTres = (quantidadeTotalTrabalho - pontosAlegriaTres) + pontosTristezaDois;
	    int numeroDecisivo = 1;
	    
	    if(quantidadeFeita >= numeroDecisivo){
	        pontosAlegriaTres = (quantidadeFeita * 10) + pontosAlegriaDois;
	        System.out.println("Pontos da alegria é " + pontosAlegriaTres + "pontos" );
	        
	    }else {
	         pontosTristezaTres = (quantidadeTotalTrabalho - pontosAlegriaTres) + pontosTristezaDois;
	         System.out.println("Pontos da Trsisteza é " + pontosTristezaTres + "pontos" );
	    }
	   
	   if( pontosAlegriaTres > pontosTristezaTres){
	       System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
	   }else {
	       System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
	   }
	   
	  
	   
	   scanner.close();
		
	}
}