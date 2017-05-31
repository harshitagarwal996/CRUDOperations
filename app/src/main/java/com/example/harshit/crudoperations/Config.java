package com.example.harshit.crudoperations;

import java.net.UnknownHostException;

/**
 * Created by Harshit on 28-05-2017.
 */

public class Config {
    //URL's to be used for CRUD operations
    public static final String URL_ADD="http://192.168.43.196/Harshit/addEmp.php";
    public static final String URL_GET_ALL = "http://192.168.43.196/Harshit/getAllEmp.php";
    public static final String URL_GET_EMP = "http://192.168.43.196/Harshit/getEmp.php";
    public static final String URL_UPDATE_EMP = "http://192.168.43.196/Harshit/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.196/Harshit/deleteEmp.php";

    //Headers are defined here
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    public Config() throws UnknownHostException {
    }
}
