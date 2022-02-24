package ver3;

import java.util.Scanner;

public interface Application {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.addOperator("+", new Plus());
		calculator.addOperator("-", new Minus());
		calculator.addOperator("*", new Multiplication());
		calculator.addOperator("/", new Division());
		
		while(true) {
			System.out.print("첫 번째 숫자를 입력하세요 : ");
			double val1 = sc.nextDouble();
			
			System.out.print("\n연산자를 입력하세요 : ");
			String operator = sc.next();
			
			System.out.print("\n두 번째 숫자를 입력하세요 : ");
			double val2 = sc.nextDouble();
			
			double val = calculator.calculation(operator, val1, val2);
			System.out.println("결과 : "+val);
			System.out.println();
		}
		
		
	}

}
