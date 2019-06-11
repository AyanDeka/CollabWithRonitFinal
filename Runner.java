public class Runner{

	public static void main(String[] args) {

		PrintQuotientInterface printQuotient = (float a, float b) -> System.out.printf("%.3f / %.3f == %.3f",a,b,a/b);
		printQuotient.printQuotient(1,3);

	}
}