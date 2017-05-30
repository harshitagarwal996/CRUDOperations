package com.example.harshit.crudoperations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addEmployee(View view)
    {
        Intent intent =new Intent(this,AddEmployee.class);
        Log.d("Harshit","In Main Activity");
        startActivity(intent);
    }
    public void getAllEmployee(View view)
    {
        Intent intent =new Intent(this,GetAllEmployee.class);
        Log.d("Harshit","In getAllEmployeeFunction");
        startActivity(intent);
    }
}