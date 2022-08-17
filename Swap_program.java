package My_Basic_programs;

public class Swap_program {

	public static void main(String[] args) {
		Swap_program obj = new Swap_program();
		obj.swap();
		obj.swaping(9,7);
        obj.swaped();
        obj.swaps(1,2,3);
        obj.add();
        obj.multi(5, 6);
	}
		
		private void swap() {
	        int temp=0;
	        int a=5,b=7;
	        temp = a;
	        a=b;
	        b=temp;
	        System.out.println("after swaping :"+a+" "+b); 
		}

		private int add() {
			int l=6,m=9;
	        int h = l+m;
	        return h;
		}
		
        public int multi(int e,int f){
        int g = e*f;
        return g; }

        public void swaping(int c, int d){
        c=d+c;
        d=c-d;
        c=c-d; 
        System.out.println("after swaping :"+c+" "+d);}
        //System.out.println("after swaping :"+c+" "+d);}
        
        public void swaped(){
        int a=5,b=9,c=7,temp=0;
        temp =a;
        a=b;
        b=c;
        c=a;
        System.out.println("after swaping :"+a+" "+b+" "+c+" ");}

        public void swaps(int a , int b, int c){
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("after swaping :"+a+" "+b+" "+c+" ");}



 // public static void main(String[] args){
  

 // System.out.println(obj.add());

 // System.out.println(obj.multi(4,3));
	}



