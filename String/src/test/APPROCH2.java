package test;

public class APPROCH2 
{
	private static APPROCH2 ap=null;
	private APPROCH2()
	{
		
	}
	public static APPROCH2 getAPPROACH2()
	{
		if(ap==null)
			ap=new APPROCH2();
		
		return ap;
	}

}
class test1
{
	public static void main(String[] args) 
	{
		APPROCH2 ap1=APPROCH2.getAPPROACH2();
		APPROCH2 ap2=APPROCH2.getAPPROACH2();
		APPROCH2 ap3=APPROCH2.getAPPROACH2();
		
	}
}
