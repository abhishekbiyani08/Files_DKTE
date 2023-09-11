import java.util.*;
class Employee
{
	String f_name,l_name;
	double salary;
	Employee()
	{
		f_name = "abc";
		l_name = "xyz ";
		salary = 0.0;
	}
	Employee(String first , String last , double sal)
	{
		f_name = first;
		l_name = last;
		if(sal > 0){
		salary = sal;
		}
		else{
		salary = 0.0;
		}
	}
	public void display()
	{
		System.out.println("\n\n");
		System.out.println("FIRST NAME :  "+f_name);
		System.out.println("LAST NAME  :  "+l_name);
		System.out.println("SALARY     :  "+salary);
		System.out.println("\n\n");
	}
}

class EmployeeTest
{
	public static void main(String args[])
	{
		String first,last;
		double sal;

		Scanner sc = new Scanner(System.in);
		System.out.println("For 1st Employee ");
		System.out.print("Enter First Name :  ");
		first = sc.next();
		System.out.print("Enter Last Name  :  ");
		last = sc.next();
		System.out.print("Enter Salary     :  ");
		sal = sc.nextDouble();
		Employee obj1 = new Employee(first,last,sal);

		System.out.println("For 2nd Employee");
		System.out.print("Enter First Name :  ");
		first = sc.next();
		System.out.print("Enter Last Name  :  ");
		last = sc.next();
		System.out.print("Enter Salary     :  ");
		sal = sc.nextDouble();
		Employee obj2 = new Employee( first,last,sal);


		System.out.println("For 1st Employee ");
		obj1.display();
		System.out.println("For 2nd Employee");
		obj2.display();
	}
}
