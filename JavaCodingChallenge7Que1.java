
public class JavaCodingChallenge7Que1 {
		public static void main(String [] args) {
			char [][] arr = {
					{'*'},
					{'*', '*'},
					{'*', '*', '*'},
					{'*', '*', '*', '*'},
					{'*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*'},
					{'*', '*', '*', '*', '*', '*', '*'},
			};
			
			for(char [] rows: arr) {
				for(char val: rows) {
					System.out.print(val);
				}
				System.out.println();
			}		
		}
}
