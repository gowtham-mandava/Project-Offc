package com.cg.paymentwallet.test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.paymentwallet.bean.CustomerBean;
import com.cg.paymentwallet.exception.CustomerException;
import com.cg.paymentwallet.service.CustomerServiceImpl;
import com.cg.paymentwallet.service.ICustomerService;
public class CustomerServiceImplTest {
	private static ICustomerService custService = null;

	@BeforeClass
	public static void createInstance() {
		custService = new CustomerServiceImpl();
	}

	@Test(expected = CustomerException.class)
	public void testMobileForLengthGreater() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("903011345445");
		boolean result = custService.mobileNumber(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testMobileForLengthLesser() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("90301134");
		boolean result = custService.mobileNumber(customer);
		assertFalse(result);
	}

	@Test(expected = CustomerException.class)
	public void testMobileForAlpha() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("abcd221");
		boolean result = custService.mobileNumber(customer);
		assertFalse(result);
	}
Test(expected = CustomerException.class)
	public void testMobileForSpecialCharacters() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("@#$%^^%");
		boolean result = custService.mobileNumber(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testMobileForNull() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber(null);
		boolean result = custService.mobileNumber(customer);
		assertFalse(result);
	}
	@Test(expected = CustomerException.class)
	public void testMobileForEmpty() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber(" ");
		boolean result = custService.mobileNumber(customer);
		assertFalse(result);
	}
	
	@Test
	public void testMobileNo()   {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("9030113454");
		boolean result=false;
		try {
			result = custService.mobileNumber(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("");
		}
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testFirstNameLengthLesser() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("xyz");
		boolean result = custService.firstName(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testFirstNameLengthGreater() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("efghijk");
		boolean result = custService.firstName(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testFirstNameNumeric() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("12345678");
		boolean result = custService.firstName(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testFirstNameNull() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber(null);
		boolean result = custService.firstName(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testLastNameLengthGreater() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("abcdef");
		boolean result = custService.lastName(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testLastNameLengthLesser() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("abc");
		boolean result = custService.lastName(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testLastNameNumeric() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("12345");
		boolean result = custService.lastName(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testLastNameNull() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber(null);
		boolean result = custService.lastName(customer);
		assertFalse(result);
	}
	
	Test(expected = CustomerException.class)
	public void testEmailIdPattern() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("1623512685281");
		boolean result = custService.emailId(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testEmailIdNull() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber(null);
		boolean result = custService.emailId(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testEmailIdNotNull() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("hai@hai");
		boolean result = custService.emailId(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testEmailId() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("hai@gmail.com");
		boolean result = custService.emailId(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testAddressNull() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber(null);
		boolean result = custService.address(customer);
		assertFalse(result);
	}
	Test(expected = CustomerException.class)
	public void testAddressNotNull() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setMobileNumber("Hyderabad");
		boolean result = custService.address(customer);
		assertFalse(result);
	}

}
