package Calculator;

import java.util.Scanner;

public class Subtraction {
	
	Scanner sc = new Scanner(System.in);
	
		public void minus () {
		System.out.print("숫자를 입력하세요 : ");
		long value1=sc.nextLong();
		System.out.print("뺄셈할 숫자를 입력하세요 : ");
		long value2=sc.nextLong();
		long value = value1-value2;
		if(value>=0) {
//		long value = value1-value2;
		System.out.println("값 : "+value);
		}else{
			System.out.println("값은 음수입니다");
		}
	}
}
