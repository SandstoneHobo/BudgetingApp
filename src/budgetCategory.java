public class BudgetCategory {
    public String _name;
    public int _percentage_share;

    BudgetCategory(String name, int perShare){
        _name=name;
        _percentage_share=perShare;
    }

    public void printTest(){
        IO.println("Hello World from category");
    }
}
