package com.example.lux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_id, TextInputEditText_password;
    RelativeLayout RelativeLayout_login;
    LinearLayout LinearLayout_register;
    LinearLayout intent_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText_id = findViewById(R.id.TextInputEditText_id);
        TextInputEditText_password = findViewById(R.id.TextInputEditText_password);
        TextInputEditText_password = findViewById(R.id.TextInputEditText_name);
        RelativeLayout_login = findViewById(R.id.RelativeLayout_login);
        LinearLayout_register = findViewById(R.id.LinearLayout_register);

        //1. 값을 가져온다.
        //2. 클릭을 감지한다.
        //3. 1번의 값을 다음 액티비티로 넘긴다.




        LinearLayout_register.setClickable(true);
        LinearLayout_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);

                startActivity(intent);
            }
        });


    }
}
