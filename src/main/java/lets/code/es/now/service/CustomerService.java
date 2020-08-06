package lets.code.es.now.service;

import java.util.List;

import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import lets.code.es.now.model.Customer;

/*
public class CustomerService {
	
	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;
	
	
	public List<Customer> searchMultiField(String firstname, int age) {
		QueryBuilder query = QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("firstName", firstname))
				.must(QueryBuilders.matchQuery("age", age));
		NativeSearchQuery nativeSearchQuery = new NativeSearchQueryBuilder().withQuery(query).build();
		List<Customer> customers = elasticsearchTemplate.queryForList(nativeSearchQuery, Customer.class);
		return customers;
	}

	public List<Customer> getCustomerSerachData(String input) {
		String search = ".*" + input + ".*";
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withFilter(QueryBuilders.regexpQuery("firstName", search)).build();
		List<Customer> customers = elasticsearchTemplate.queryForList(searchQuery, Customer.class);
		return customers;

	}

	public List<Customer> multiMatchQuery(String text) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(QueryBuilders.multiMatchQuery(text)
				.field("firstName").field("lastName").type(MultiMatchQueryBuilder.Type.BEST_FIELDS)).build();
		List<Customer> customers = elasticsearchTemplate.queryForList(searchQuery, Customer.class);
		return customers;
	}

}
*/
