package workshop02;

public class Test01 {

	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[0]);
		
		System.out.print("입력값: ");
		for(int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
			if(max < Integer.parseInt(args[i]))
				max = Integer.parseInt(args[i]);
			if(min > Integer.parseInt(args[i]))
				min = Integer.parseInt(args[i]);
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
