package ver2;

public class MyCalculator extends Calculator  {

	@Override
	public double plus(double val1, double val2) {
		return val1+val2;
	}

	@Override
	public double minus(double val1, double val2) {
		return val1-val2;
	}

	@Override
	public double multiplication(double val1, double val2) {
		return val1*val2;
	}

	@Override
	public double division(double val1, double val2) {
		return val1/val2;
	}

}
