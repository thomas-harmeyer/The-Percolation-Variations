import java.util.Scanner;

public class PercRunner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gridSize = input.nextInt();
		int runs = input.nextInt();
		int granularity = input.nextInt();
		int threads = input.nextInt();
		int fluidType = input.nextInt();
		double P = 0;
		double t = 0;
		t = System.nanoTime();
		System.out.println("Percolation tipping point p = " + P);
		t=(System.nanoTime()-t)*1000;
		System.out.println("Elapsed Time = " + t);

	}

}
