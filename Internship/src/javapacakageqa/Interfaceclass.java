package javapacakageqa;
interface school
{
	String school="kamaraj";
	String student="Ram";
	int std= 5;
void schoolname();
void studentname();
	
}
public class Interfaceclass implements school{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
school aa=new Interfaceclass();
aa.schoolname();
aa.studentname();
	}
@Override
public void schoolname()
{
	System.out.println("The school "+school);
}
public void studentname()
{
	System.out.println("The student "+student);
}

}
