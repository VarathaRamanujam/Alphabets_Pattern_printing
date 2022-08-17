package My_Basic_programs;

public class Pattern_Printing {

	public static void main(String[] args) {
		Pattern_Printing obj = new Pattern_Printing();
		obj.pattern_prb();

	}
	
	// to be discuss 0001 0001 0001 0001, 1001 1001 1001 1001, 

	private void pattern_prb() {
		for (int i=4;i>0;i--) {
			
			int col1=1;
			while (col1 <=i) {
				 if (col1==i) {
					System.out.print(1+"   ");
				}else
					System.out.print("  ");
				col1++;
			}System.out.println();
		}
		
	}

}
