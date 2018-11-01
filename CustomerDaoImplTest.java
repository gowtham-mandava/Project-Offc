package com.cg.paymentwallet.test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.paymentwallet.bean.CustomerBean;
import com.cg.paymentwallet.dao.CustomerDaoImpl;
import com.cg.paymentwallet.dao.ICustomerDao;
public class CustomerDaoImplTest {
private static ICustomerDao customerDao=null;
@BeforeClass
public static void createInstance(){
	customerDao=new CustomerDaoImpl();
}

	@Test
	public void testshowBalanceForNotNull() {
	CustomerBean customer=new CustomerBean();
	customer.setBalance(101.0);
	double result=customerDao.showBalance(customer.getAccNum(),customer.getMobileNumber());
	assertNotSame(customer, customer.getBalance());
	}
	@Test
	public void testshowBalanceForNull() {
	CustomerBean customer=new CustomerBean();
	customer.setBalance(null);
	double result=customerDao.showBalance(customer.getAccNum(),customer.getMobileNumber());
	assertNotSame(customer, customer.getBalance());
	}

}
