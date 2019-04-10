package javabase.operator_and_if;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
//		logicalOperator();
//		bitwiseOperators();
//		ternaryOperator();		
//		scanner();
//		selectionStructure_Switch();
		
	}

	/**
	 * Selection Structure switch_case
	 * Basic data types can accept byte,short,char,int and their wrapper classes
	 * Reference data types can accept enumeration,String
	 */
	public static void selectionStructure_Switch() {
		String name = "Jakie";
		String gender = "male";
		
		switch(gender) {
		case "male":
			System.out.println(name + " is a man");
			break;
		case "female":
			System.out.println(name + " is a woman");
			break;
		default:
			System.out.println(name + ",what are you gender?");
		}
	}

	/**
	 * Selection Structure
	 */
	public static void selectionStructure_If() {
		int age = 100;
		
		if(age >= 18 && age < 60) {
			System.out.println("access");
		}else if(age >= 60) {
			System.out.println("congratulation");
		}else
			System.out.println("unfortunately");
	}

	/**
	 * Sanner
	 * Scanner.close() ,method should be close in ending of main method
	 */
	public static void scanner() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("input an integer:");
		int s = sc.nextInt();	
		System.out.println(s);
	}

	/**
	 * Ternary Operator
	 */
	public static void ternaryOperator() {
		int x = 10;
		int y = 5;
		int z;
		z = (x > y) ? x : y;

		System.out.println("z = " + z);
	}

	/**
	 * Bitwise Operator
	 */
	public static void bitwiseOperators() {
		/*
		* &,|,^,~ ���÷�
		* &:��0��0
		* |:��1��1
		* ^:��ͬ��0����ͬ��1
		* ~:��λȡ��
		*/

		System.out.println(6 & 3);				//2
		System.out.println(6 | 3);				//7
		System.out.println(6 ^ 3);				//5	
		System.out.println(~6);
		
		/*
		*  <<:����	������λ�������ұ߲���0
		*  >>:����	���λ��0����߲���0;���Ϊ��1����߲���1
		*  >>>:�޷������� �������λ��0����1����߲���0
		*  ����Ч�ʵ����2 * 8�Ľ��
		*/

		//����,�����ƶ���λ���ǳ���2�ļ�����
		System.out.println(12 << 1);		//24
		System.out.println(12 << 2);		//48


		//����Ч�ʵ����2 * 8�Ľ��
		System.out.println(2 << 3);
	}

	/**
	 * Logical Operators 
	 */
	public static void logicalOperator() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a < b & b < c);	//true & true = true
		System.out.println(a < b & b > c);	//true & false = false
		System.out.println(a > b & b < c);	//false & true = false
		System.out.println(a > b & b > c);	//false & false = false

		System.out.println(a < b | b < c);	//true | true = true
		System.out.println(a < b | b > c);	//true | false = true
		System.out.println(a > b | b < c);	//false | true = true
		System.out.println(a > b | b > c);	//false | flase = false

		System.out.println(a < b ^ b < c);	//true | true = fals
		System.out.println(a < b ^ b > c);	//true | false = true
		System.out.println(a > b ^ b < c);	//false | true = true
		System.out.println(a > b ^ b > c);	//false | flase = false

		System.out.println(!true);
		System.out.println(!!true);
		
		System.out.println(a < b && b < c);				//true && true = true
		System.out.println(a < b && b > c);				//true && false = false
		System.out.println(a > b && b < c);				//false && true = false
		System.out.println(a > b && b > c);				//false && false = false

		int x = 3;
		int y = 4;
		System.out.println((++x == 3) & (++y == 4));	//false & false = false
		System.out.println("x = " + x);					//x = 4
		System.out.println("y = " + y);					//y = 5
		System.out.println("---------------------------");
		System.out.println((++x == 3) && (++y == 4));	//false & false = false
		System.out.println("x = " + x);					//x = 4
		System.out.println("y = " + y);					//y = 4
	}

}
