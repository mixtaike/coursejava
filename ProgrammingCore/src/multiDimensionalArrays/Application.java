package multiDimensionalArrays;

public class Application {
	
	public static void main(String[] args) {
		
		/*Array de uam dimensão*/
		
		int[] values = {3, 5, 2343}; // um index pra especificar o valor de cada posição
		
		System.out.println(values[2]);// um index apenas 
		
		/*Um array multidimensional requer mais de um index para especificar um valor a cada posição
		 * do array */
		
		/*Criando um array de duas dimensões*/
		
		/*a diferença entre um array de uma dimensão e de mais dimesões é quantidade de brackets*/
		/*em java um array multidimensional é apenas um array de arrays*/
		
		int[][] grid = {
				
		//coluna 0  1    2
				{3, 5, 2343},//linha 0
				{2, 4},		//linha 1
				{1, 2, 3, 4}// linha 2
				
		};
		
		/*Para acessar um array multidimensional é necessario especificar primeiro a posição da linha
		e depois da coluna*/
		
		System.out.println(grid[0][2]);
		
		/*Criando um array multidimensional para depois atribuir valores*/
		
		/*Criando um array do tipo string que terá 2 linhas e 3 colunas*/
		String[][] texts = new String[2][3];	
		System.out.println();
		
		//Percorrendo um array de mais de uma dimensão
		
		//for linha
		/*1- Declarando um variavel antes do incio do loop chamada linha
		 *2- linha irá percorrer pela matriz até seu tamnho maximo
		 *3- linha incrementa +1 a cada posição percorrida*/
		
		//for coluna
		/*1- Declarando um variavel antes do incio do loop chamada coluna
		 *2- coluna ir percorrer até o tamanho maximo da posição atual da linha
		 *3- coluna incrementa +1 a cada posição percorrida*/
		
		
		//estou dentro da linha X entao vou
		for(int linha=0; linha < grid.length; linha++) {
			//percorrer todos os valores(de cada coluna) dentro dessa linha até o fim da linha
			for(int coluna=0; coluna < grid[linha].length; coluna++ ) {
				//imrpimindo o array da posição atual da linha e coluna
				System.out.print(grid[linha][coluna]+" ");
			}
			
			//pulando uma linha no fim do loop da linha
			System.out.println();
		}
		}
		
		

}
