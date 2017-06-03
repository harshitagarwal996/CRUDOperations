package com.example.harshit.crudoperations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Harshit on 30-05-2017.
 */
class Employee{
    String name;
    String designation;
    String salary;
}

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {
    List<Employee> employee;
    EmployeeAdapter(List<Employee> employee){
        this.employee=employee;
    }
    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.recycler_view_employee_list, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.employeeListName.setText(employee.get(position/2).name);//employee.get(position).name.toString());
        holder.employeeListDesignation.setText(employee.get(position/2).designation);//employee.get(position).name.toString());
        holder.employeeListSalary.setText(employee.get(position/2).salary.toString());//employee.get(position).name.toString());

        holder.employeeListName2.setText(employee.get(position/2+1).name);//employee.get(position).name.toString());
        holder.employeeListDesignation2.setText(employee.get(position/2+1).designation);//employee.get(position).name.toString());
        holder.employeeListSalary2.setText(employee.get(position/2+1).salary.toString());
    }

    @Override
    public int getItemCount() {
        if (employee != null) {
            return employee.size();
        }
        return 0;
    }


    public static class EmployeeViewHolder extends RecyclerView.ViewHolder {
        TextView employeeListName;
        TextView employeeListName2;
        TextView employeeListDesignation;
        TextView employeeListDesignation2;
        TextView employeeListSalary;
        TextView employeeListSalary2;

        public EmployeeViewHolder(View itemView) {
            super(itemView);
            employeeListName=(TextView)itemView.findViewById(R.id.list_employee_name);
            employeeListName2=(TextView)itemView.findViewById(R.id.list_employee_name2);
            employeeListDesignation=(TextView)itemView.findViewById(R.id.list_employee_designation);
            employeeListDesignation2=(TextView)itemView.findViewById(R.id.list_employee_designation2);
            employeeListSalary=(TextView)itemView.findViewById(R.id.list_employee_salary);
            employeeListSalary2=(TextView)itemView.findViewById(R.id.list_employee_salary2);
        }
    }
}
