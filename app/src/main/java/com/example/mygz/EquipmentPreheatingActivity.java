package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
        loding = findViewById(R.id.loding);

        loding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loding.setText("加载完成，马上开始检测");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(EquipmentPreheatingActivity.this,StartBlowActivity.class);
                startActivity(intent);
            }
        });



    }
}