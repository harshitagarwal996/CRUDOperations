package com.example.harshit.crudoperations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Harshit on 30-05-2017.
 */

class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewHolder> {
    public String responseString;
    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.recycler_view_employee_list, parent, false);
        return new EmployeeViewHolder(view);
    }

    public void VolleyResultArray(Context context)
    {
        Log.d("Harshit","I am here");
        RequestQueue requestQueue= Volley.newRequestQueue(context);
        String url=Config.URL_GET_ALL;
        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONObject object;
                try {
                    object=new JSONObject(response);
                    JSONArray array = object.getJSONArray("result");
                    Log.d("Harshit",array.toString());
                } catch (JSONException e) {
                    Log.d("Harshit","Error occured");

                }

                responseString=response;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);
    }
    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        String s="string value not found";
        holder.employee.setText(s);

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
