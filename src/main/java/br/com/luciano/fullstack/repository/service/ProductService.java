package br.com.luciano.fullstack.repository.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.luciano.fullstack.entity.Product;
import br.com.luciano.fullstack.repository.ProductRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product findById(Long id) {
		
		Optional<Product> optional = repository.findById(id);
		return optional.get();
	}
	
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	
	public Product save(Product product) {

		return repository.save(product);
	}
	
	public Product update(Product product, Long id) {
		product.setId(id);
		return repository.save(product);
	}
	
	public void deleteById(Long id) {
		
		repository.deleteById(id);
	}

}
