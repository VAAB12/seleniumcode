package javapacakageqa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filenotfoundjava {
	public static void main(String[] args) throws IOException {
	try
	{
		 
		File f=new File("tz.txt");
		PrintWriter w=new PrintWriter(new FileWriter(f),true);
		w.println("hi hru");
		w.close();
		f.setReadOnly();
		PrintWriter z=new PrintWriter(new FileWriter("tz.txt"),true);
	z.println("hope best");}
	catch(FileNotFoundException exception)
	{System.out.println(exception.getMessage());}
}
}
