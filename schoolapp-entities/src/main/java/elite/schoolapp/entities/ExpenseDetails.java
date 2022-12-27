package elite.schoolapp.entities;

public class ExpenseDetails extends IncomeExpenseBase {

  private String expenseFor;

  public String getExpenseFor() {
    return expenseFor;
  }

  public void setExpenseFor(String expenseFor) {
    this.expenseFor = expenseFor;
  }
}
