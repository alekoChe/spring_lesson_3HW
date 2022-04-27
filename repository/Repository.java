package ru.gbAleko.spring_lesson_3HW.repository;

import org.springframework.stereotype.Component;
import ru.gbAleko.spring_lesson_3HW.model.Product;

@Component
public interface Repository {
    Product findById(Long id);
}
