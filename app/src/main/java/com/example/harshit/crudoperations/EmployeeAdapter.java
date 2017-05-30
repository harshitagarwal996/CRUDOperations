package com.example.harshit.crudoperations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Harshit on 30-05-2017.
 */

class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewHolder> {

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=(LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.recycler_view_employee_list,parent,false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.employee.setText("finally here");

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
