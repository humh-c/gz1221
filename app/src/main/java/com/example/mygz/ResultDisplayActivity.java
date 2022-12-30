package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ResultDisplayActivity extends Activity {


    private TextView result;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultdisplayactivity);

        result = findViewById(R.id.result);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ResultDisplayActivity.this, "吹气成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ResultDisplayActivity.this,BlowFailActivity.class);
                startActivity(intent);

            }
        });
    }
}