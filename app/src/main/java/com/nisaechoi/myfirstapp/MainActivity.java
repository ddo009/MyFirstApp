package com.nisaechoi.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // AppCompatActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 부모꺼 가지고 오고
        super.onCreate(savedInstanceState);
        // 추가한거임. 여기서부터 우리가 작성할 부분
        // 아래 쪽의 setContentview 는 Layout 표시하는거임.
        // R.layout.activity_main = activity_main을 가르키는거임
        // R은 res폴더랑 연결됨 리소스에 접근시에 R. 을 이용함.
        setContentView(R.layout.practice);
        // onCreate = main 메소드임

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        // 아래랑 위는 동일함

        findViewById(R.id.button1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button2){
        Toast.makeText(MainActivity.this, "잘됨", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.button1){
        Toast.makeText(MainActivity.this, "엄청 잘됨", Toast.LENGTH_SHORT).show();
        }
    }
}
