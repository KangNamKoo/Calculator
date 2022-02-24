package ver2;

public abstract class Calculator {

	public double calculation(double val1, String operator, double val2) {
		
		//계산을 결정하는 역할
		switch(operator) {
			case "+":
				return plus(val1,val2);
			case "-":
				return minus(val1,val2);
			case "*":
				return multiplication(val1,val2);
			case "/":
				return division(val1,val2);
			default:
				throw new IllegalArgumentException("연산자를 찾을 수 없습니다.");
							
		}
		
	}
	//실제 계산하는 역할들
	public abstract double plus(double val1, double val2);
	public abstract double minus(double val1, double val2);
	public abstract double multiplication(double val1, double val2);
	public abstract double division(double val1, double val2);
	
}
