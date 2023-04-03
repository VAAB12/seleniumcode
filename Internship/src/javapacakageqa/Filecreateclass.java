package javapacakageqa;

import java.io.FileWriter;
import java.io.IOException;

public class Filecreateclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String a="India is rich in good values and smart minds";
FileWriter rightt=new FileWriter("C:\\Users\\balaji.govindarajan\\Documents\\testtesxe.txt");
for(int u=0;u<a.length();u++)
{rightt.write(a.charAt(u));
	}
rightt.close();
}}
