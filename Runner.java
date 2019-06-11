public class Runner{

<<<<<<< HEAD
	public static void main(String[] args) {

		PrintQuotientInterface printQuotient = (float a, float b) -> System.out.printf("%.3f / %.3f == %.3f",a,b,a/b);
		printQuotient.printQuotient(1,3);

=======
	public static void main(String[]args){
		PerfectSquareInterface squareInterface = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
		System.out.println(squareInterface.perfectSum(49));
>>>>>>> Perfect_Square
	}
}