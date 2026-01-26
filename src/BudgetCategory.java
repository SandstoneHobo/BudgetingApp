public class BudgetCategory {
    private String name;
    private int percentageShare;

    BudgetCategory(String categoryName, int categoryPercentage){
        setName(categoryName);
        setPercentageShare(categoryPercentage);
    }

    public void setName(String newName){
        if(isValidName(newName)){
            name = newName;
        }
        else {
            System.out.println("Invalid name");
        }
    }

    private boolean isValidName(String testName){
        return testName.matches("[a-zA-Z]+");
    }

    public void setPercentageShare(int newPercentage){
        if(newPercentage > 100 || newPercentage < 0){
            percentageShare = 0;
        }
        else{
            percentageShare = newPercentage;
        }
    }

    public String getName(){
        return name;
    }
    public int getPercentageShare(){ return percentageShare; }
}
