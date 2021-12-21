package br.com.luciano.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.luciano.fullstack.entity.Category;

@Transactional(propagation = Propagation.MANDATORY)
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
