package com.example.text_input;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;
    int number;

    EditText nameInput, numberInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.nameInput);
        numberInput = findViewById(R.id.numberInput);

        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    name = nameInput.getText().toString();
                    number = Integer.valueOf(numberInput.getText().toString());

                    Intent submit = new Intent(MainActivity.this, Submit.class);

                    submit.putExtra("name",name);
                    submit.putExtra("number",number);
                    startActivity(submit);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }
        });
    }


}
