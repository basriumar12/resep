package com.blogbasbas.myresep.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MyFunction extends AppCompatActivity {
    //variabel
    public Context con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_my_function);
        //memberkikan fungsi bahwa context con yaitu class Myfunction
        con=MyFunction.this;

    }

    //fungi untuk kelas tujuan
    public void aksesclass (Class kelastujuan){

        startActivity(new Intent(con, kelastujuan));
    }
    //memunculkan pesan
    public void pesan (String isipesan){
        Toast.makeText(con, isipesan , Toast.LENGTH_SHORT).show();
    }
    //munculkan alert
    public void alertdialog (String message){
        AlertDialog.Builder builder = new  AlertDialog.Builder(con);
        builder.setTitle("informasi");

    }
}
