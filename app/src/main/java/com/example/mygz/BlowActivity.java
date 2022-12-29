package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class BlowActivity extends Activity {

//    private Button startblow;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blowactivity);
        try {
            Thread.sleep(2000);
            Intent intent = new Intent(BlowActivity.this,BlowSucessActivity.class);
            startActivity(intent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Toast.makeText(BlowActivity.this, "吹气成功", Toast.LENGTH_SHORT).show();

    }
}