package com.example.dz5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnNext;
    private EditText tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.bt_button);
        tvText = findViewById(R.id.email_tv);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvText.getText().toString();
                if (text.equals("ibrahim")) {
                    Toast.makeText(MainActivity.this,
                            "Eltai get", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}