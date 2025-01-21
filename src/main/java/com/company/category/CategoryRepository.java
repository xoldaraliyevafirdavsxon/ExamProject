package com.company.category;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryRepository {
    public List<Category> categoryList = new ArrayList<>();
}
