package multiDimensionalArrays;

public class Application {
	
	public static void main(String[] args) {
		
		/*Array de uam dimens�o*/
		
		int[] values = {3, 5, 2343}; // um index pra especificar o valor de cada posi��o
		
		System.out.println(values[2]);// um index apenas 
		
		/*Um array multidimensional requer mais de um index para especificar um valor a cada posi��o
		 * do array */
		
		/*Criando um array de duas dimens�es*/
		
		/*a diferen�a entre um array de uma dimens�o e de mais dimes�es � quantidade de brackets*/
		/*em java um array multidimensional � apenas um array de arrays*/
		
		int[][] grid = {
				
		//coluna 0  1    2
				{3, 5, 2343},//linha 0
				{2, 4},		//linha 1
				{1, 2, 3, 4}// linha 2
				
		};
		
		/*Para acessar um array multidimensional � necessario especificar primeiro a posi��o da linha
		e depois da coluna*/
		
		System.out.println(grid[0][2]);
		
		/*Criando um array multidimensional para depois atribuir valores*/
		
		/*Criando um array do tipo string que ter� 2 linhas e 3 colunas*/
		String[][] texts = new String[2][3];	
		System.out.println();
		
		//Percorrendo um array de mais de uma dimens�o
		
		//for linha
		/*1- Declarando um variavel antes do incio do loop chamada linha
		 *2- linha ir� percorrer pela matriz at� seu tamnho maximo
		 *3- linha incrementa +1 a cada posi��o percorrida*/
		
		//for coluna
		/*1- Declarando um variavel antes do incio do loop chamada coluna
		 *2- coluna ir percorrer at� o tamanho maximo da posi��o atual da linha
		 *3- coluna incrementa +1 a cada posi��o percorrida*/
		
		
		//estou dentro da linha X entao vou
		for(int linha=0; linha < grid.length; linha++) {
			//percorrer todos os valores(de cada coluna) dentro dessa linha at� o fim da linha
			for(int coluna=0; coluna < grid[linha].length; coluna++ ) {
				//imrpimindo o array da posi��o atual da linha e coluna
				System.out.print(grid[linha][coluna]+" ");
			}
			
			//pulando uma linha no fim do loop da linha
			System.out.println();
		}
		}
		
		

}
