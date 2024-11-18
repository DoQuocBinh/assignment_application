package com.example.assignment_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import database.DatabaseHelper;
import database.ExpenseEntity;

public class ListExpenses extends AppCompatActivity {
    List<ExpenseEntity> allExpense;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_expenses);

        DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());

        allExpense = dbHelper.getAllExpenses();
        ArrayAdapter adapter = new ArrayAdapter<ExpenseEntity>(this,
                R.layout.listview_item, allExpense);
        ListView listView = (ListView) findViewById(R.id.listview1);
        listView.setAdapter(adapter);
    }
}