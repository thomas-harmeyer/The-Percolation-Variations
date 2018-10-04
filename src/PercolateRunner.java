import java.util.Scanner;

public class PercolateRunner {
	private int gridSize = 0;
	private int runs = 0;
	private int granularity = 0;
	private int granMax = 0;
	private int fluidType = 0;
	private double chance = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gridSize = input.nextInt();
		int runs = input.nextInt();
		int granularity = input.nextInt();
		int threads = input.nextInt();
		int fluidType = input.nextInt();
		double hits = 0;
		double chance = 0;
		double P = 0;
		double t = 0;
		t = System.nanoTime();
		ThreadRun: for (int x = 0; x < granularity; x++) {
			chance = (1 / (((double)x)*(1 - ((double) granularity))));
			hits = 0;
			GranRun: for (int y = 0; y < runs; y++) {
				Percolate percolate = new Percolate(gridSize, x, fluidType);
				if (percolate.hitBottom()) {
					hits++;
				}
			}

			if ((((double) hits) / ((double) runs)) >= 0.5) {
				System.out.println(chance);
				P = ((double) hits) / ((double) runs);
				break ThreadRun;
			}
		}
		System.out.println("Percolation tipping point p = " + P);
		t = (System.nanoTime() - t) * 1000;
		System.out.println("Elapsed Time = " + t);
	}

	public PercolateRunner(int gridSize, int runs, int granMin, int granMax, int fluidType) {
		this.gridSize = gridSize;
		this.runs = runs;
		this.granMax = granMax;
		this.fluidType = fluidType;
	}

	public void run() {
		Percolate peroclate = new Percolate(gridSize, chance, fluidType);

	}

}
