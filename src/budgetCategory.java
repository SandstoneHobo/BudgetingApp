public class BudgetCategory {
    private String name;
    public int percentageShare;

    BudgetCategory(String categoryName, int categoryPercentage){
        changeName(categoryName);
        percentageShare=categoryPercentage;
    }

    public void changeName(String newName){
        if(isValidName(newName)){
            name = newName;
        }
        else {
            IO.println("Invalid name");
        }
    }

    private boolean isValidName(String testName){
        return testName.matches("[a-zA-Z]+");
    }

    public String getName(){
        return name;
    }
}
