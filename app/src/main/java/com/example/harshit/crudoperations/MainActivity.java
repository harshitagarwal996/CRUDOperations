package com.example.harshit.crudoperations;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int CAMERA_PIC_REQUEST =1;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addEmployee(View view) {
        Intent intent = new Intent(this, AddEmployee.class);
        Log.d("Harshit", "In Main Activity");
        startActivity(intent);
    }

    public void getAllEmployee(View view) {
        Intent intent = new Intent(this, GetAllEmployee.class);
        Log.d("Harshit", "In getAllEmployeeFunction");
        startActivity(intent);
    }

    public void getEmployee(View view) {
        Intent intent = new Intent(this, GetEmployee.class);
        Log.d("Harshit", "In getEmployeeFunction");
        startActivity(intent);
    }

    public void deleteEmployee(View view) {
        Intent intent = new Intent(this, DeleteEmployee.class);
        Log.d("Harshit", "In deleteEmployeeFunction");
        startActivity(intent);
    }

    public void openGallery(View view) {
        Log.d("Harshit", "In deleteEmployeeFunction");
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(Intent.createChooser(intent,"Select Gallery"),2);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("Harshit","finally here");
    }
}