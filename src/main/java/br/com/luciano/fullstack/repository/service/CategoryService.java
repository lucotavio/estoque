package br.com.luciano.fullstack.repository.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.luciano.fullstack.entity.Category;
import br.com.luciano.fullstack.repository.CategoryRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category findById(Long id) {
		
		Optional<Category> optional = repository.findById(id);
		return optional.get();
	}
	
	public List<Category> findAll(){
		
		return repository.findAll();
	}
	
	public Category save(Category category) {
		
		return repository.save(category);
	}
	
	public Category update(Category category, Long id) {
		
		category.setId(id);
		return repository.save(category);	
	}
	
	public void deleteById(Long id) {
		
		repository.deleteById(id);
	}

}
