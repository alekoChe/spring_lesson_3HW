package ru.gbAleko.spring_lesson_3HW.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.gbAleko.spring_lesson_3HW.repository.ProductInMemoryRepository;
import ru.gbAleko.spring_lesson_3HW.service.ProductService;
import ru.gbAleko.spring_lesson_3HW.model.Product;

@Controller
public class MainController {

    @Autowired
    private ProductService productService;

    @GetMapping("/add")
    @ResponseBody
    public String add() {
        return "Hello!";
    }

    @GetMapping("/product/{id}")
    public String getTittle(Model model, @PathVariable Long id) {
        Product product = productService.getProductAccordingId(id);
        model.addAttribute("product", product);
        return "product_page";
    }


    @GetMapping("/products/all")
    public String getAllList(Model model) {
        model.addAttribute("products", productService.getProductList());
        return "products_info_page";
    }


}
