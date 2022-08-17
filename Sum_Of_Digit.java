package My_Basic_programs;
import java.util.*;
public class Sum_Of_Digit {

	public static void main(String[] args) {
		Sum_Of_Digit obj = new Sum_Of_Digit();
		
		//while(true) {
//		try (Scanner scan = new Scanner (System.in)) {
//			System.out.print("Enter a number 1st method : ");
//			obj.method_1(scan.nextInt());
//			System.out.print("Enter a number 2nd method : ");
//			obj.method_2(scan.nextInt());
//			System.out.print("Enter a number 3nd method : ");
//			obj.method_3(scan.nextInt());
//		//}
//		}
		obj.Sum_Of_Digit_Until_0(99);
	}


	private void Sum_Of_Digit_Until_0(int num) {
		int sum =0;
		for (int j =0;num>0;j++) {
		for (int i=1; num>0 ; i++) {
			sum = sum + num % 10;
			num = num / 10;
		}
		if (sum>9) {
			//System.out.println(sum);
			num = sum;
			sum=0;
		}	
	}System.out.println("Total is : "+sum);
	}
	
	
	
	
	
	
	
	
	
	
	


	private void method_1(int num) {
		int sum1 = 0;
		while (num>0 || sum1>9) {
			if (num ==0) {
				num = sum1;
				sum1=0;				
			}
			sum1 +=num%10;
			num/=10;
		}System.out.println(sum1);
		System.out.println();
		
	}

	
	private void method_2(long number) {
		long sum=0;
		for(int i=0;number >0;i++) {
			sum = sum+(number%10);
			number = number /10;
			 if(number ==0 && sum>=10){
				number = sum;
				sum=0;
			}
		}
		System.out.println(sum);
		System.out.println();
	}
	

	private void method_3(int number3) {
		int sum3=0;
		while(number3 >0) {
		for(int i=0;number3 >0;i++) {
			sum3 = sum3+(number3%10);
			number3 = number3 /10;
		}
		if(sum3>9) {
			number3=sum3;
			sum3=0;
		}
		}System.out.println(sum3);
		System.out.println();
	}
	
	

}
