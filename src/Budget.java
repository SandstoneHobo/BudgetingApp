/*
* In this class,
* leftover budget is stored in the last index of the categories array.
* Percentages are stored as integers
* */
public class Budget {
    private BudgetCategory[] categories;
    private float totalBudget;
    private float[] dollarAmounts;

    Budget(float budgetLimit){
        totalBudget = budgetLimit;
        categories = new BudgetCategory[1];
        dollarAmounts = new float[1];
        updateBudget();
    }

    public void updateBudget(){
        calculateLeftovers();
        calculateDollarAmounts();
    }

    public void calculateLeftovers(){
        if(categories.length == 1){
            categories[0] = new BudgetCategory("Other", 100);
            dollarAmounts[0] = totalBudget;
        }
        else{
            int total_percentage = 100;
            for(int i = 0; i < categories.length - 1; i++){
                total_percentage = total_percentage - categories[i].percentageShare;
            }
            categories[categories.length - 1].percentageShare = total_percentage;
        }
    }

    public void calculateDollarAmounts(){
        for(int i = 0; i < categories.length; i++){
            float percentage = categories[i].percentageShare / 100.0f;
            dollarAmounts[i] = percentage * totalBudget;
        }
    }

    public void printBudget(){
        for(int i = 0; i < categories.length; i++){
            String output = "Category %s : $%.2f";
            IO.println(String.format(output, categories[i].name, dollarAmounts[i]));
        }
    }

    public void addCategory(String categoryName, int categoryPercentage){
        if(categoryPercentage > categories[categories.length - 1].percentageShare){
            IO.println("Not enough percentage left for this category");
            return;
        }

        BudgetCategory[] newCategories = new BudgetCategory[categories.length + 1];
        float[] newDollarAmounts = new float[dollarAmounts.length + 1];

        newCategories[0] = new BudgetCategory(categoryName, categoryPercentage);
        newDollarAmounts[0] = categoryPercentage * totalBudget;

        for(int i = 1; i < newCategories.length; i++){
            newCategories[i] = categories[i-1];
            newDollarAmounts[i] = dollarAmounts[i-1];
        }
        categories = newCategories;
        dollarAmounts = newDollarAmounts;
        updateBudget();
    }

}
