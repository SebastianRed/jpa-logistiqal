package cl.sebastianrojo.jpalogistiqal.vo;

import java.util.List;

import cl.sebastianrojo.jpalogistiqal.model.Product;

/**
 * ProductVO
 */
public class ProductVO extends GenericVO {

    List<Product> products;

    public ProductVO() {
    }

    public ProductVO(String mensaje, String codigo, List<Product> products) {
        super(mensaje, codigo);
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductVO [products=" + products + "]";
    }

}