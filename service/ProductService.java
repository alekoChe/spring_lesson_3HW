package ru.gbAleko.spring_lesson_3HW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gbAleko.spring_lesson_3HW.model.Product;
import ru.gbAleko.spring_lesson_3HW.repository.ProductInMemoryRepository;
import ru.gbAleko.spring_lesson_3HW.repository.Repository;
import java.util.List;

@Component()
public class ProductService {

    @Autowired
    private ProductInMemoryRepository productInMemoryRepository;


    public Product getProductAccordingId(Long id){
        return productInMemoryRepository.findById(id);
    }

    public List<Product> getProductList() {
        return productInMemoryRepository.showProductList();
    }

}
