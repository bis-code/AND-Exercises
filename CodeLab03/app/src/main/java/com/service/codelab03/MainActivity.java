package com.service.codelab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sendButton;
    EditText editText;
    TextView replyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = findViewById(R.id.sendButton);
        editText = findViewById(R.id.sendText);
        replyText = findViewById(R.id.replyText);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            String data = bundle.getString("reply");
            replyText.setText(data);
        }
        else{
            replyText.setText("No message received..");
        }
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("message",editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}