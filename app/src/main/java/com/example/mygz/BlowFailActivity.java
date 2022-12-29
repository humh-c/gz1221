package com.example.mygz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class BlowFailActivity extends Activity {


    private Button restartblow;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blowfailactivity);

        restartblow = findViewById(R.id.restartblow);

        restartblow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BlowFailActivity.this, "重新测试", Toast.LENGTH_SHORT).show();
            }
        });


//        Intent intent = new Intent(BlowSucessActivity.this,BlowSucessActivity.class);
//        startActivity(intent);
    }
}