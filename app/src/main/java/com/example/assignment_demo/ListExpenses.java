package com.example.assignment_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle item selection.
        if (item.getItemId() == R.id.newExpense) {
            Intent intent = new Intent(ListExpenses.this, NewExpense.class);
            startActivity(intent);
        }
        else if (item.getItemId()== R.id.listExpenses){
            Toast.makeText(getApplicationContext(),"You already here",Toast.LENGTH_LONG).show();
        }

        return true;
    }
}