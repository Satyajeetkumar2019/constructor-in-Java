class SuperClass {
SuperClass(){
this(12);
System.out.println("super class no param ");
}//end consts
SuperClass(int i){
this("asb");
System.out.println("super class int param ");
}//end super
SuperClass(String d){
	System.out.println("Super class string classs");
}//end super
}//end class

class SubClass extends SuperClass{
SubClass(){
	this(12);
	System.out.println("sub class no param ");
}//end SubClass
SubClass(int s){
this("asd");
System.out.println("sub class int param ");
}//end SubClass
SubClass(String s){
System.out.println("sub class String param ");
}//sub SubClass
}
class Test_sub_superCloass {
	public static void main(String[] args) {
     new SubClass();
	 System.out.println();
	 new SubClass(98);
	 System.out.println();
	 new SubClass("sfdd");
		System.out.println("Hello World!");
	}//end mm
}//end class
