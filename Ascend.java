// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a= (int)(Math.random()*(lim+1));
		int b= (int)(Math.random()*(lim+1));
		int c= (int)(Math.random()*(lim+1));
		int num3 = Math.max((Math.max(a,b)),c);
		int num1 = Math.min((Math.min(a,b)),c);
		int num2 = a+b+c-num3-num1;
		System.out.println(a +" "+ b +" " + c);
		System.out.println( num1+" "+ num2 +" " + num3);

	}
}
