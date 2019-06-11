public class Runner{
	public static void main(String[] args) {

		//Ronit Learned that lamdafunctions are used to make a method more effecient and write a method in less code

		PrintQuotientInterface printQuotient = (float a, float b) -> System.out.printf("%.3f / %.3f == %.3f",a,b,a/b);
		printQuotient.printQuotient(1,3);

		PerfectSquareInterface squareInterface = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
		System.out.println(squareInterface.perfectSum(49));

	}
}