package lets.code.es.now.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import lets.code.es.now.model.Customer;

public interface CustomerRepo extends ElasticsearchRepository<Customer, String> {

	List<Customer> findByFirstName(String firstName);
}
