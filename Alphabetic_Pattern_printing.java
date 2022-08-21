package My_Basic_programs;

public class Alphabetic_Pattern_printing {

	public static void main(String[] args) {
		Alphabetic_Pattern_printing obj = new Alphabetic_Pattern_printing();

		
		

		obj.A();
		obj.B();
		obj.C();
		obj.D();
		obj.E();
		obj.F();
		obj.G();
		obj.H();
		obj.I();
		obj.J();
		obj.K();
		obj.L();
		obj.M();
		obj.N();
		obj.O();
		obj.P();
		obj.Q();
		obj.R();
		obj.S();
		obj.T();
		obj.U();
		obj.V();
		obj.W();
		obj.X();
		obj.Y();
		obj.Z();

	}

	private void W() {
		System.out.println("*             *");
		for (int row =1 ;row <=7;row++) {
			for (int col =1;col<=5;col++) {
				if ((row ==1 && (col==1 || col==5)) || (col==3 && row==3) || (row==2 && (col==2 || col==4))) {
					System.out.print(" *");
				}else 
					System.out.print(" ");	
			}			for (int col =1;col<=5;col++) {
				if ((row ==1 && (col==1 || col==5)) || (col==3 && row==3) || (row==2 && (col==2 || col==4))) {
					System.out.print(" *");
				}else 
					System.out.print(" ");	
			}System.out.println();
				
			}
		}
	

	private void Q() {
		System.out.println("    * *");
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if ((col==3 && row==3)  || (col==3 && (row==2 || row==4)) || (col==4 && (row==1 || row==5))) {
					if (col==5) {
						System.out.print("*");
					}
					System.out.print("*    ");
				}else if ((col==5 && row==3)  || (col==5 && (row==2 || row==4)) || (col==3 && (row==1 || row==5))) {
					System.out.print(" *    ");
				} //else if (row==3 && col==2 || (row==3 && col==3)) {
//						System.out.print(" *    ");
//					
//				}
					else	
					System.out.print(" ");	
			}System.out.println();		
		}System.out.println("     * *  *");
		System.out.println("           * ");
		System.out.println();
		System.out.println();	}
	

	private void Y() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if ((row==1 && (col==1 || col==5)) ||(row ==2 && (col==2 || col==4)) || ( col==3  && (row==4 || row==5 || row ==3))) {
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void Z() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row +col==6 || ( row==1)|| row==5) {
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void X() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==col || ( row+col==6)) {
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void U() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if ((col==1 && (row ==1 || row==2 || row ==3))||(row==4 && (col==2 || col==4)) ||(col==5 && row==5) || (col==5 && (row ==1 || row==2 || row ==3) )) {
					System.out.print(" *  ");
				}else 
					System.out.print(" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void V() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if ((row ==1 && (col==1 || col==5)) || (col==3 && row==3) || (row==2 && (col==2 || col==4))) {
					System.out.print(" *");
				}else 
					System.out.print(" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void T() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==1 ||  col==3) {
					System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}
	

	private void S() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==1 || row==3 || row==5 || (col==1 && (row==2 || row==3)) || (col==5 && (row==4 || row==5)) ) {
					System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}
	

	private void R() {
		
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==3 || (row==1)  || col==1 || (col==5 && row ==2) ||(row==5 && col==3)|| (row ==4 && col==2)) {
		               if ((col==5 && (row ==1 || row ==3)) ) {
		            	   System.out.print("");	
		               }else
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}
		System.out.println("*    *");
		System.out.println();
		System.out.println();
	}

	private void P() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==3 || (row==1)  || col==1 || (col==5 && row ==2)) {
		               if ((col==5 && (row ==1 || row ==3)) ) {
		            	   System.out.print(" ");	
		               }else
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void O() {
		System.out.println("    * *");
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if ((col==3 && row==3)  || (col==3 && (row==2 || row==4)) || (col==4 && (row==1 || row==5))) {
					System.out.print("*    ");
				}else if ((col==5 && row==3)  || (col==5 && (row==2 || row==4)) || (col==3 && (row==1 || row==5))) {
					System.out.print(" *    ");
					
				}else	
					System.out.print(" ");	
			}System.out.println();		
		}System.out.println("     * *");
		System.out.println("        ");
		System.out.println();
		System.out.println();	}

	private void N() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (col ==5 || (row==col)  || col==1 ) {
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void M() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (col ==5 || (row==2 && col==2)  || col==1 || (row==3 && col==3) || (row==2&& col==4)) {
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void L() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==5  || col==1) {
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void K() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (  col==1 || (col==2 && (row==2 || row ==4)) ||(col==3 && (row ==1 || row ==5)) ) {
					System.out.print("* ");
				}else 
					System.out.print("   ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void J() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==5 || row==1  || col==3) {
					if (row==5 && (col==3 || col==4|| col==5)) {
						System.out.print("  ");
					}else
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void I() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==5 || row==1  || col==3) {
					System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void H() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (col ==5 || row==3  || col==1) {
					System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void G() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==1 || row==3 || row==5 || col==1 || (col==5 && row==4)) {
					if ((row==3 && col==2)||(col==1 && (row==1 || row ==5))|| (row==5 && col==5)) {
						System.out.print("  ");	
					}else		
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void F() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==1 || row==3  || col==1) {
					System.out.print("* ");
				}else 
					System.out.print("  ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void E() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row ==1 || row==3 || row==5 || col==1) {
					System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void D() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row==1 || col==1|| row ==5 || col==5) { 
					if( (row==1 && col==5) ||(row ==5 && col==5)) {
						
					}else
						System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void C() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row==1 || col==1|| row ==5) { 
						System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
		
	}

	private void B() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if (row==1 || col == 1 || col==5 || row ==3 || row ==5) {
					if ((row ==1 && col==5 ) || (row==5 && col==5)) {
						
					}else
						System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

	private void A() {
		for (int row=1;row<=5;row++) {
			for (int col =1;col<=5;col++) {
				if ((row==1 && col==3) || (row==4) || ((col==1 || col==5) && (row==3 ||row==4 ||row ==5)) || (row==2 && (col==2 || col==4)) ) {
					System.out.print("*"+" ");
				}else 
					System.out.print(" "+" ");	
			}System.out.println();
		}System.out.println();
		System.out.println();
	}

}
