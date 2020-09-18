package ApiDemoPackage;
import javax.xml.ws.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import static org.hamcrest.Matchers.*;

import groovyjarjarasm.asm.commons.Method;
import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;

public class ApiDemoClass {
	
	public static void statusassertion()
	{

		 
		RestAssured.baseURI = "http://demo4032024.mockable.io/apitest";
		 String response=given().log().all().when().get().
		 then().
		 assertThat().
		 log().all().extract().response().asString();
		 
		 System.out.println("response of API is ------"+response);
		 JsonPath js=new JsonPath(response);
		 String Actualstatus=js.getString("status");
		
		 System.out.println(" Actual Status  is  "+Actualstatus);
		 String ExpectedStatus="200";
		
		 Assert.assertEquals(Actualstatus, ExpectedStatus);
		
		 
		 
		
		 }
	
	
	public static void employeedataAssertion()
	{
		RestAssured.baseURI = "http://demo4032024.mockable.io/apitest";
		 String response=given().log().all().when().get().
		 then().
		 assertThat().
		 log().all().extract().response().asString();
		 
		 System.out.println("response of API is ------"+response);
		 JsonPath js=new JsonPath(response);
		 String Actualstatus=js.getString("status");
		
		 System.out.println(" Actual Status is  "+Actualstatus);
		 String ExpectedStatus="200";
		
		 Assert.assertEquals(Actualstatus, ExpectedStatus);
		 
		 String ActualEmpAge=js.getString("employeeData.age");
		 System.out.println(" Actual employee age  is --"+ActualEmpAge);
		 String Expectedempage="["+"25"+"]";
		 Assert.assertEquals(ActualEmpAge, Expectedempage);
		 
		
		 String ActualEmprole=js.getString("employeeData.role");
		 System.out.println(" Actual role of employee is ---"+ActualEmprole);
		 String ExpectedEmprole="["+"QA Automation Developer"+"]";
		 Assert.assertEquals(ActualEmprole, ExpectedEmprole);
		 
		
		 String Actualdob=js.getString("employeeData.dob");
		 System.out.println("Actual dob of the employee is -----"+Actualdob);
		 String ExpectedDob="["+"25-02-1994"+"]";
		 Assert.assertEquals(Actualdob, ExpectedDob);
		 
		 
		
	}
	
	public static void employeeCompanyAssertion()
	{
		RestAssured.baseURI = "http://demo4032024.mockable.io/apitest";
		 String response=given().log().all().when().get().
		 then().
		 assertThat().
		 log().all().extract().response().asString();
		 
		 System.out.println("response of API is ------"+response);
		 JsonPath js=new JsonPath(response);
		 String ActualEmpCompany=js.getString("employeeData.company");
		
		 System.out.println(" Actual emp company  is  "+ActualEmpCompany);
		 String ExpectedEmpCompany="ABC infotech";
		
		 Assert.assertEquals(ActualEmpCompany, ExpectedEmpCompany);
	}
		

}
