package com.example.mygz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mygz.databinding.ActivityMainBinding;

public class MainActivity extends Activity {


//    private Button fab;
//    private Button bt_Equipment_preheating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fab = findViewById(R.id.button00);
        Button func1 = findViewById(R.id.func1);
        Button func2 = findViewById(R.id.func2);
        Button func3 = findViewById(R.id.func3);
        Button func4 = findViewById(R.id.func4);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "这个是测试", Toast.LENGTH_SHORT).show();
            }
        });

        func1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EquipmentPreheatingActivity.class);
                startActivity(intent);
            }
        });
        func2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EquipmentPreheatingActivity.class);
                startActivity(intent);
            }
        });
        func3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EquipmentPreheatingActivity.class);
                startActivity(intent);
            }
        });
        func4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EquipmentPreheatingActivity.class);
                startActivity(intent);
            }
        });

    }
}