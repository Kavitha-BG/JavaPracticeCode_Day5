
public class JavaCodingChallenge7Que4 {
	public static void main(String [] args) {
		if(args.length <= 1) {
			System.out.println("Pass at least two numbers");
			return;
		}
		int [] arr = new int[args.length];
		
		for (int i=0; i<args.length;i++) {
			arr[i] = Integer.parseInt(args[i]);		
		}
		
		int max = arr[0];
		for(int i =1; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Highest number is: " + max);
	}
}

