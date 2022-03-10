package com.service.codelab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    Button sendButton;
    EditText editText;
    TextView replyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sendButton = findViewById(R.id.replyButton);
        editText = findViewById(R.id.reply);
        replyText = findViewById(R.id.textReply);

        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("message");
        replyText.setText(data);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("reply",editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}