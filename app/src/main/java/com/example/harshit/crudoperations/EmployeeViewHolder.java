package com.example.harshit.crudoperations;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Harshit on 30-05-2017.
 */

class EmployeeViewHolder extends RecyclerView.ViewHolder {
    TextView employee;
    public EmployeeViewHolder(View itemView) {
        super(itemView);
        employee=(TextView)itemView.findViewById(R.id.list_employee);
    }
}
