package cl.sebastianrojo.jpalogistiqal.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sebastianrojo.jpalogistiqal.model.Product;
import cl.sebastianrojo.jpalogistiqal.repository.ProductRepository;
import cl.sebastianrojo.jpalogistiqal.vo.ProductVO;

/**
 * ProductService
 */
@Service
public class ProductService implements IService<ProductVO, Product> {

    @Autowired
    ProductRepository repository;

    private ProductVO vo;
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Override
    public ProductVO findAll() {
        vo = new ProductVO("Ha ocurrido un error", "101", new ArrayList<Product>());
		try {
			vo.setProducts((List<Product>)repository.findAll());
			vo.setMensaje(String.format("Se encontraton %d empleados", vo.getProducts().size()));
			vo.setCodigo("200");
		} catch (Exception e) {
			logger.error("EmpleadoService: findAll: " + e);
		}
		return vo;
    }

    @Override
    public ProductVO findById(Object id) {
        vo = new ProductVO("Ha ocurrido un error", "102", new ArrayList<Product>());
		try {
			vo.getProducts().add(repository.findById((Integer)id).get());
			vo.setMensaje(String.format("Se encontró al producto %s", vo.getProducts().get(0).getName()));
			vo.setCodigo("200");
		} catch (Exception e) {
			logger.error("ProductService: findById: " + e);
		}
		return vo;
    }

    @Override
    public ProductVO insert(Product entity) {
        vo = new ProductVO("Ha ocurrido un error", "103", new ArrayList<Product>());
		try {
			repository.save(entity);
			vo.setMensaje(String.format("El producto %s se insertó correctamente", entity.getName()));
			vo.setCodigo("200");
		} catch (Exception e) {
			logger.error("ProductService: insert: " + e);
		}
		return vo;
    }

    @Override
    public ProductVO update(Product entity) {
        vo = new ProductVO("Ha ocurrido un error", "104", new ArrayList<Product>());
		try {
			repository.save(entity);
			vo.setMensaje(String.format("El producto %s se actualizó correctamente", entity.getName()));
			vo.setCodigo("200");
		} catch (Exception e) {
			logger.error("ProductService: update: " + e);
		}
		return vo;
    }

    @Override
    public ProductVO delete(Product entity) {
        vo = new ProductVO("Ha ocurrido un error", "105", new ArrayList<Product>());
		try {
			repository.delete(entity);
			vo.setMensaje(String.format("El producto %s se eliminó correctamente", entity.getName()));
			vo.setCodigo("200");
		} catch (Exception e) {
			logger.error("ProductService: delete: " + e);
		}
		return vo;
    }

    

}