package com.example.harshit.crudoperations;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Harshit on 30-05-2017.
 */

public class VolleyRequestClass {
    //may have an error due to static
    public static RequestQueue newRequestQueue(Context context) {
        return Volley.newRequestQueue(context);
    }

}
