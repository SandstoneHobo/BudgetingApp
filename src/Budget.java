public class Budget {
    private BudgetCategory[] categories;
    private float total_budget;
    private float[] dollar_amounts;

    public void print_test(){
        IO.println("Hello World from budget");
        BudgetCategory my_category = new BudgetCategory("Food", 33);
        my_category.printTest();
    }

}
