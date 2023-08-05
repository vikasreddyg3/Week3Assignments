package Abstractionweek3day1assignment;

public class Automation extends MultipleLanguage implements Language,TestTool
{

	public void selenium() 
	{
		System.out.println("Selenium");
	}

	public void java() {
		
		System.out.println("Java language");
		
	}
	
	

	@Override
	public void ruby() {
		
		System.out.println("Ruby Language");
	}

	public static void main(String[] args) 
	{
		Automation obj=new Automation();
		obj.selenium();
		obj.java();
		obj.python();
		obj.ruby();
		
	}
	

}
