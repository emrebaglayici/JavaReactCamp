package day3Homework2.ThirdWeekHwKodlamaIo.Business.Concretes;

import day3Homework2.ThirdWeekHwKodlamaIo.Business.Abstracts.ICategory;
import day3Homework2.ThirdWeekHwKodlamaIo.Entities.Category;
import day3Homework2.ThirdWeekHwKodlamaIo.Logger.LoggerManager;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements ICategory{
    private LoggerManager loggerManager=new LoggerManager();

    private List<Category> categories=new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public boolean checkCategoryName(String categoryName) {
        for (Category data:getCategories()){
            if (data.getName().equals(categoryName))
                return false;
        }
        return true;
    }


    @Override
    public Category listCategories() {
        for (Category data:getCategories()){
            return data;
        }
        return null;
    }

    @Override
    public void addCategory(String name) throws Exception {
        if (getCategories().isEmpty()){
            Category category=new Category(name);
            categories.add(category);
            loggerManager.printLog("Category added.");
        }else{
            if (!checkCategoryName(name)){
                throw new Exception("Category name cannot repeat");
            }else{
                Category category=new Category(name);
                categories.add(category);
                loggerManager.printLog("Category added.");
            }
        }

    }
}
