package aula1906pct;
import java.util.ArrayList;
public class atv01 {

	public static void main(String[] args) {
		
		char m[][] = { 
			         {'a' , 'b' , 'c' , 'd' , 'e'},
		             {'f' , 'g' , 'h' , 'i' , 'j'},
		             {'l' , 'm' , 'n' , 'o' , 'p'},
		             {'q' , 'r' , 's' , 't' , 'u'},
		             {'v' , 'w' , 'x' , 'y' , 'z'}

		};
	
		for (char[]letra:m) {
			for(char coluna: letra) {
				System.out.print(coluna+ "\t");
			}
		System.out.println();
		}
		

	}

}
