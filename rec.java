/*Q.1

import java.util.Scanner;
class MyClass{
	public static void main(String ar[])
	{
	int a;
	System.out.println("eneter a number");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    if(a%2==0)
	{
    System.out.println("the no. is even");
	}
    else
	{
    System.out.println("the no. is odd");
	}	



	
	
	}
}*/

// Q.2
/*
import java.util.Scanner;
class MyClass{
	public static void main(String ar[])
	{
	int a;
	System.out.println("eneter a number");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    if(a>55)
	{
		System.out.println("the no. is greater than 55");
	}
	else
	{
		System.out.println("the no. is less than 55");
	}
	}
}
*/
//Q.3
/*
import java.util.Scanner;
class MyClass{
	public static void main(String ar[])
	{
	int a,b;
	System.out.println("eneter a number");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
	System.out.println("enter the second number");
	b=obj.nextInt();
	if(a==b)
	{
		System.out.println("both the numbers are equal");
	}
	else
    {
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else{
		System.out.println("a is less than b");
		}
	}
	}
}
*/

//Q.4
/*
import java.util.Scanner;
class MyClass{
	public static void main(String ar[])
	{
     int a;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("enter the roll no.");
	 a=obj.nextInt();
	 switch(a)
	 {
		 case 579:
		 {
		 System.out.println("sonu's Rollno");
		 break;
		 }
	     case 546:
		 {
		 System.out.println("Monu's Rollno");
		 break;
		 }
		 case 553:
		 {
		 System.out.println("Manu's Rollno");
		 break;
		 }
		 case 544:
		 {
		 System.out.println("Meenu's Rollno");
	     break;
		 }
		 case 516:
		 {
			System.out.println("Meena's Rollno");
         break;		
		}
	     default:
		 {
			 System.out.println("Message not Allowed");
		 }
	 }
	 }
}
*/
//Q.5
/*Pass by Value means there is a no modification in the orignal Value while in the pass by reference there is modification
done in the orignal value while passing a value.Another we can say that in pass by value the origanal value is not
passed means the copy of that value is passed to the called variable.And in pass by reference the orignal value is 
the passed to the called variable.
But in java only pass by value exist,and there is no exist pass by reference.
E.g:-
pass by value
*/
/*
class MyClass{
	public static void main(String ar[])
	{
		int a=12;
		int b=a;
		System.out.println("the value of a is ="+a);     //here we can say that the value of b not changed
 		System.out.println("the value of b is ="+b);   //after changing the value of a because the copy of the  
		a=23;                                          //value a is  assigned to the b ,not orignal
		System.out.println("the value of a after modification is ="+a);
		System.out.println("the value of b after modification of a is ="+b);
	}
}
*/
//But if we talk about the objects then it seems to be pass by reference but actually there is pass by value at 
//the back end
/*
class MyClass{
public static void main(String ar[])
{
You obj=new You();

System.out.println("the value of c is ="+obj.c);
obj.c=45;
System.out.println("the value of c after modification is ="+obj.c);
You.method();

}
}
class You{
static int c=12;
static void method()
{
	System.out.println("the value of c in the class You is ="+c);
}
}*/
/*it could be like that the orignal value of object obj is passsed ,so that the value of obj changes in the second class
but it is not true that is the object passed the copy of the id of the itself,but we change the value of variable
c the compiler changes the value through id of object but this id point to the that variable,actually at the back
end the pass by value occues that is only copy of the id of the object is passed.
*/

//Q.6

/*import java.util.Scanner;
class MyClass{
	public static void main(String ar[])
	{
	System.out.println("eneter the no i.e the no of times you want to executed loop");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=1;i<=a;i++)
	{
		System.out.println(i);
	
	}
}
}
*/
//Q.7
/*
import java.util.Scanner;
import java.util.ArrayList;
class MyClass{
	public static void main(String ar[])
	{
	System.out.println("eneter the size of the array");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	ArrayList<Integer> obj=new ArrayList<Integer>();
	System.out.print("eneter the elements in the array ="); 
	for(int i=0;i<a;i++)
	{
		obj.add(sc.nextInt());
	}
	for(int i:obj)
	{
		System.out.println("the values in the array is ="+i);
	}
	}
}
*/

//Q.8
/*
class MyClass{
	public static void main(String ar[])
	{
		int a=3;
		int c=1;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=a+1;j++)
			{
				System.out.print(c);
			if(c%2==0)
			{
				c++;
			}
			else if(c%2!=0)
			{
			c--;
			}
			}
			
			
			System.out.println();
		}
	}
}

*/