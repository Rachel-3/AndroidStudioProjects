package com.example.fourbutton;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setBackgroundColor(Color.LTGRAY);
        button2.setBackgroundColor(Color.GREEN);
        button3.setBackgroundColor(Color.RED);
        button4.setBackgroundColor(Color.YELLOW);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "네이버에 접속합니다.", Toast.LENGTH_SHORT).show();
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(mintent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "911 응급전화 걸기.", Toast.LENGTH_SHORT).show();
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mintent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "갤러리 열기", Toast.LENGTH_SHORT).show();
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mintent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "앱을 종료합니다.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });



    }
}