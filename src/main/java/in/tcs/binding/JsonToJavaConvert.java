package in.tcs.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConvert {
	public static void main(String[] args) throws Exception {
		File f = new File("D:/Customer.json");
		ObjectMapper obj = new ObjectMapper();
		Customer c = obj.readValue(f, Customer.class);
		System.out.println(c);

	}

}
