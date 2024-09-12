package com.example.c068buttonview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // the code will be excuted when the button is clicked
                Toast.makeText(MainActivity.this,
                        "You clicked Button !!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}