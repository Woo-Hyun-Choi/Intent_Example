package net.hutek.intent_example;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);

        Intent intent = getIntent();
        int left = intent.getIntExtra("left", 1);
        int right = intent.getIntExtra("right", 2);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.format("%d + %d = %d", left, right, left + right));
    }
}