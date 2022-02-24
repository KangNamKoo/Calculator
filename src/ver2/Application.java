package ver2;

import java.util.Scanner;

public class Application {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		Calculator calculator = new MyCalculator();
		
		while(true) {
			System.out.print("첫 번째 숫자를 입력하세요 : ");
			double val1 = sc.nextDouble();
			
			System.out.print("\n연산자를 입력하세요 : ");
			String operator = sc.next();
			
			System.out.print("\n두 번째 숫자를 입력하세요 : ");
			double val2 = sc.nextDouble();
			
			double val = calculator.calculation(val1, operator, val2);
			System.out.println("결과 : "+val);
			System.out.println();
		}

	}

}

