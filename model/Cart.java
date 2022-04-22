package ru.gbAleko.spring_lesson_3HW.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component()
public class Cart {

    private List<Product> cartLList;
    private ProductService productService;

    public Cart() {}

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @PostConstruct
    public void init() {
        cartLList = new ArrayList<>();
    }

    public void addProductIntoCart(long id) {
        cartLList.add(productService.getProduct(id));
    }

    public List<Product> showCartList() {
        return cartLList;
    }

    public void deleteProductFromCartList(Long id) {
        cartLList.removeIf(x -> x.getId().equals(id));
    }
}
