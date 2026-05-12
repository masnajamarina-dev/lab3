package com.example.omgtulab3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        EditText messageEditText = findViewById(R.id.messageEditText);
        Button sendButton = findViewById(R.id.sendButton);
        LinearLayout messagesContainer = findViewById(R.id.messagesContainer);

        sendButton.setOnClickListener(v -> {
            String message = messageEditText.getText().toString();

            if (!message.isEmpty()) {
                TextView textView = new TextView(ConstraintActivity.this);
                textView.setText(message);
                textView.setTextSize(18);
                textView.setPadding(8, 8, 8, 8);

                messagesContainer.addView(textView);
                messageEditText.setText("");
            }
        });
    }
}