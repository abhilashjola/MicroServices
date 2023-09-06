package practise;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int result=0;
		while(true) {
			System.out.println("Enter a number to sum");
			int a = sc.nextInt();
			System.out.println("Enter 1 to submit, 2 to add more");
			int res = sc.nextInt();
			if(res==1) {
				result+=a;
				break;
			}
			else {
				result+=a;
				continue;
			}
		}
		System.out.println(result);
	}
}
