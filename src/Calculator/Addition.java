package Calculator;

import java.util.Scanner;

public class Addition {

	Scanner sc = new Scanner(System.in);
	
		public void puls () {
		System.out.print("숫자를 입력하세요 : ");
		long value1=sc.nextLong();
		System.out.print("덧셈할 숫자를 입력하세요 : ");
		long value2=sc.nextLong();		
		long value = value1+value2;
		System.out.println("값 : "+value);

		
	}
	

}
