package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class BlowSucessActivity extends Activity {


    private TextView yes_text;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blowsucessactivity);

//        yes_text = findViewById(R.id.yes_text);
//
//        yes_text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(BlowSucessActivity.this, "吹气成功", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(BlowSucessActivity.this,ResultDisplayActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//
//
//    }
//}

        new Handler().postDelayed(r, 2000);

    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(BlowSucessActivity.this,ResultDisplayActivity.class);
            startActivity(intent);
            finish();
        }
    };
}