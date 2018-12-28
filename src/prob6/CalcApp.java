package prob6;

import java.util.Scanner;


/*
 * Add, Sub, Mul, Div 
 * 
 * int a
   int b
   void setValue(int a, int b)
   int calculate()

 * */
public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();

			/*  코드를 완성 합니다 */
			if(expression.equals("quit")) break;
			
			String []tokens=expression.split(" ");
			int num1=Integer.parseInt(tokens[0]);
			String op=tokens[1];
			int num2=Integer.parseInt(tokens[2]);
			int sum=0;
			switch(op) {
			case "+": Add add=new Add(); 
					 add.setValue(num1, num2); 
					 sum=add.calculate();break;
			case "-": Sub sub=new Sub();
					 sub.setValue(num1, num2);
					 sum=sub.calculate();break;
			case "/": Div div=new Div();
			 		 div.setValue(num1, num2);
			 		 sum=div.calculate();break;
			case "*": Mul mul=new Mul();
					 mul.setValue(num1, num2); 
					 sum=mul.calculate(); break;
			default:System.out.println("없는 기호 입니다."); continue;
			}
			
			System.out.println(">> "+sum);
			
		}
	}
}
