package javapacakageqa;

public class Getsetclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
customerdetails obj1= new customerdetails();
obj1.setname("Radha");
obj1.setaddress("Krishna street");
obj1.setsalary(20000);

System.out.println("The name of the customer is"+obj1.getname());
System.out.println("The adderss of the customer is"+obj1.getaddress());
System.out.println("The salary of the customer is"+obj1.getsalary());

	}

}

class customerdetails{
	private String name;
	private String address;
	private int salary;
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setaddress(String address)
	{
		this.address=address;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public String getname()
	{ return name;}
	public String getaddress()
	{ return address;}
	public int getsalary()
	{ return salary;}
	}

