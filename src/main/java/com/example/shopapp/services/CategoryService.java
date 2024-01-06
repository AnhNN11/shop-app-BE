package com.example.shopapp.services;

import com.example.shopapp.dtos.CategoryDTO;
import com.example.shopapp.models.Category;
import com.example.shopapp.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public Category createCategory(CategoryDTO categoryDTO) {

        Category newCategory= Category.builder().name(categoryDTO.getName()).build();
        return categoryRepository.save(newCategory);
    }

    @Override
    public Category getCategoryById(long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("CategoryRepository not found"));
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(long categoryId, CategoryDTO categoryDTO) {
        Category exitingCategory= getCategoryById(categoryId);
        exitingCategory.setName(categoryDTO.getName());
        categoryRepository.save(exitingCategory);
        return categoryRepository.save(exitingCategory);
    }

    @Override
    public void deleteCategory(long id) {
        //xóa cứng
         categoryRepository.deleteById(id);
    }
}
