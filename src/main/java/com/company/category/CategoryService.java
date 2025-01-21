package com.company.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    long id = 1;

    public Category create(Category newCategory){
        Category category = new Category();
        category.setId(id++);
        category.setName(newCategory.getName());
        categoryRepository.categoryList.add(category);
        return category;
    }

    public List<Category> getAll(){
        return categoryRepository.categoryList;
    }

    public Category getById(Category newCategory){
            return categoryRepository
                    .categoryList
                    .stream()
                    .filter(u -> u.getId() == newCategory.getId())
                    .findAny()
                    .orElse(null);

    }

    public Category update(Category newCategory){
        Category category = new Category();
        category.setId(newCategory.getId());
        category.setName(newCategory.getName());
        return category;
    }

    public Category delete(Category newCategory){
        for (Category category : categoryRepository.categoryList){
            if (category.getId() == newCategory.getId()){
                categoryRepository.categoryList.remove(category);
            }
            throw new RuntimeException("Category not found!!!");
        }

        throw new RuntimeException("Category not found!!!");
    }



}
