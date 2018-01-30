package application.rest.resources.data;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerDetailsArray {
	
	@XmlElement
	ArrayList<CustomerDetails> customerDetails = new ArrayList<CustomerDetails>();

	public ArrayList<CustomerDetails> getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(ArrayList<CustomerDetails> customerDetails) {
		this.customerDetails = customerDetails;
	}

}
