package database;

import androidx.annotation.NonNull;

public class ExpenseEntity {
    public int id;
    public String expenseName;
    public String expenseDate;
    public String expenseType;
    public String amount;

    public ExpenseEntity() {

    }
    @NonNull
    @Override
    public String toString() {
        return this.expenseName + "\n" + this.expenseDate + "\n" + this.amount;

    }

    public ExpenseEntity(int id, String expenseName, String expenseDate, String expenseType, String amount) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseDate = expenseDate;
        this.expenseType = expenseType;
        this.amount = amount;
    }
}

