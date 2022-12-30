package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class EquipmentPreheatingActivity extends Activity {

    private TextView loding;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.equipmentpreheatingactivity);
//        loding = findViewById(R.id.loding);
        new Handler().postDelayed(r, 2000);

    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(EquipmentPreheatingActivity.this,StartBlowActivity.class);
            startActivity(intent);
            finish();
        }
    };
}