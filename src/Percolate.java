public class Percolate {
	private int hitBottom = 0;
	private RandomGrid Grid = null;
	private int dirtType = 0;

	public Percolate(int length, double chance, int dirtType) {
		this.dirtType = dirtType;
		Grid = new RandomGrid(length, chance);
		for (int x = 0; x < Grid.getSize(); x++) {
			if (Grid.getValue(x, 0) == 0) {
				this.Solve(x, 0);
			}
		}
		System.out.println(Grid.toString());
		System.out.print("\n" + "Percolate = " + this.hitBottom());
	}

	public void Solve(int xCord, int yCord) {
		Grid.setValue(xCord, yCord, 2);
		if (dirtType == 0) {
			if ((yCord < Grid.getSize() - 1)) {
				if (Grid.getValue(xCord, yCord + 1) == 0) {
					Solve(xCord, yCord + 1);
				}
			}
			if ((yCord > 0)) {
				if (Grid.getValue(xCord, yCord - 1) == 0) {

					Solve(xCord, yCord - 1);
				}
			}
			if (yCord == Grid.getSize() - 1) {
				hitBottom++;
			}
		}
		if (dirtType == 1) {
			if ((yCord < Grid.getSize() - 1)) {
				if (Grid.getValue(xCord, yCord + 1) == 0) {
					Solve(xCord, yCord + 1);
				}
			}
			if ((xCord < Grid.getSize() - 1)) {
				if (Grid.getValue(xCord + 1, yCord) == 0) {
					Solve(xCord + 1, yCord);
				}
			}
			if ((yCord > 0)) {
				if (Grid.getValue(xCord, yCord - 1) == 0) {

					Solve(xCord, yCord - 1);
				}
			}
			if (xCord > 0) {
				if (Grid.getValue(xCord - 1, yCord) == 0) {
					Solve(xCord - 1, yCord);
				}
			}
			if (yCord == Grid.getSize() - 1) {
				hitBottom++;
			}
		}
		if (dirtType == 2) {
			if ((yCord < Grid.getSize() - 1)) {
				if (Grid.getValue(xCord, yCord + 1) == 0) {
					Solve(xCord, yCord + 1);
				}
			}
			if ((xCord < Grid.getSize() - 1)) {
				if (Grid.getValue(xCord + 1, yCord) == 0) {
					Solve(xCord + 1, yCord);
				}
			}
			if ((yCord > 0)) {
				if (Grid.getValue(xCord, yCord - 1) == 0) {

					Solve(xCord, yCord - 1);
				}
			}
			if (xCord > 0) {
				if (Grid.getValue(xCord - 1, yCord) == 0) {
					Solve(xCord - 1, yCord);
				}
			}
			//
			if ((yCord < Grid.getSize() - 1) && (xCord < Grid.getSize() - 1)) {
				if (Grid.getValue(xCord + 1, yCord + 1) == 0) {
					Solve(xCord + 1, yCord + 1);
				}
			}
			if ((xCord < Grid.getSize() - 1) && (yCord > 0)) {
				if (Grid.getValue(xCord + 1, yCord - 1) == 0) {
					Solve(xCord + 1, yCord - 1);
				}
			}
			if ((yCord > 0) && (xCord > 0)) {
				if (Grid.getValue(xCord - 1, yCord - 1) == 0) {
					Solve(xCord - 1, yCord - 1);
				}
			}
			if ((xCord > 0) && (yCord < Grid.getSize() - 1)) {
				if (Grid.getValue(xCord - 1, yCord + 1) == 0) {
					Solve(xCord - 1, yCord + 1);
				}
			}
		}
	}

	public boolean hitBottom() {
		if (hitBottom > 0) {
			return true;
		} else {
			return false;
		}
	}
}