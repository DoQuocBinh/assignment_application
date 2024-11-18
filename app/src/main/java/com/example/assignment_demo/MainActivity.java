package com.example.assignment_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle item selection.
        if (item.getItemId() == R.id.newExpense) {
            Intent intent = new Intent(MainActivity.this, NewExpense.class);
            startActivity(intent);
        }
        else if (item.getItemId()== R.id.listExpenses){
            Intent intent = new Intent(MainActivity.this, ListExpenses.class);
            startActivity(intent);
        }

        return true;
    }

}