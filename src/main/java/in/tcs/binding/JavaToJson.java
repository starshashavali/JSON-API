package in.tcs.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {
	public static void main(String[] args) throws Exception{
		Customer c= new Customer();
		Address a= new Address();
		a.setCity("Hyd");
		a.setCountry("India");	
		
		c.setId(101);
		c.setName("Swamy");
		c.setEmail("java@gmail.com");
		c.setAddress(a);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("D:/Customer.json"), c);
		System.out.println("Java obj is converted successfully");
	}

}
