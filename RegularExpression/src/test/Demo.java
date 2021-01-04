package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo 
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("."); 
		Matcher m=p.matcher("i3 mohammad2 @shah#ruk5");
		while(m.find())
		{
			System.out.println(m.start()+"--->"+m.group());
		}
		
	}

}
