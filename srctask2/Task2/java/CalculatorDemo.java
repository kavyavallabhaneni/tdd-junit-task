package Task2.java;
import java.util.Scanner;
public class CalculatorDemo {
	public static void main(String[] args) {
		int operand1,operand2,result = 0;
		Scanner sc=new Scanner(System.in);
		operand1=sc.nextInt();
		operand2=sc.nextInt();
		Calculator calci=new Calculator();
		System.out.println("enter the operation to be performed as either + or - or * ");
		char operator=(char) sc.nextInt();
		switch(operator)
		{
		case '+': result=calci.addition(operand1,operand2);break;
		case '-': result=calci.substraction(operand1,operand2);break;
		case '*': result=calci.multiplication(operand1, operand2);break;
			
		}
		System.err.println(result);
	}
}
