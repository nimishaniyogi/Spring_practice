import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nimisha.repository.CustomerRepository;
import com.nimisha.repository.HibernateCustomerRepositoryImpl;
import com.nimisha.service.CustomerService;
import com.nimisha.service.CustomerServiceImpl;



///configuration annotation replace any xml file previously used. in this case ApplicataionContext. done at class level.
@Configuration

@ComponentScan({"com.nimisha"})
public class appConfig {
	

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	//bean anno is used method level.
	
	@Bean(name = "customerRepository")
		public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
	

}

