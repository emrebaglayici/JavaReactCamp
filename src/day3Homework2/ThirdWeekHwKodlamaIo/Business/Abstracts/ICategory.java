package day3Homework2.ThirdWeekHwKodlamaIo.Business.Abstracts;


public interface ICategory {
    boolean checkCategoryName(String categoryName);
    void addCategory(String name) throws Exception;

}