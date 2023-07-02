package BuilderDesign.phone;

import BuilderDesign.PhoneBuilder;

public class Shop 
{
	public static void main(String[] args) 
	{
		Phone p = new PhoneBuilder().setOs("ios").setRam(3).setBattery(3300).getPhone();
		
		System.out.println(p);
	}
}
