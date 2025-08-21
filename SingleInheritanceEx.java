package Inheritance;

class Student
{
	String name = "John";
	int id = 101;
	
	void show() 
	{
		System.out.println("Parent class method is Executing!!");
		
	}
}
public class SingleInheritanceEx extends Student
{
	void display()
	{
		id=102;
		System.out.println("Name is :"+name+" Id is:"+id);
	}
	public static void main(String[] args)
	{
		SingleInheritanceEx obj = new SingleInheritanceEx();
		obj.display();
		obj.show();
		}

}
