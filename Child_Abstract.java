package My_Basic_programs;

public class Child_Abstract extends Parent_Abstracts {
	public static void main(String[] args) {
		Child_Abstract obj = new Child_Abstract();
		//obj.LCM_Method_1();
		//obj.LCM_Method_2();
		//obj.a=20; // we can't override the instance variable a.
		obj.GCM_Method();
		System.out.println(obj.a);
	}

	@Override
	void LCM_Method_1() {
		// This method only applicable in not common diviser for example 2,10 has a common diviser so it is not applicable . 
		int Lcm_num_1=5;
		int Lcm_num_2=7;
		int small=0;
		int fac_1=0;
		int fac_2=0;
		if(Lcm_num_1>Lcm_num_2) {
			small=Lcm_num_2;
		}else
			small=Lcm_num_1;
		
		for (int i=1;i<=small;i++) {
			if(Lcm_num_1%i==0) {
				fac_1=i;
			}
			if(Lcm_num_2%i==0) {
				fac_2=i;
			}
		}
		if(fac_1==1 && fac_2==1) {
			System.out.println("LCM is : "+ (Lcm_num_1* Lcm_num_2 ));
		}else if(fac_1==1) {
			System.out.println("LCM is : "+ (Lcm_num_1* fac_2 ));
		}else if (fac_2==1) {
			System.out.println("LCM is : "+ (Lcm_num_2* fac_1));
		}else 
			System.out.println("LCM is : "+ (fac_1* fac_2 ));	
	}

	@Override
	void LCM_Method_2() {
		// This method all type of lcm numbers are applicable
		int Lcm_num_1=5;
		int Lcm_num_2=15;
		int Large=0;		
		if(Lcm_num_1<Lcm_num_2) {
			Large=Lcm_num_2;
		}else
			Large=Lcm_num_1;
		
		while(true) {
			if(Large%Lcm_num_1==0 && Large%Lcm_num_2==0) {
				System.out.println("LCM is : "+Large);
				break;
			}
			Large++;
		}
		
	}

	@Override
	void GCM_Method() {
		int Lcm_num_1=7;
		int Lcm_num_2=255;
		int small=0;
		if(Lcm_num_1>Lcm_num_2) {
			small=Lcm_num_2;
		}else
			small=Lcm_num_1;
      
		while(true) {
			if(Lcm_num_1%small==0 && Lcm_num_2%small==0) {
				System.out.println("LCM is : "+small);
				break;
			}
			small--;
		}
	}

}
