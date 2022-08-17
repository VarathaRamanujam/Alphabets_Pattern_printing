package My_Basic_programs;

 class GrandFather {
		public static void main(String[] args) {
			Son obj = new Son();
			GrandFather obj1 = new GrandFather();
			obj.GrandFather_Object();
			obj.GrandFather_Object();
			

		}

	 public void GrandFather_Object()
	 {
	   int row=1;
	   while(row<=5)
	    {
	      int col=1;
	      while(col<=5)
	     {
		 if(row==col || row+col==6) 
		 {	 
	     System.out.print("*");
	     }
	     else 
	     {
		  System.out.print(" "); 
	     }
		 col++;
	     }
	     System.out.println();
	     row++;
	   }   
	 }
 }

	 class Father extends GrandFather
	{
		public void Father_Object ()
		{	          
			 int a=1;
			 for(int row=1;row<=4;row++)
			{
				a=row;
				for(int col=1;col<=3;col++)
				{		 
				 System.out.print(a+" ");	
				 a=a+4;
				}
				System.out.println();
			}	 
		}
	}

	 class Son extends Father
	{ 		

		int a = 20;
			public void son_Object() {
			
			for(int row=1;row<=3;row++)
			{
				for(int col=1;col<=3;col++)
				{			     
				 System.out.print(a+"    ");	
				 a=a+2;
				}
				System.out.println();
			}
	}
	}






