package com.nisaechoi.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // AppCompatActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 부모꺼 가지고 오고
        super.onCreate(savedInstanceState);
        // 추가한거임. 여기서부터 우리가 작성할 부분
        // 아래 쪽의 setContentview 는 Layout 표시하는거임.
        // R.layout.activity_main = activity_main을 가르키는거임
        // R은 res폴더랑 연결됨 리소스에 접근시에 R. 을 이용함.
        setContentView(R.layout.activity_main);
        // onCreate = main 메소드임
    }
}
