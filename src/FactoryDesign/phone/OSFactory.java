package FactoryDesign.phone;

public class OSFactory 
{
	public OS getInstance(String typeOfOs)
	{
		if(typeOfOs.equals("Open")) 
		{
			return new Android();
		}
		else if(typeOfOs.equals("Closed"))
		{
			return new IOS();
		}
		else
		{
			return new Windows();
		}
	}
}
