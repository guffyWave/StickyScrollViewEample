package com.example.gufran.stickyscrollviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button appleButton, ballButton, catButton, dogButton, elephantButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appleButton = (Button) findViewById(R.id.appleButton);
        catButton = (Button) findViewById(R.id.catButton);
        dogButton = (Button) findViewById(R.id.dogButton);
        ballButton = (Button) findViewById(R.id.ballButton);
        elephantButton = (Button) findViewById(R.id.elephantButton);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = ((Button) view).getText().toString();
                Toast.makeText(MainActivity.this, text + " clicked", Toast.LENGTH_SHORT).show();
            }
        };

        appleButton.setOnClickListener(clickListener);
        ballButton.setOnClickListener(clickListener);
        dogButton.setOnClickListener(clickListener);
        elephantButton.setOnClickListener(clickListener);
        catButton.setOnClickListener(clickListener);
    }
}
