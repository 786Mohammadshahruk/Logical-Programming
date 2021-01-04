package Org.btm.test;

public class Sample implements Comparable 
{
	int id;
	String name;
	Double per;
	public Sample(int id,String name,Double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	@Override
	public int compareTo(Object o) 
	{
		Sample s=(Sample)o;
		return (this.id=s.id);
	}

}
