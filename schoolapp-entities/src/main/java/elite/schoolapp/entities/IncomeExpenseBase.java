package elite.schoolapp.entities;

public class IncomeExpenseBase extends Organization {

  private Long date;
  private Float amount;

  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }
}
