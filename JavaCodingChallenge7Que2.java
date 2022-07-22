
public class JavaCodingChallenge7Que2 {
	public static void main(String [] args) {
		int tableOf = 7;
		int [] arr = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
		
		for(int row: arr) {
			int res = tableOf * row;
			System.out.println(tableOf + " * "+ row + " = " + res);
		}	
	}
}
