package aula1906pct;

public class atv03 {

	public static void main(String[] args) {
		
		char m[][] = { 
			         {' ' , ' ' , ' ' , ' ' , '*'},
		             {' ' , ' ' , ' ' , '*' , ' '},
		             {' ' , ' ' , '*' , ' ' , ' '},
		             {' ' , '*' , ' ' , ' ' , ' '},
		             {'*' , ' ' , ' ' , ' ' , ' '},
		            
		};
	
		for (char[]ponto:m) {
			for(char coluna: ponto) {
				System.out.print(coluna+ "\t");
			}
		System.out.println();
		}
		

	}

}
