package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputA = (EditText) findViewById(R.id.inputA);
        EditText inputB = (EditText) findViewById(R.id.inputB);

        Button swap = (Button) findViewById(R.id.swapbtn);
        Button check = (Button) findViewById(R.id.compbtn);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                String textA = inputA.getText().toString();
                String textB = inputB.getText().toString();
                i.putExtra("InputA", textA);
                i.putExtra("InputB", textB);
                startActivity(i);

            }
        });

    }
}