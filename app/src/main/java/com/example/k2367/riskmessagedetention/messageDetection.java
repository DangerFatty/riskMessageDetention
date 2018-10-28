package com.example.k2367.riskmessagedetention;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class messageDetection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detection);
    }
    protected void btnSubmit_click(View v){
        Intent intent = new Intent();
        intent.setClass(messageDetection.this , test.class);
        startActivity(intent);
    }
}
