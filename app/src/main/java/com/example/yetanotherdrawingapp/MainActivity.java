package com.example.yetanotherdrawingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startDrawingButton;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startDrawingButton = findViewById(R.id.startDrawingButton);
        startDrawingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawingActicity();
            }
        });

        exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitActivity();
            }
        });
    }

    private void exitActivity() {
        finish();
        System.exit(0);
    }

    private void openDrawingActicity() {
        Intent intent = new Intent(this, DrawingActivity.class);
        startActivity(intent);
    }
}
