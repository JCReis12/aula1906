package aula1906pct;

public class atv04 {

	public static void main(String[] args) {
		
		char m[][] = { 
			         {' ' , ' ' , '*' , ' ' , ' '},
		             {' ' , ' ' , '*' , ' ' , ' '},
		             {'*' , '*' , '*' , '*' , '*'},
		             {' ' , ' ' , '*' , ' ' , ' '},
		             {' ' , ' ' , '*' , ' ' , ' '},
		            
		};
	
		for (char[]ponto3:m) {
			for(char coluna: ponto3) {
				System.out.print(coluna+ "\t");
			}
		System.out.println();
		}
		

	}

}
