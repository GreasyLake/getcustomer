package application.test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import junit.framework.TestCase;
import org.junit.Test;

public class CustomerResourceTest extends TestCase{
	
	@Test
	public void testCustomers() {
		
		when().
        get("http://localhost:9082/CustomerDetails/customers").
        then().
        statusCode(200).
        body("customers[0].customerId", equalTo("00000001"), 
             "customers[0].firstName", equalTo("George"),
             "customers[0].lastName", equalTo("Wainwright")
             );
	}
	
	@Test
	public void testCustomer_00000001() {
		
		when().
        get("http://localhost:9082/CustomerDetails/customers/00000001").
        then().
        statusCode(200).
        body("customerId", equalTo("00000001"), 
             "firstName", equalTo("George"),
             "lastName", equalTo("Wainwright"),
             "postCode", equalTo("MS10 4W3"),
             "telephoneNumber", equalTo("07932189201")
             );
	}

}
