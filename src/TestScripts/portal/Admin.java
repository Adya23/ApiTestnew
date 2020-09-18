package TestScripts.portal;

import org.testng.annotations.Test;

import ApiDemoPackage.ApiDemoClass;

public class Admin {
	
	@Test(priority=1)
	public static void Test_1()
	{
		System.out.println("Status assertion started ------");
		ApiDemoClass.statusassertion();
		
	}
	@Test(priority=2)
	public static void Test_2()
	{
		System.out.println("Employee data assertion started-------");
	ApiDemoClass.employeedataAssertion();
	}
	@Test(priority=3)
	public static void Test_3()
	
	{
		System.out.println("Employee companyb assertion started-----");
	
	ApiDemoClass.employeeCompanyAssertion();
	

}
}
