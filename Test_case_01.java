class Example{
int x=m1();
int m1(){
System.out.println("M1.x");
return 10;
}//end m1

	{
	System.out.println("BSB");
	}//end NSB

Example(){
this(5);
System.out.println("no argument");
this.x=50;
}//end non type

Example(int s){
this("s");
System.out.println("int ");
this.x=60;
}//end int 
Example(String s){
System.out.println("String ");
this.x=70;
}//end string 
}//end class
class Test_case_01 {
	public static void main(String[] args) {
	
Example e1=new Example();
  System.out.println(e1.x);
System.out.println();
Example e2=new Example(7);
System.out.println(e2.x);
System.out.println();
Example e3=new Example("s");
System.out.println(e3.x);

		//System.out.println("Hello World!");
	}//end mm
}//end class
