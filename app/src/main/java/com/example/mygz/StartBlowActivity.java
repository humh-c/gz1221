package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class StartBlowActivity extends Activity {

    private Button startblow;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startblowactivity);
        startblow = findViewById(R.id.startblow);

        startblow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartBlowActivity.this,BlowActivity.class);
                startActivity(intent);
            }
        });

//        Intent intent = new Intent(StartBlowActivity.this,StartBlowActivity.class);
//        startActivity(intent);
    }
}