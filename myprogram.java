class Class1{
	public static void main(String ar[])
	{
	Class1 obj=new Class1();
	obj.method(5);
	
	
	}
//nr-na            //problem in no return and in no arguments
void method()
{
	System.out.println("this is the first method1");
}
//nr-wa
void method(int a)
{
System.out.println("this is the int a second function");
}
//wr-na
int method()
{
System.out.println("this is the third method");
return 10;
}
//wr-wa
int method(int a,int b)
{
System.out.println("this is the fourth method");
return 10;
}
	





}