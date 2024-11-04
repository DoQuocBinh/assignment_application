package database;

public class ExpenseEntity {
    public int id;
    public String expenseName;
    public String expenseDate;
    public String expenseType;
    public String amount;

    public ExpenseEntity() {

    }

    public ExpenseEntity(int id, String expenseName, String expenseDate, String expenseType, String amount) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseDate = expenseDate;
        this.expenseType = expenseType;
        this.amount = amount;
    }
}

