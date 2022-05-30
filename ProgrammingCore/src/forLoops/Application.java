package forLoops;

public class Application {
	
	public static void main(String[] args) {
		
		/*Dentro do parenteses tera a condicao que dirá quantas vezes
		o loop executara*/
		
		
		/*Os pontos e virguals dividem o conteudo que está no parentese
		em 3 seções:
		1 - seção executará o código antes que o loop iniciar. Ex for(int i=0; ?; ?)
		foi criado e atribuido valor  a uma variavel que que será usada como contador;
		2 - seção que enquanto uma condição for verdadeira o loop será executado. Ex for(int i = 0; i < 10; ?)
		enquanto i for menor que 10 o loop será executado.
		3 - fica o incremento do contador do loop que será usado para parar em loop. Ex for(int i = 0; i < 10 ; i = i + 1);
		o laço for vai iniciar uma variavel que será o contador(i), que irá executar uma condição que terminar quando o contador valer 10
		e por fim a cada execução o contador(i) receberá + 1; usar i++ é mais comum apra incrementar +! for(int i = 0; i < 10 ; i++)
		*/
		
		for(int i =0 ; i < 5; i ++) {
			System.out.println("Hello, the value of i is "+i);
			
			/* printf
			usado para imprimir tipos de formatações de string especificas,
			onde um simbolo é utilizado e após a virgula vem uma variavel que será
			que será substituida no simbolo especifico inserido na string.
			*/	
			System.out.println();
			
			System.out.printf("The value of i is: ", i);
			
			System.out.println();
			
			System.out.printf("The value of i is: %d\n", i);
			
			System.out.println();
		}
		
		
	
		
		
		
		
	}

}
