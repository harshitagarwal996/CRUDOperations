package com.example.harshit.crudoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class DeleteEmployee extends AppCompatActivity {
    private String url;
    private String nameurl;
    private String desgurl;
    private String salaryurl;

    private EditText employeeId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_employee);
        employeeId=(EditText)findViewById(R.id.edittext_add_id);

    }
    public void onSubmit(View view) {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        String finalUrl=Config.URL_DELETE_EMP+"?"+"id="+employeeId.getText().toString();
        Log.d("Harshit",finalUrl);
        StringRequest request=new StringRequest(Request.Method.GET, finalUrl, new Response.Listener<String>() {
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
