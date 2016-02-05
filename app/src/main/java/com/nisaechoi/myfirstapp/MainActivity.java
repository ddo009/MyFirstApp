package com.nisaechoi.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    // AppCompatActivity

    private TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 부모꺼 가지고 오고
        super.onCreate(savedInstanceState);
        // 추가한거임. 여기서부터 우리가 작성할 부분
        // 아래 쪽의 setContentview 는 Layout 표시하는거임.
        // R.layout.activity_main = activity_main을 가르키는거임
        // R은 res폴더랑 연결됨 리소스에 접근시에 R. 을 이용함.
        setContentView(R.layout.practice3);
        // onCreate = main 메소드임
        // 아래랑 위는 동일함


        mTextview = (TextView) findViewById(R.id.msg_text_view);
        ((CheckBox) findViewById(R.id.checkbox1)).setOnCheckedChangeListener(this);


    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button2) {
            Toast.makeText(MainActivity.this, "잘됨", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button1) {
            Toast.makeText(MainActivity.this, "엄청 잘됨", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Toast.makeText(MainActivity.this, "check" + isChecked, Toast.LENGTH_SHORT).show();
        if (isChecked) {
            mTextview.setText("체크됨");
            mTextview.setVisibility(View.VISIBLE);
        } else {
            mTextview.setText("");
            mTextview.setVisibility(View.INVISIBLE);
        }
    }
}
