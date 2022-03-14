package com.example.codelab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.enterYourMessage);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.replyMessage);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            String replyMessage = bundle.getString("reply");
            textView.setText(replyMessage);
        }


        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("message",editText.getText().toString());
            startActivity(intent);
        });


    }
}