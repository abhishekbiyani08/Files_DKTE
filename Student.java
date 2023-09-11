class Student
{
	int id;
	String name;
	Student(int i, String n)
	{
		id=i;
		name =n;
	}
	Student(Student s1)
	{
		id=s1.id;
		name=s1.name;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Student s1=new Student(1,"Abhishek");
		Student s2=new Student(s1);
		s1.show();
		s2.show();
	}
}