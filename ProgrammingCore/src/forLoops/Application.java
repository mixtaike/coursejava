package forLoops;

public class Application {
	
	public static void main(String[] args) {
		
		/*Dentro do parenteses tera a condicao que dir� quantas vezes
		o loop executara*/
		
		
		/*Os pontos e virguals dividem o conteudo que est� no parentese
		em 3 se��es:
		1 - se��o executar� o c�digo antes que o loop iniciar. Ex for(int i=0; ?; ?)
		foi criado e atribuido valor  a uma variavel que que ser� usada como contador;
		2 - se��o que enquanto uma condi��o for verdadeira o loop ser� executado. Ex for(int i = 0; i < 10; ?)
		enquanto i for menor que 10 o loop ser� executado.
		3 - fica o incremento do contador do loop que ser� usado para parar em loop. Ex for(int i = 0; i < 10 ; i = i + 1);
		o la�o for vai iniciar uma variavel que ser� o contador(i), que ir� executar uma condi��o que terminar quando o contador valer 10
		e por fim a cada execu��o o contador(i) receber� + 1; usar i++ � mais comum apra incrementar +! for(int i = 0; i < 10 ; i++)
		*/
		
		for(int i =0 ; i < 5; i ++) {
			System.out.println("Hello, the value of i is "+i);
			
			/* printf
			usado para imprimir tipos de formata��es de string especificas,
			onde um simbolo � utilizado e ap�s a virgula vem uma variavel que ser�
			que ser� substituida no simbolo especifico inserido na string.
			*/	
			System.out.println();
			
			System.out.printf("The value of i is: ", i);
			
			System.out.println();
			
			System.out.printf("The value of i is: %d\n", i);
			
			System.out.println();
		}
		
		
	
		
		
		
		
	}

}
