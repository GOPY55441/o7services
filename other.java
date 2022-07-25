class YourClass{
public static void main(String ar[])     // how to know the id of the object of the class
{
YourClass obj=new YourClass();   // you can check it on the copy
YourClass obj1=new YourClass();
obj.method();
System.out.println("the id of obj is " +obj);
System.out.println("the id of 2nd obj is " +obj1);
}
void method()
{
int objn;
System.out.println("the id of this is  " +this);


}
}