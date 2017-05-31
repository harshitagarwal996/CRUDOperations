package com.example.harshit.crudoperations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class GetAllEmployee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_all_employee);
        Log.d("Harshit","in GetAllEmployee onCreate");
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view_all_employee_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        EmployeeAdapter employeeAdapter = new EmployeeAdapter();
        recyclerView.setAdapter(employeeAdapter);
        employeeAdapter.VolleyResultArray(this);
    }
}
