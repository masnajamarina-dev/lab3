package com.example.omgtulab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setPadding(40, 40, 40, 40);

        Button linearButton = new Button(this);
        linearButton.setText("LinearLayout Chat");

        Button constraintButton = new Button(this);
        constraintButton.setText("ConstraintLayout Chat");

        Button frameButton = new Button(this);
        frameButton.setText("FrameLayout Image Viewer");

        mainLayout.addView(linearButton);
        mainLayout.addView(constraintButton);
        mainLayout.addView(frameButton);

        setContentView(mainLayout);

        linearButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinearActivity.class);
            startActivity(intent);
        });

        constraintButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ConstraintActivity.class);
            startActivity(intent);
        });

        frameButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameActivity.class);
            startActivity(intent);
        });
    }
}