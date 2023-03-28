package javapacakageqa;

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
studentdetail aa= new studentdetail();
aa.students();
aa.course();

	}

}
abstract class person
{
	String name="padmavathi";
	String address="koil street";
	String course="Java";
	int fee=100;
	abstract void students();
	public void course()
	{
	System.out.println("selected course");
}
}
class studentdetail extends person
{@Override
	void students()
	{
	System.out.println("The name of the student = "+name);
	System.out.println("The address of the student = "+address);
	System.out.println("course selected ="+course);
	System.out.println("The fees of the course = "+fee);
	}
public void course()
{
	System.out.println("selected course"+course);

}
}