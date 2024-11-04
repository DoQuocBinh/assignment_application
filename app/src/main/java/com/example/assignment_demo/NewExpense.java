package com.example.assignment_demo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class NewExpense extends AppCompatActivity {

    public static class DatePickerFragment extends DialogFragment implements
            DatePickerDialog.OnDateSetListener{

        public EditText editText;
        @NonNull
        @Override
        public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(requireContext(),
                    this, year, month, day);
        }

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            editText.setText(dayOfMonth + "/" + month + "/" + year);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_expense);

        EditText expenseDate = findViewById(R.id.editTextDate);
        expenseDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerFragment datePicker = new DatePickerFragment();
                datePicker.editText = expenseDate;
                datePicker.show(getSupportFragmentManager(), "datePicker");
            }
        });
        Button btSave = findViewById(R.id.button);
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText expenseNameControl = findViewById(R.id.editName);
                String expenseName = expenseNameControl.getText().toString();

                Spinner expenseTypeControl = findViewById(R.id.expenseType);
                String expenseType  = expenseTypeControl.getSelectedItem().toString();

                EditText expenseAmountControl = findViewById(R.id.editAmount);
                String expenseAmount = expenseAmountControl.getText().toString();

                EditText expenseDateControl = findViewById(R.id.editTextDate);
                String expenseDate = expenseDateControl.getText().toString();

            }
        });

    }
}