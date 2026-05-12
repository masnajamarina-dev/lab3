package com.example.omgtulab3;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {

    private int currentImageIndex = 0;

    private final int[] images = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        ImageView mainImageView = findViewById(R.id.mainImageView);
        ImageButton changeImageButton = findViewById(R.id.changeImageButton);

        changeImageButton.setOnClickListener(v -> {
            currentImageIndex++;

            if (currentImageIndex >= images.length) {
                currentImageIndex = 0;
            }

            mainImageView.setImageResource(images[currentImageIndex]);
        });
    }
}