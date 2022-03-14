package com.example.codelab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.outputMessage);
        EditText editText = findViewById(R.id.replyYourMessage);

        Bundle bundle = getIntent().getExtras();
        String messageReceived = bundle.getString("message");
        textView.setText(messageReceived);

        Button button = findViewById(R.id.reply);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("reply",editText.getText().toString());
            startActivity(intent);
        });
    }
}