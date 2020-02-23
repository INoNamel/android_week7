package com.example.text_input;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Submit extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        String error = "wrong format";
        TextView showName = findViewById(R.id.submitName);
        TextView showNumber = findViewById(R.id.submitNumber);

        if (extras != null) {
                if(extras.getString("name") != null ) {
                    String name = extras.getString("name");
                    showName.setText(name);
                } else {
                    showName.setText(error);
                }
                int number = extras.getInt("number");
                showNumber.setText(String.valueOf(number));
        }

        btnReturn = findViewById(R.id.back);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });


    }
}
