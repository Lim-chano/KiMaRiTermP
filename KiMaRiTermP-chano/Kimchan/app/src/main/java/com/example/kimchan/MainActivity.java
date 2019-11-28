package com.example.kimchan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text_1 = findViewById(R.id.text_1);
        TextView text_2 = findViewById(R.id.text_2);
        TextView text_3 = findViewById(R.id.text_3);

        text_1.setText("안녕하세요");
        text_1.setText("저희는");
        text_1.setText("임찬호 김상민입니다.");


    }
}
