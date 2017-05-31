package com.example.harshit.crudoperations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Harshit on 28-05-2017.
 */

public class AddEmployee extends AppCompatActivity {
    private String url;
    private String nameurl;
    private String desgurl;
    private String salaryurl;

    private EditText employeeName;
    private EditText designation;
    private EditText salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Harshit","Add employee");
        setContentView(R.layout.activity_add_employee);
        employeeName=(EditText)findViewById(R.id.edittext_add_employee);
        designation=(EditText)findViewById(R.id.edittext_add_designation);
        salary=(EditText)findViewById(R.id.edittext_add_salary);
        }
    public void onSubmit(View view) {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        nameurl=Config.URL_ADD+"?"+"name="+employeeName.getText().toString();
        desgurl="&desg="+designation.getText().toString();
        salaryurl="&salary="+salary.getText().toString();
        url=nameurl+desgurl+salaryurl;
        String finalUrl="";
        for(int i=0;i<url.length();i++)
            if(url.charAt(i)!=' ')
                finalUrl+=url.charAt(i);
        Log.d("Harshit",finalUrl);
        StringRequest request=new StringRequest(Request.Method.POST, finalUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("Harshit",response);
                TextView textView=(TextView)findViewById(R.id.add_employee_result);
                textView.setText(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d("Harshit","some error occured");
                TextView textView=(TextView)findViewById(R.id.add_employee_result);
                textView.setText(error.toString());
            }
        });
        requestQueue.add(request);
    }

}
