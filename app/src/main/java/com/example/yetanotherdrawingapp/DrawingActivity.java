package com.example.yetanotherdrawingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrawingActivity extends AppCompatActivity {

    DrawingCanvas drawingCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);
        drawingCanvas = new DrawingCanvas(this, null);
        setContentView(drawingCanvas);
    }
}
