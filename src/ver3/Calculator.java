package ver3;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	
	private Map<String,Operator> operators = new HashMap();
	
	public double calculation(String key, double val1, double val2) {
		return operators.get(key).operate(val1, val2);
	}
	
	public void addOperator(String key,Operator operator) {
		operators.put(key, operator);
	}

}

class Plus implements Operator{

	@Override
	public double operate(double val1, double val2) {
		return val1 + val2;
	}	
}
class Minus implements Operator{

	@Override
	public double operate(double val1, double val2) {
		return val1 - val2;
	}	
}
class Multiplication implements Operator{

	@Override
	public double operate(double val1, double val2) {
		return val1 * val2;
	}	
}
class Division implements Operator{

	@Override
	public double operate(double val1, double val2) {
		return val1 / val2;
	}	
}

