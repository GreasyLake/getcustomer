package application.rest.resources;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import application.rest.resources.data.CustomerDAO;
import application.rest.resources.data.Customer;
import application.rest.resources.data.CustomerDetails;
import application.rest.resources.data.CustomerDetailsArray;
import application.rest.resources.data.CustomerArray;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
	
	/* ------------------------------------------------------------------------ */
	/* getCustomers                                                             */
	/*                                                                          */
	/* returns an instance of application.rest.resources.data.CustomerSet which */ 
	/* encapsulates a set of abbreviated customer details                       */
	/*                                                                          */
	/* ------------------------------------------------------------------------ */
	@GET
	@Path("/")
	public Response getCustomers() {		
		
		ArrayList<CustomerDetails> data = CustomerDAO.getData();
		
		// Create a CustomerArray object to return data
		CustomerArray customers = new CustomerArray();
		
		for (int i = 0; i < data.size(); i++)
		{
			Customer customer = new Customer();
			customer.setCustomerId(data.get(i).getCustomerId());
			customer.setFirstName((data.get(i).getFirstName()));
			customer.setLastName((data.get(i).getLastName()));
			
			System.out.println("adding customer : " + customer.getCustomerId());
			customers.getCustomers().add(customer);
		}
		
		return Response.ok(customers).build();
		
	}
	
	/* ------------------------------------------------------------------------ */
	/* getCustomerDetails                                                       */
	/*                                                                          */
	/* returns an instance of application.rest.resources.data.CustomerSet which */ 
	/* encapsulates a set of abbreviated customer details                       */
	/*                                                                          */
	/* ------------------------------------------------------------------------ */
	@GET
	@Path("/{id}")
	public Response getCustomerDetails(@PathParam(value="id") String id) {
		
		ArrayList<CustomerDetails> data = CustomerDAO.getData();
		
		CustomerDetails customerDetails = new CustomerDetails();
		
		for (int i = 0; i < data.size(); i++)
		{
			if (data.get(i).getCustomerId().equalsIgnoreCase(id)) {					
				
				customerDetails.setCustomerId(data.get(i).getCustomerId());
				customerDetails.setFirstName((data.get(i).getFirstName()));
				customerDetails.setLastName((data.get(i).getLastName()));
				customerDetails.setAddr1((data.get(i).getAddr1()));
				customerDetails.setTown((data.get(i).getTown()));
				customerDetails.setCounty((data.get(i).getCounty()));
				customerDetails.setCountry((data.get(i).getCountry()));
				customerDetails.setPostCode((data.get(i).getPostCode()));
				customerDetails.setDateOfBirth((data.get(i).getDateOfBirth()));
				customerDetails.setEmailAddress((data.get(i).getEmailAddress()));
				customerDetails.setTelephoneNumber((data.get(i).getTelephoneNumber()));
				
			}			
		}
		
		return Response.ok(customerDetails).build();
		
	}

}
