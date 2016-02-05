package com.nisaechoi.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // AppCompatActivity

    private TextView mTextview;
    private EditText mNameEditText;
    private EditText mAgeEditText;

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
        // 아래랑 위는 동일함

        findViewById(R.id.next_activity).setOnClickListener(this);
        mNameEditText = (EditText) findViewById(R.id.name_edit);
        mAgeEditText = (EditText) findViewById(R.id.age_edit);



//        mTextview = (TextView) findViewById(R.id.msg_text_view);
//        ((CheckBox) findViewById(R.id.checkbox1)).setOnCheckedChangeListener(this);


    }

    @Override
    public void onClick(View v) {
        // 다음 액티비티로 이동할때 이렇게 함.
        // SecondActivity 로 전환하겠다는 intent
        Intent intent = new Intent(this, SecondActivity.class);
        // 가져와서 인텐트에 추가함!
        intent.putExtra("name", mNameEditText.getText().toString());
        intent.putExtra("age", mAgeEditText.getText().toString());

        // intent의 정보를 토대로 다른 Activity를 시작함.
        startActivity(intent);
    }

    // 안드로이드의 4대 구성요소
    // 1.Activity (화면을 구성)
    //   - Textview , CheckBox , Imageview , Button , Scrollview
    // 2.Broadcast Reciver (각 방송을 수신함)
    // 3.Service (화면이 없는 Activity)
    // 4. content provider (컨텐츠 제공자 , DB를 공유함)

//    @Override
//    public void onClick(View v) {
//        if (v.getId() == R.id.button2) {
//            Toast.makeText(MainActivity.this, "잘됨", Toast.LENGTH_SHORT).show();
//        } else if (v.getId() == R.id.button1) {
//            Toast.makeText(MainActivity.this, "엄청 잘됨", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    @Override
//    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        Toast.makeText(MainActivity.this, "check" + isChecked, Toast.LENGTH_SHORT).show();
//        if (isChecked) {
//            mTextview.setText("체크됨");
//            mTextview.setVisibility(View.VISIBLE);
//        } else {
//            mTextview.setText("");
//            mTextview.setVisibility(View.INVISIBLE);
//        }
//    }
}
