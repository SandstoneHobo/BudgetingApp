//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Budget my_budget = new Budget(10);
    my_budget.addCategory("Food", 50);
    my_budget.addCategory("Entertainment", 25);
    my_budget.printBudget();
    my_budget.addCategory("Rent", 30);
    my_budget.setTotalBudget(20);
    my_budget.printBudget();
}
