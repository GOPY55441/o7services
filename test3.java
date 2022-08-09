//Q.1
//encapsulation:- In encapsulation,the value of the data member is hide from the other class,and that 
//member should be private so that no other class can use the that data memeber,but if the data memeber 
// is private we can acces the value by making a function that return the value of private data member,
// this situation is overcome by encapsulation by set a condition ,i.e if the condition is true only then
// user can acces the data member ,in the give example we set a password for the user that is if the userenter 
// the true password only then user can acces the value of private data member ,this process of hiding the 
// value is known as encapsulation.
/*
import java.util.Scanner;
class MyClass{
public static void main(String ar[])
{
You obj=new You();
Scanner sc=new Scanner(System.in);
System.out.println("enter the password");
int password=sc.nextInt();
System.out.println("the value of the variable is="+obj.method(password));
System.out.println("the value of the variable after modification is="+obj.set(password,54));
}

}
class You{
final int password=555;
private int a=43;
int method(int password)
{
if(this.password==password)
{
return a;
}
return 0;
}	
int set(int password,int b)      //if user enter worng password we return the value 0
{
if(this.password==password)
{
this.a=b;
return this.a;
}
return 0;
}

}*/

//Q.2
/*POLYMORPHISM:-Polymorphism means many forms,here we talked about methods means many forms of the
methods,but for the polymorphism inheritance must.there are two types of polymorphism 

1.overriding:-in this,the method has the same name and also same parameters/return, the example 
of overriding is given by the method  having name set in the below.

2.overloading:-in this, the method has the same name but having different parametrs/arguments ,in 
given example by method having same name set but by passing a parameter
/*
class You{
void set()
{
System.out.println("this is the set method in You class");
}

}
class MyClass extends You{                                    //inheritance must
	public static void main(String ar[])
	{
	MyClass obj=new MyClass();
	obj.set();
	obj.set(3);
	}
void set()                //overriding of method
{
super.set();
System.out.println("this is the set method in class MyClass");

}
void set(int a)           //overloading of method
{
System.out.println("value passed in this method is="+a);

}

}*/

//Q.3
/*
1.Acces specifier:-Acces specifier are the keywords used in the language,which state/define the 
accessibility of the classes,methods,and the data members.Means it defines the who can acces the
define the classes,methods,and the data members.There are four type of access specifier 
things refer to the classes,methods,and the data members
1.private:-the things which are defined with the keyword private ,can used only within the class only.
2.protected:-the things which are defined with the keyword private,can be used within the class,within the 
package and outside the package by sub classes.
3.public:- the things which are defined with the keyword public,can be used within the class,within the 
package and outside the package by child class and also outside the package and having no restrictiom
4.default:-the things are automatically declared default by compiler if we use no keyword.it can we accesed
by within class and within package only.

2.Packages:-Packages are just the folder in which we save our java files.The name of folder refers 
to the name of the package.We can use the two different java files at the same time if we used
keyword public.It depands upon the keyword which we are going to use.
To import packages in java ,the syntax is below:-
import package-name.class-name;

3.final keyword:-this keyword is used before the data member, which defines that the value of
thatdata member can not be changed throughout the program.
Syntax:-final data-type data-member-name=value;
e.g:-final int a=3;

*/

//Q.4
/*
class Rectangle{
static void area()
{
System.out.println("this is the area function");
}
static int length=12;
void circumference()
{
System.out.println("this is the circumference function");
}
int breadth=23;
}

class Shape extends Rectangle{
public static void main(String ar[])
{
Rectangle.area();
Shape obj=new Shape();
obj.circumference();
System.out.println("the length is ="+Rectangle.length);
System.out.println("the breadth is="+obj.breadth);

}

}
*/

//Q.5
/*

class Shape{
	public static void main(String ar[])
	{
	int a=4;
	for(int i=1;i<=a;i++)
	{
	for(int j=0;j<a-i;j++)
	{
	System.out.print(" ");
	}		
	for(int k=0;k<i;k++)
	{
		System.out.print("1");
	}
	System.out.println();
	}
	
	}
}
*/