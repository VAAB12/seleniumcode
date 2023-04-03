package javapacakageqa;

public class Methodclass {
	String name;
	String sex;
	String address;
	int salary;
	void salaryincome(int salary,String name)
	{
		System.out.println("The salary of the customer "+name+" is "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodclass obj1=new Methodclass();
obj1.salaryincome(20000,"andal");
Methodclass obj2=new Methodclass();
obj2.salaryincome(30000,"kannan");
Methodclass obj3=new Methodclass();
obj3.salaryincome(22000,"radha");
Methodclass obj4=new Methodclass();
obj4.salaryincome(10000,"lakshmi");


	}

}
