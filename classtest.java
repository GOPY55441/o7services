//Q.1
//answer.1
/*
class MyClass{
	public static void main(String ar[])
	{
	 int age=19;
	 char name[12]="Gurpreet Singh";
    hobby();	
	}
	static void hobby()
	{
		System.out.println("Your name is ="+name);
		System.out.println("your age is="+age);
	}
}   */

//Q.2
//answer
/*
1.class name= MyClass,Test1
2.function name= myTest(),method1()
3.variable name=myTest,name
4.static variable=MY_CLASS,METHOD_1
*/


//Q.3
//answer
/* 1.)the .java file is created when we save our java code in the pc it cannot be run directly
if we want to run our file we need to compile it .
  after compiled the .java file another file is created which can be run directly without any
hindrance whose name is autodrive that is the name of the file is same as the class name in the 
code but with extension .class

2.)Yes,java is not complete OOPs programming language
  Because normally , we declare the varible in the code as
  data-type variable-name=value;
  As there is no object is created to store the value in the variable,beacuse OOPS works on the
basis of objects only ,as the name define object oriented programming language(OOPS)
but java provide the techniques to follos the OOPs concept for example we can store value in the 
using wraaper class

3.NR-WA example 
class work{
	public static void main(String ar[])
	{
	method(5);	
    }
static void method(int a)
{
	System.out.println("the value is " +a);
}
}

*/


//Q.4
//answer

class CalciWorking{
	public static void main(String ar[])
	{
	Calci.addy();
    Calci.subby();
    Calci obj=new Calci();
    Calci obj1=new Calci();
    obj.diviji();
    obj1.mull();   	
    }
}

class Calci{
	static void addy()
	{
		System.out.println("First method");
	}
	static void subby()
	{
		System.out.println("second method");
	}
	void diviji()
	{
		System.out.println("third method");
	}
	void mull()
	{
		System.out.println("fourth  method");
	}
}
//Q.5
//answer
/* Wrapper class
 Syntax of wrapper class:-datatype object-name =value;
note:-the first letter of the data type should be capital and others should remain small
for example we can use the name of Wrapper class as,
Integer,Float,Double,etc.
Wrapper classes are used to follow the concept of OOPs i.e objects,with the help of wrraper 
class we can store the value in the object of any data types this makes the java to follows 
the concept of OOPs
for instance 
Integer obj=12;
here, we make a wrapper class of integer data type with the object name as obj &we store the 
in the object as 12.We give the value by using objects which try to follow the OOPS concept
*/
 