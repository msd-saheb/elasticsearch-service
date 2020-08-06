package lets.code.es.now.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lets.code.es.now.model.Customer;
import lets.code.es.now.repository.CustomerRepo;

@RestController
public class Resource {

	// @Autowired
	// private CustomerService service;

	@Autowired
	private CustomerRepo repo;

	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<Customer> customer) {
		repo.saveAll(customer);
		return customer.size();
	}

	@GetMapping("/findAll")
	public Iterable<Customer> findAll() {
		return repo.findAll();
		// return Lists.newArrayList(repo.findAll());
	}

	@GetMapping("/findFname/{fname}")
	public List<Customer> findByFirstName(@PathVariable String fname) {
		return repo.findByFirstName(fname);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		repo.deleteById(id);
	}

	/*
	 * @GetMapping("/searchMulti/{fname}/{age}") public List<Customer>
	 * searchMultiField( @PathVariable("fname") String
	 * firstName,@PathVariable("age") int age) { return
	 * service.searchMultiField(firstName, age); }
	 * 
	 * @GetMapping("/customeSearch/{firstName}") public List<Customer>
	 * getCustomerSerachData(@PathVariable String firstName) { return
	 * service.getCustomerSerachData(firstName); }
	 * 
	 * @GetMapping("/search/{text}") public List<Customer>
	 * multiMatchQuery(@PathVariable String text) { return
	 * service.multiMatchQuery(text); }
	 */
}
