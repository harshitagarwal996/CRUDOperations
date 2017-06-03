package com.example.harshit.crudoperations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class GetAllEmployee extends AppCompatActivity {
    ArrayList<Employee> employeeList=new ArrayList<Employee>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_all_employee);
        Log.d("Harshit","in GetAllEmployee onCreate");
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view_all_employee_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList);
        recyclerView.setAdapter(employeeAdapter);

        Log.d("Harshit","I am here");

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        String url=Config.URL_GET_ALL;
        JsonObjectRequest request=new JsonObjectRequest(url,new JSONObject(), new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("Harshit",response.toString());
                employeeList.clear();
                try{
                    if (response.length()>0){
                        JSONArray jsonArray=response.getJSONArray("result");
                        for(int i=0;i<jsonArray.length();i++){
                            JSONObject jsonObject=jsonArray.getJSONObject(i);
                            Log.d("Harshit",jsonObject.getString("name").toString());
                            Employee employee=new Employee();
                            if (!jsonObject.isNull("name")) {
                                employee.name=jsonObject.getString("name");
                                employee.designation=jsonObject.getString("desg");
                                employee.salary=jsonObject.getString("salary");
                            }
                            employeeList.add(employee);
                            Log.d("Harshit","reached here");
                        }
                        employeeAdapter.notifyDataSetChanged();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Harshit", error.toString());

            }
        });
        requestQueue.add(request);
        Log.d("Harshit","After request queue");
    }
    }

