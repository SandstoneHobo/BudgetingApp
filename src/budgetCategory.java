public class BudgetCategory {
    public String name;
    public int percentageShare;

    BudgetCategory(String categoryName, int categoryPercentage){
        name=categoryName;
        percentageShare=categoryPercentage;
    }

    public void printTest(){
        IO.println("Hello World from category");
    }
}
