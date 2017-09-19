package com.patrick.a4itb_sept19_alert2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = (Button) findViewById(R.id.btn_login);
    }

    public void showCustomDialog (View view) {
        CustomDialog customDialog = new CustomDialog();
        customDialog.show(getSupportFragmentManager(), "dialog_layout");
    }

}
