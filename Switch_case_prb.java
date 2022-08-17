package My_Basic_programs;

import java.util.Scanner;

public class Switch_case_prb {

	public static void main(String[] args) {
		Switch_case_prb obj = new Switch_case_prb();
		while (true) {
		Scanner sc = new Scanner(System.in);
			System.out.println(obj.Switch_Case(sc.nextInt()));
		}
		}
	
	
	public String Switch_Case(int n) {
		String s =  "--It is even number";
		String l = "--It is odd number";
		int t = 0 ;
		{
		if(n%2==0) {
			t=0;
			//System.out.println(n+"--It is even number");
		}else if (n%2!=0) {
			t=1;
			//System.out.println(n+"--It is odd number");
		}}
		
		switch(t) {
		
		case (0):{
			return s ;
		}
		case (1):{
			return l;
		}
		default :{
			return "invalid";
		}
		
		}
	}

	

}
