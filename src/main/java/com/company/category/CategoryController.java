package com.company.category;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/get-all-categories")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/get-category-by-id")
    public Category getById(@RequestBody Category category){
        return categoryService.getById(category);
    }

    @PostMapping("/create-category")
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }

    @PutMapping("/update-category")
    public Category update(@RequestBody Category category){
        return categoryService.update(category);
    }

    @DeleteMapping("/delete-book")
    public Category delete(@RequestBody Category category){
        return categoryService.delete(category);
    }
}


