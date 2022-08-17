package My_Basic_programs;

import java.util.Scanner;

public class Decimal_Binary_Sum_xor {

	public static void main(String[] args) {
		Decimal_Binary_Sum_xor obj = new Decimal_Binary_Sum_xor();
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.print("Enter a number : ");
		obj.Decimal_binary(scan.nextInt());	}
	}

	private void Decimal_binary(int num) {
		int n=12;
		int ls_1[] = new int[n];
		int ls_2[]=new int[ls_1.length];
		
		int j1=0;
		int num1=num;
		while (num1>0) {
			ls_1[j1]=num1%2;
			num1= num1/2;
			j1++;
		}  //  Given number to convert into binary
		// printing
//		for (int i=ls_1.length-1;i>=0;i--) {
//			System.out.print(ls_1[i]);
//		}System.out.println(" ");
	
		//looping 1 to given number
	int sum=0;
	for (int loop=0;loop<num;loop++) {
		int k=loop;
		//System.out.println(k);
			int j2=0;
			while (k>0) {
				ls_2[j2]=k%2;
				k= k/2;
				j2++;
			} 
		
		
		
		//printing the loop
//		for (int i=ls_1.length-1;i>=0;i--) {
//			System.out.print(ls_2[i]);
//		}System.out.println();
		
			//count the iteration
		int count =0;
		for (int i=ls_1.length-1;i>=0;i--) {
			if(ls_1[i]!=ls_2[i] || ls_1[i]+ls_2[i]==0) {
				count++;
			}
		}//System.out.println(count);
		
		//sum the divisible number
		if (count==n) {
			sum++;
		}
		
		
	}
	System.out.println("Total number is : "+sum);
	System.out.println();
	}

}
