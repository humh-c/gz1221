package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
//        try {
//            Thread.sleep(2000);
//            Intent intent = new Intent(BlowActivity.this,BlowSucessActivity.class);
//            startActivity(intent);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
        new Handler().postDelayed(r, 2000);

    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(BlowActivity.this,BlowSucessActivity.class);
            startActivity(intent);
            finish();
        }
    };
}