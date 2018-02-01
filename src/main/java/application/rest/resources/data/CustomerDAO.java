package application.rest.resources.data;

import java.util.ArrayList;

import application.rest.resources.data.Customer;

public class CustomerDAO {
	
	static ArrayList<CustomerDetails> CustomerResourceArray;
	
	public static ArrayList<CustomerDetails> getData()
	{
		CustomerResourceArray = new ArrayList<CustomerDetails>();
		
		CustomerDetails customer_00000001 = new CustomerDetails();
		customer_00000001.setCustomerId("00000001");
		customer_00000001.setFirstName("George");
		customer_00000001.setLastName("Wainwright");
		customer_00000001.setDateOfBirth("12/10/1965");
		customer_00000001.setEmailAddress("georgew@gmail.com");
		customer_00000001.setTelephoneNumber("07932189201");
		customer_00000001.setAddr1("10 Sycamore Drive");
		customer_00000001.setTown("Middletown");
		customer_00000001.setCounty("Middlesex");
		customer_00000001.setCountry("England");
		customer_00000001.setPostCode("MS10 4W3");
		
		CustomerResourceArray.add(customer_00000001);
		
		CustomerDetails customer_00000002 = new CustomerDetails();
		customer_00000002.setCustomerId("00000002");
		customer_00000002.setFirstName("Arthur");
		customer_00000002.setLastName("Blenkinsop");
		customer_00000002.setDateOfBirth("8/3/1939");
		customer_00000002.setEmailAddress("blenkinsopw@gmail.com");
		customer_00000002.setTelephoneNumber("04829142739");
		customer_00000002.setAddr1("87 Oak Avenue");
		customer_00000002.setTown("Manchester");
		customer_00000002.setCounty("Hants");
		customer_00000002.setCountry("England");
		customer_00000002.setPostCode("S065 83A");
		
		CustomerResourceArray.add(customer_00000002);
		
		CustomerDetails customer_00000003 = new CustomerDetails();
		customer_00000003.setCustomerId("00000003");
		customer_00000003.setFirstName("William");
		customer_00000003.setLastName("Green");
		customer_00000003.setDateOfBirth("20/6/1956");
		customer_00000003.setEmailAddress("billgreen@gmail.com");
		customer_00000003.setTelephoneNumber("09817209274");
		customer_00000003.setAddr1("39 Poplar View");
		customer_00000003.setTown("Wetherby");
		customer_00000003.setCounty("North Yorks");
		customer_00000003.setCountry("England");
		customer_00000003.setPostCode("LS1Z 12B");
		
		CustomerResourceArray.add(customer_00000003);
		
		CustomerDetails customer_00000004 = new CustomerDetails();
		customer_00000004.setCustomerId("00000004");
		customer_00000004.setFirstName("John");
		customer_00000004.setLastName("Smith");
		customer_00000004.setDateOfBirth("14/7/1968");
		customer_00000004.setEmailAddress("smithy@gmail.com");
		customer_00000004.setTelephoneNumber("12389130979");
		customer_00000004.setAddr1("1 Chestnut Avenue");
		customer_00000004.setTown("Newcastle");
		customer_00000004.setCounty("Tyne and Wear");
		customer_00000004.setCountry("England");
		customer_00000004.setPostCode("NE22 18V");
		
		CustomerResourceArray.add(customer_00000004);
		
		return CustomerResourceArray;
	}
}
