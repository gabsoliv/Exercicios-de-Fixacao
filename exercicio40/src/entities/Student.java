package entities;

public class Student {

	public String name;
	public double trimestre01;
	public double trimestre02;
	public double trimestre03;

	public double pass() {
		return trimestre01 + trimestre02 + trimestre03;
	}

	public double failed() {
		if (pass() < 60.0) {

		return 60.0 - pass();

		} else {
			return 0.0;
		}
	}


}
