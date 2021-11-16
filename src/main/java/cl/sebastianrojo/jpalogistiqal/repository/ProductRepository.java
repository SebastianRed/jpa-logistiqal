package cl.sebastianrojo.jpalogistiqal.repository;


import org.springframework.data.repository.CrudRepository;

import cl.sebastianrojo.jpalogistiqal.model.Product;

/**
 * ProductRepository
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

}