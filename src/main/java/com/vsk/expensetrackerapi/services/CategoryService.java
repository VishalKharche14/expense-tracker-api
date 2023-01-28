package com.vsk.expensetrackerapi.services;

import com.vsk.expensetrackerapi.domain.Category;
import com.vsk.expensetrackerapi.exception.EtBadRequestException;
import com.vsk.expensetrackerapi.exception.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    Category addcategory(Integer userId, String title, String description) throws EtBadRequestException;
    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
