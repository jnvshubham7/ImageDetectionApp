package com.shubham.imagedetectionapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    Button selectButton;

    Button uploadButton;

    Button showUploadsButton;

    ImageView image;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}