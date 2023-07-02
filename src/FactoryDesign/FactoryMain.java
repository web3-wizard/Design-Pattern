package FactoryDesign;

import FactoryDesign.phone.OS;
import FactoryDesign.phone.OSFactory;

public class FactoryMain {
	
	public static void main(String[] args) 
	{
		System.out.println("Hello Design Pattern");
		
		OSFactory osf = new OSFactory();
		OS obj = osf.getInstance("wired");
		obj.spec();
	}

}
