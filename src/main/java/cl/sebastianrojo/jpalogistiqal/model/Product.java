package cl.sebastianrojo.jpalogistiqal.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Product
 */
@Entity
public class Product {

    @Id
    private Integer code;
    private String name;
    private Integer price;
    private Integer stock;

    public Product() {
    }

    public Product(Integer code, String name, Integer price, Integer stock) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [code=" + code + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }
    
}