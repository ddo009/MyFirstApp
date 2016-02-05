package com.nisaechoi.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by donghaechoi on 2016. 2. 5..
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mNameTextView;
    private TextView mAgeTextView;

    @Override // 이 안에다가 적어야됌.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_second);
        // second activity와 연결
        mNameTextView = (TextView) findViewById(R.id.name_text_view);
        mAgeTextView = (TextView) findViewById(R.id.age_text_view);
        findViewById(R.id.exit_button).setOnClickListener(this);


        // 나를 호출한 intent를 얻는다
        Intent intent = getIntent();
        if (intent != null) {
            // 이름과 나이를 얻어서 세팅한다.
            String name = intent.getStringExtra("name");
            String age = intent.getStringExtra("age");
            mNameTextView.setText(mNameTextView.getText().toString() + name);
            mAgeTextView.setText(mAgeTextView.getText().toString() + age);

        }

    }

    @Override
    public void onClick(View v) {
        // 현재 Activity 종료 / 뒤로 버튼이랑 동일한 기능.
        // Activity 는 stack임 하나씩 쌓여나가고 선입후출 구조를 가졌음.
        Toast.makeText(SecondActivity.this, "종료합니다.", Toast.LENGTH_SHORT).show();
        finish();
    }
}
