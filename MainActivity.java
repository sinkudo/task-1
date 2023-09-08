package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText et1 = findViewById(R.id.numA);
        EditText et2 = findViewById(R.id.numB);
        String stA = et1.getText().toString();
        String stB = et2.getText().toString();
        TextView tsum = findViewById(R.id.sum);
        if (stA.isEmpty() || stB.isEmpty()) {
            tsum.setText("");
            return;
        }
        int sum = Integer.parseInt(stA) + Integer.parseInt(stB);
        tsum.setText(Integer.toString(sum));
    }
}